import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        UserNameValidator userName=new UserNameValidator();
        TakeInput cin=new TakeInput();
        System.out.println("Enter FirstName ");
        String regex=userName.firstNameRegex();
        String input=cin.input();
        userName.check(input,regex);

        System.out.println("Enter LastName");
        regex=userName.lastNameRegex();
        input=cin.input();
        userName.check(input,regex);

    }
}
