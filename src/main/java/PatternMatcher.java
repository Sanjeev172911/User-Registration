import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    String regex;

    PatternMatcher(String regex){
        this.regex=regex;
    }

    public boolean isAMatch(String input){
        Pattern pattern=Pattern.compile(this.regex);
        Matcher matcher=pattern.matcher(input);
        return matcher.matches();
    }
}
