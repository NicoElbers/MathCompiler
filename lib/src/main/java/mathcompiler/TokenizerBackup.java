package mathcompiler;

/**
 * lexer
 */
public class TokenizerBackup {
    String stringSourceCode;

    TokenizerBackup(String sourceCode) {
        if (!sourceCode.endsWith("\0")) {
            sourceCode += "\0";
        }
        stringSourceCode = sourceCode;
    }

    public Token nextToken() {
        if (CharReaderBackup.isEOF(stringSourceCode)) {
            stringSourceCode = CharReaderBackup.consume(stringSourceCode);
            return new Token(TokenType.EOF, "\0");
        }

        char nextChar = CharReaderBackup.peek(stringSourceCode);
        switch (nextChar) {
            case '+':
                stringSourceCode = CharReaderBackup.consume(stringSourceCode);
                return new Token(TokenType.PLUS, "+");
            case '-':
                stringSourceCode = CharReaderBackup.consume(stringSourceCode);
                return new Token(TokenType.MINUS, "-");
            case '*':
                stringSourceCode = CharReaderBackup.consume(stringSourceCode);
                return new Token(TokenType.MULTIPLY, "*");
            case '/':
                stringSourceCode = CharReaderBackup.consume(stringSourceCode);
                return new Token(TokenType.DEVIDE, "/");
        }
        return new Token(TokenType.ILLEGAL, String.valueOf(nextChar));
    }
}
