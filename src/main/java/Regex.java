public class Regex {
    PatternMatcher pm;
    Regex(){
        pm=new PatternMatcher();
    }

    public String firstNameRegex(){
        String regex="^[A-Z]{1}[a-z]{2,}$";
        return regex;
    }

    public String lastNameRegex(){
        String regex="^[A-Z]{1}[a-z]{2,}$";
        return regex;
    }

    public String emailRegex(){
//        String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$";
        String regex="^[A-Za-z_-]+[A-Za-z0-9_+-]*.{0,1}[A-Za-z0-9_+-]*@{1}[A-Za-z0-9_-]{2,}.[A-Za-z]{2,}.{0,1}[A-Za-z]{2,}$";
        return regex;
    }

    public void check(String input,String regex){
        if(pm.isAMatch(input,regex)){
            System.out.println(input + " is valid");
        }else{
            System.out.println(input + " is not valid");
        }
    }


}
