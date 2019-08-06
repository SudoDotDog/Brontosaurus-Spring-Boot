package dog.sudo.brontosaurus.sdk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class Token {

    public static boolean validate(String raw) {

        String[] split = raw.split("\\.");
        return split.length == 3;
    }

    public static Token create(String raw) {

        if(Token.validate(raw)){
            return new Token(raw);
        }
        return new Token("e30=.e30=.null");
    }

    private JSONObject header;
    private JSONObject body;
    private String signature;

    private Token(String raw) {

        String[] split = raw.split("\\.");

        Base64.Decoder decoder = Base64.getDecoder();
        String decodedHeader = new String(decoder.decode(split[0]));
        String decodedBody = new String(decoder.decode(split[1]));

        this.header = JSON.parseObject(decodedHeader);
        this.body = JSON.parseObject(decodedBody);
        this.signature = split[2];
    }

    public String getHeaderString() {

        return this.header.toJSONString();
    }

    public String getBodyString() {

        return this.body.toJSONString();
    }

    public String getSignature() {

        return this.signature;
    }

    public String getUsername() {

        return this.body.getString("username");
    }

    public boolean hasGroup(String group) {

        List<String> currentGroups = this.body.getJSONArray("groups").toJavaList(String.class);
        return currentGroups.contains(group);
    }

    public boolean hasGroups(List<String> groups) {

        List<String> currentGroups = this.body.getJSONArray("groups").toJavaList(String.class);
        for(String group: groups){
            if(!currentGroups.contains(group)){
                return false;
            }
        }
        return true;
    }
}
