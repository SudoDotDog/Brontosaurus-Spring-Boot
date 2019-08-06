package dog.sudo.brontosaurus.sdk;

import java.util.Arrays;
import java.util.List;

public class StringParser {

    public static String extractAuthorizationHeader(String authorizationHeader) {

        String[] split = authorizationHeader.split(" ");
        if(split.length == 2) {
            return split[1];
        }
        return split[0];
    }

    public  static List<String> extractRawToken(String raw) {

        return Arrays.asList("");
    }
}
