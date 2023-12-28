public class Main {
    public static void main(String[] args) {
        Regex regex=new Regex();
        TakeInput cin=new TakeInput();
//        System.out.println("Enter FirstName ");
//        String regexp=regex.firstNameRegex();
//        String input=cin.input();
//        regex.check(input,regexp);
//
//        System.out.println("Enter LastName");
//        regexp=regex.lastNameRegex();
//        input=cin.input();
//        regex.check(input,regexp);
//
//
//        System.out.println("Enter Email");
//        String emailRegex=regex.emailRegex();
//        input=cin.input();
//        regex.check(input,emailRegex);

//        System.out.println("Enter Mobile Number");
//        String mobileNumberRegex=regex.mobileNumberRegex();
//        String input=cin.input();
//        regex.check(input,mobileNumberRegex);

        System.out.println("Enter Password");
        String mobileNumberRegex=regex.passwordRegex();
        String input=cin.input();
        regex.check(input,mobileNumberRegex);
    }
}
