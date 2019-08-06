package dog.sudo.brontosaurus.sdk;

public class Brontosaurus {

    public static Brontosaurus fromBearer(String authorizationKey) {

        String[] split = authorizationKey.split(" ");

        if (split.length == 2) {
            return new Brontosaurus(split[1]);
        }
        return new Brontosaurus(null);
    }

    private String raw;

    private Brontosaurus(String raw) {

        this.raw = raw;
    }

    public boolean validate() {

        if (this.raw == null) {
            return false;
        }

        return Token.validate(this.raw);
    }

    public String getRaw() {

        return this.raw;
    }

    public Token token() {

        return Token.create(this.raw);
    }
}
