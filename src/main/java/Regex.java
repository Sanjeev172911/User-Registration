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

    public String passwordRegexRule4(){
        String rule4="^[A-Za-z0-9]*[^A-Za-z0-9]{1}[A-Za-z0-9]*$";
        return rule4;
    }

    public String passwordRegexRule3(){
        String regex="^.*[0-9].*$";
        return regex;
    }

    public String passwordRegexRule2(){
        String regex="^.*[A-Z].*$";
        return regex;
    }

    public String passwordRegexRule1(){
        String regex="^.{8,}$";
        return regex;
    }

    public void check(String input,int rule){
        boolean result=true;
        for(int i=1;i<=Math.min(4,rule);i++){
            String regex=new String();
            switch(i){
                case 1:{
                  regex=passwordRegexRule1();
                  break;
                }
                case 2:{
                    regex=passwordRegexRule2();
                    break;
                }
                case 3:{
                    regex=passwordRegexRule3();
                    break;
                }
                case 4:{
                    regex=passwordRegexRule4();
                    break;
                }
            }

            result=result && pm.isAMatch(input,regex);
        }

        if(result){
            System.out.println(input + " is valid");
        }else{
            System.out.println(input + " is not valid");
        }
    }


}
