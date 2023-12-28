public class UserNameValidator {
    PatternMatcher pm;
    UserNameValidator(){
        pm=new PatternMatcher();
    }

    public String firstNameRegex(){
        String regex="^[A-Z]{1}[a-z]{2,}$";
        return regex;
    }

    public void check(String input,String regex){

        if(pm.isAMatch(input,regex)){
            System.out.println(input + " is a valid FirstName");
        }else{
            System.out.println(input + " is not a valid FirstName");
        }
    }


}