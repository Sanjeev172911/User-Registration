import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EmailValidation {
    static PatternMatcher patternMatcher;
    static Regex regex;
    @BeforeAll
    public static void initialize(){
        patternMatcher=new PatternMatcher();
        regex=new Regex();
    }

    static final String []sadData={
            "abc",
            "abc@.com.my",
            "abc123@gmail.ab.",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abd@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    };

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void emailHappyTest(String email){
        assertTrue(isValidEmail(email));
    }

    @ParameterizedTest
    @MethodSource("emailSadTestCaseProvider")
    public void emailSadTest(String email){
        assertFalse(isValidEmail(email));
    }

    private static boolean isValidEmail(String email) {
        return patternMatcher.isAMatch(email,regex.emailRegex());
    }

    private static Stream<Arguments> emailSadTestCaseProvider() {
        return Stream.of(sadData).map(Arguments::of);
    }
}
