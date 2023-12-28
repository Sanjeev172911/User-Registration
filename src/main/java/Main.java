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

        for(int i=0;i<15;i++){
            System.out.println("Enter Email");
            String emailRegex=regex.emailRegex();
            String input=cin.input();
            regex.check(input,emailRegex);
        }

    }
}
