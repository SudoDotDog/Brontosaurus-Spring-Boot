package dog.sudo.brontosaurus.main;

import dog.sudo.brontosaurus.sdk.Authorization;
import dog.sudo.brontosaurus.sdk.Token;

public class Main {

    public static void main(String[] args) {
	    String test = "Bearer a.b.c";

        Authorization a = Authorization.fromBearer(test);
        Token t = a.token();

        System.out.println(t.toString());
    }
}
