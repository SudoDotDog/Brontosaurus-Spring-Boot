package dog.sudo.brontosaurus.sdk;

import org.junit.Assert;
import org.junit.Test;

public class BrontosaurusTest {

    @Test
    public void testBrontosaurusValidate() {

        Brontosaurus shouldBeTrue = Brontosaurus.fromBearer("bearer a.b.c");
        Brontosaurus shouldBeFalse1 = Brontosaurus.fromBearer("a.b.c");
        Brontosaurus shouldBeFalse2 = Brontosaurus.fromBearer("bearer a.b");

        Assert.assertTrue(shouldBeTrue.validate());
        Assert.assertFalse(shouldBeFalse1.validate());
        Assert.assertFalse(shouldBeFalse2.validate());
    }

    @Test
    public void testCreateToken() {

        Brontosaurus target = Brontosaurus.fromBearer("bearer e30=.e30=.null");
        Assert.assertTrue(target.validate());

        Token token = target.token();
        Assert.assertEquals(token.getBodyString(), "{}");
    }
}
