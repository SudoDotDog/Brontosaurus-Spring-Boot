package dog.sudo.brontosaurus.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TokenTest {

    @Test
    public void testTokenCreation() {

        Token valid = Token.create("eyJoZWFkZXIiOiJoZWFkZXIifQ==.eyJ1c2VybmFtZSI6InVzZXJuYW1lIn0=.null");
        Token inValid = Token.create("");

        Assert.assertEquals(valid.getHeaderString(), "{\"header\":\"header\"}");
        Assert.assertEquals(valid.getBodyString(), "{\"username\":\"username\"}");
        Assert.assertEquals(inValid.getBodyString(), "{}");
    }

    @Test
    public void testTokenGetting() {

        Token token = Token.create("e30=.e30=.signature");

        Assert.assertEquals(token.getSignature(), "signature");
    }

    @Test
    public void testBodyElements() {

        Token token = Token.create("e30=.eyJ1c2VybmFtZSI6InVzZXJuYW1lIn0=.signature");

        Assert.assertEquals(token.getUsername(), "username");
    }

    @Test
    public void testGroupVerifying() {

        // GROUP: A,B,C,D
        Token token = Token.create("e30=.eyJncm91cHMiOlsiQSIsIkIiLCJDIiwiRCJdfQ.signature");

        Assert.assertTrue(token.hasGroup("A"));
        Assert.assertFalse(token.hasGroup("E"));

        Assert.assertTrue(token.hasGroups(Arrays.asList("A", "B", "D")));
        Assert.assertFalse(token.hasGroups(Arrays.asList("A", "K", "D")));
    }
}
