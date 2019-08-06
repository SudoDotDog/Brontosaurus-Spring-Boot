package dog.sudo.brontsaurus.sdk;

import com.alibaba.fastjson.JSONObject;

public class Brontosaurus {

    public String plus(double a, double b){

        double sum = a + b;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sum",sum);

        return jsonObject.toJSONString();
    }
}
