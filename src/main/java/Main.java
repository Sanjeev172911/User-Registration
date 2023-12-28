import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        UserNameValidator userName=new UserNameValidator();
        TakeInput cin=new TakeInput();

        String regex=userName.firstNameRegex();
        String input=cin.input();
        userName.check(input,regex);

    }
}
