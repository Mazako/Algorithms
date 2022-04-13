import java.util.Arrays;
import java.util.Locale;

public interface CesarCipher {

    static String encrypcion(String message, int key) {
        StringBuilder builder = new StringBuilder();
        char[] chars = message.toUpperCase(Locale.ROOT).toCharArray();
        for (char c : chars) {
            c += key;
            while(c > 90)
                c -= 26;
            builder.append(c);
        }
        return builder.toString();
    }

    static String deencryption(String message, int key) {
        char[] chars = message.toUpperCase(Locale.ROOT).toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            c -= key;
            while (c < 65)
                c += 26;
            builder.append(c);
        }
        return builder.toString();

    }

}
