package dog.sudo.brontosaurus.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CryptoTest {

    @Test
    public void testVerifyToken() {

        Crypto crypto = new Crypto("" +
                "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA1guPbB1hprGis3ZiJouz" +
                "ai/hTCywg9FGFW9GO2Ib7DhVvy0IGHBYAWk3UzqV1QwS1/VcdLLeqceSKwCZe7kg" +
                "0D9eU5jrePtJ5BxLMibQa9m+Q0Fgxs2fdVYay9stpIXtL77eqweJKtxArSu5F8/0" +
                "zIHmM+DirKWMLhE7WuhxCrZDDs5HH7DsLRLBgO941mf91J4jM0bCxyUn+hWctqhI" +
                "fQvCV9l0bato683461AQNK8KKxjO6MyB3UjJABFFGlNfUKlvmWOFtrq42qzZXlvM" +
                "lZPfZD7qfubpph/yoFNNhE2QTh9G0X+xM9+D/YYDb8Z0/G/1uiUhWjr0bXTEiLn0" +
                "3RUk0tGtNi9dPogAP3VnREao2V1XBHtqifivVypYGMg8Bnb796ZYyRdoKiqFUDEw" +
                "S97SsaRF+YvtA6FTv0ipAO8JEjZkOXgnMix2qrcvTKsHipCRcsD4st7VcB+2HKQp" +
                "BuxHa9aVc21R/Xx9oXcwl8a7cUkmxagreyMmQj6zjmLS3+PXf+tKt3YLM9Fwp0NS" +
                "My9p2f69URdhf0YEsDrAd9zG+WcNy4117swAXoYZ47zBbH7jVi3+OgTEWhwVLS+V" +
                "ymgdsjVtm2Tx0RBYVhhs0eHFbLPOFz6y6sd5u+Y4QsC6AAXPJALMsoMqrE3UiYA9" +
                "4MzKqHHe9saa2bwtwhWZ8S8CAwEAAQ==" +
                "");


        Assert.assertTrue(crypto.verify(
                "eyJleHBpcmVBdCI6MTU2ODczMzM2ODg0NiwiaXNzdWVkQXQiOjE1NjUxMzMzNjg4NDYsImtleSI6IlJQTl9HTyIsImFsZyI6IlJTMjU2In0=.eyJ1c2VybmFtZSI6InRlc3QiLCJkaXNwbGF5TmFtZSI6InRlc3QiLCJtaW50IjoianhuZjhtdGIiLCJvcmdhbml6YXRpb24iOiJUZXN0T3JnIiwib3JnYW5pemF0aW9uVGFncyI6WyJIRUxMTyAxMjMxMiJdLCJncm91cHMiOlsiQlJPTlRPU0FVUlVTX1NFTEZfQ09OVFJPTCIsIkJST05UT1NBVVJVU19PUkdBTklaQVRJT05fQ09OVFJPTCIsIlZFTkRPUl9JTVBFUlNPTkFURSIsIkdPX01BTkFHRVIiXSwidGFncyI6WyJIRUxMTyAxMjMxMiJdLCJpbmZvcyI6e30sImJlYWNvbnMiOnt9fQ==",
                "T6Th6BhhS8jB7cn3Gx+AbyyMC8JlJzHxnV3Op5Tr5Z8cmsRumAmL1evfU0Bz+lendUfNTq9mWuNEGIkArAS0qpYBvK0WGUTAVt0ClQ0yhiPelFFdzlNlbde2wUeIs5mY35WDg4Tmp3Vz7En7RnXrLTb9S8u8g4amWRfA3eFyajZW5DEBzC7OHUI1ZQ20Cs/UsOSeqaWRJtFHAcH0Qv0mIZNzfViP9K1zCmcF85Q33IfBtNEWuwl2RnrCrAaOQnBXUodiZpdTEW3SQZM1O7bOM+p8OjaWMOdKC8T8HqeJWpNC+otPp3IEQTVk6jFDksBVbnfBcpdoUFh3Yac2sR5Q63oh2idtOgTphZiFhVaxPpztnLi8dX8WXtcenGkMY4gSJHJs3udB0w1QbDDN6/4dZnN4ZjA/BABMz+piNONt5ioOh/tbfvmI4HY9LB2LFBVf2oPGUzO6Hzg9Jo4+xl07Uup6jg34ooGw3QrzJsLFOtIvZ+1DP7rOQZSCMbEX4bIHoTgnGzpGxAI0SsmJNwkgywVbSRiUymL4VOnz09XV8CZsQ1ZZ5JB2/1N3ta00FEEYHaGXuBt6RVXmtvZ68el9mJNAKDqoayMd4YDvY69qQP7xqnOgfLzMX/tyjnFyqrisH8KHjIvhxKqTPLqBbv/JWpfd8kGvqGSu44rXNcBUJII="
        ));
    }
}
