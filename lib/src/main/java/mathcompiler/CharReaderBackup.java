package mathcompiler;

/**
 * CharReader
 */
public class CharReaderBackup {
    public static char peek(final int steps, final String input) {
        if (steps >= input.length()) {
            return '\0';
        } else {
            return input.charAt(steps);
        }
    }

    public static char peek(final String input) {
        final int steps = 0;
        if (steps >= input.length()) {
            return '\0';
        } else {
            return input.charAt(steps);
        }
    }

    public static String consume(final int steps, final String input) {
        if (steps >= input.length()) {
            return "";
        } else {
            final String output = input.substring(steps);
            return output;
        }
    }

    public static String consume(final String input) {
        final int steps = 1;
        if (steps >= input.length()) {
            return "";
        } else {
            final String output = input.substring(steps);
            return output;
        }
    }

    public static boolean isEOF(final String input) {
        if (input.equals("")) {
            return true;
        } else if (input.charAt(0) == '\0') {
            return true;
        } else {
            return false;
        }
    }
}
