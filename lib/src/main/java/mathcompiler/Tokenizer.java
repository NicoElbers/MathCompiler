package mathcompiler;

/**
 * Tokenizer
 */
public class Tokenizer {
    private String sourceCode;
    private int currentPosition;
    private int readPosition;
    private char currentChar;

    public Tokenizer(String sourceCodeString) {
        sourceCode = sourceCodeString;

        advance();
    }

    public Token nextToken() {
        Token token;

        switch (currentChar) {
            case '+':
                token = new Token(TokenType.PLUS, String.valueOf(currentChar));
                break;
            case '-':
                token = new Token(TokenType.MINUS, String.valueOf(currentChar));
                break;
            case '*':
                token = new Token(TokenType.MULTIPLY, String.valueOf(currentChar));
                break;
            case '/':
                token = new Token(TokenType.DEVIDE, String.valueOf(currentChar));
                break;
            case '\0':
                token = new Token(TokenType.EOF, String.valueOf(currentChar));
                break;
            default:
                token = new Token(TokenType.ILLEGAL, String.valueOf(currentChar));
        }

        advance();

        return token;
    }

    private void advance() {
        if (readPosition >= sourceCode.length()) {
            currentChar = '\0';
        } else {
            currentChar = sourceCode.charAt(readPosition);
        }
        currentPosition = readPosition;
        readPosition++;
    }
}
