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
        String regex="^[A-Za-z_-]+[A-Za-z0-9_+-]*.{0,1}[A-Za-z0-9_+-]*@{1}[A-Za-z0-9_-]{2,}.[A-Za-z]{2,}.{0,1}[A-Za-z]{2,}$";
        return regex;
    }

    public String mobileNumberRegex(){
        String regex="^[0-9]{1,3}\\s[0-9]{10}$";
        return regex;
    }

    public String passwordRegex(){
        String regex="^[A-Za-z0-9]*[^A-Za-z0-9]{1}[A-Za-z0-9]$";
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
