package mathcompiler;

/**
 * Token
 */
public class Token {

    private TokenType type;
    private String literal;

    public Token(TokenType tokenType, String literal) {
        this.type = tokenType;
        this.literal = literal;
    }

    public TokenType getType() {
        return type;
    }

    public String getLiteral() {
        return literal;
    }
}
