import java.util.Scanner;

public class User {
    Regex regex;
    PatternMatcher patternMatcher;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String password;

    User(String fName,String lName,String  pNumber,String email,String password){
        regex=new Regex();
        patternMatcher=new PatternMatcher();

        this.firstName=fName;
        this.lastName=lName;
        this.phoneNumber=pNumber;
        this.email=email;
        this.password=password;
    }

    public boolean validateFirstName(){
        if(!patternMatcher.isAMatch(firstName,regex.firstNameRegex())){
            System.out.println("Enter the valid First name");
            return false;
        }
        System.out.println("Valid First Name");
        return true;
    }

    public boolean validateLastName(){
        if(!patternMatcher.isAMatch(lastName,regex.lastNameRegex())){
            System.out.println("Enter the valid Last name");
            return false;
        }
        System.out.println("Valid Last Name");
        return true;
    }

    public boolean validatePhoneNumber(){
        if(!patternMatcher.isAMatch(phoneNumber,regex.phoneNumberRegex())){
            System.out.println("Enter the valid Phone Number");
            return false;
        }
        System.out.println("Valid Phone Number");
        return true;
    }

    public boolean validateEmail(){
        if(!patternMatcher.isAMatch(email,regex.emailRegex())){
            System.out.println("Enter the valid Email");
            return false;
        }
        System.out.println("Valid Email");
        return true;
    }

    public boolean validatePassword(){
        if(!patternMatcher.isAMatch(password,regex.passwordRegex())){
            System.out.println("Enter the valid Password");
            return false;
        }
        System.out.println("Valid Password");
        return true;
    }

    public boolean isValidUserDetails(){
        if( validateFirstName() && validateLastName() && validatePhoneNumber() && validateEmail() && validatePassword()){
            System.out.println("Its a Valid User Details ");
            return true;
        }else{
            System.out.println("Invalid User Details ");
            return false;
        }
    }


}
