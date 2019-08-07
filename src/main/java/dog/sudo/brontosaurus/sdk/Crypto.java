package dog.sudo.brontosaurus.sdk;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Crypto {

    public static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    private String publicKey;

    public Crypto(String publicKey) {

        this.publicKey = publicKey;
    }

    public boolean verify(String value, String signed) {

        try {

            Signature verifySign = Signature.getInstance(SIGNATURE_ALGORITHM);

            PublicKey restoredKey = this.getPublicKey();
            verifySign.initVerify(restoredKey);

            byte[] bytes = signed.getBytes(StandardCharsets.UTF_8);
            byte[] decoded = Base64.getDecoder().decode(bytes);

            verifySign.update(value.getBytes());

            return verifySign.verify(decoded);

        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
            e.printStackTrace();
        }
        return false;
    }

    public PublicKey getPublicKey() {

        try {

            byte[] bytes = this.publicKey.getBytes(StandardCharsets.UTF_8);
            byte[] decoded = Base64.getDecoder().decode(bytes);

            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(decoded);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPublicKey pubKey = (RSAPublicKey) keyFactory.generatePublic(pubKeySpec);

            return pubKey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
