package dog.sudo.brontosaurus.sdk;

import java.util.List;

public class Token {

    private String header;
    private String body;
    private String signature;

    public Token(String raw) {

        List<String> list = StringParser.extractRawToken(raw);

        if(list != null) {
            this.header = list.get(0);
            this.body = list.get(1);
            this.signature = list.get(2);
        }
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return this.header + this.body + this.signature;
    }
}
