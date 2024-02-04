import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.Locale;

import static org.apache.commons.lang3.StringUtils.capitalize;


public class FunctionTest {
    @Test
    void EscapeSequences() {
        System.out.println("hello world my name is \"Amir\".");
        System.out.println("hello world my name is \t Amir.");
        System.out.println("hello world my name is\b Amir.");
        System.out.println("hello world my name is \n Amir.");
        System.out.println("hello world \r my name is Amir.");
        System.out.println("hello world \f my name is Amir.");
        System.out.println("hello world my name is \fAmir.");
        System.out.println("hello world my name is \\ Amir.");
        System.out.println("hello \s world my name is \s Amir.");

    }

    @Test
    void splitPhrase() {
        String phrase = "hello world my name is Amir.";
        String[] result = phrase.split("\\s+");
        for (String s : result) {
            System.out.println(s);
        }
    }

    @Test
    void capitalizeMethod() {
        String myName = "artem";
        System.out.println("myName = " + myName);
        System.out.println("capitalize(myName) = " + capitalize(myName) + "\n");
    }

    @Test
    void joinMethod() {
        String[] word = {"my", "name","is", "amir"};
        String result = String.join(" ", word);
        System.out.println(result);
    }
}
