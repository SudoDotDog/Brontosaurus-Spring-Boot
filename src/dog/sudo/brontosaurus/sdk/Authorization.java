package dog.sudo.brontosaurus.sdk;

public class Authorization {

    public static Authorization fromBearer(String authorization) {

        String rawToken = StringParser.extractAuthorizationHeader(authorization);

        return new Authorization(rawToken);
    }

    private String raw;

    private Authorization(String raw) {
        this.raw = raw;
    }

    public Token token(){
        return new Token(this.raw);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
