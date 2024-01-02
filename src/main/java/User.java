import java.util.Scanner;

public class User {
    Regex regex;
    PatternMatcher patternMatcher;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String password;

    User(){
        regex=new Regex();
        patternMatcher=new PatternMatcher();
    }

    public boolean validateFirstName(String firstName){
        if(!patternMatcher.isAMatch(firstName,regex.firstNameRegex())){
            throw new InvalidArgumentException("First Name should start with Cap and minimum of length 3");
        }

        System.out.println("Valid First Name");
        return true;
    }

    public boolean validateLastName(String lastName){
        if(!patternMatcher.isAMatch(lastName,regex.lastNameRegex())){
            throw new InvalidArgumentException("Last Name should start with Cap and minimum of length 3");
        }
        System.out.println("Valid Last Name");
        return true;
    }

    public boolean validatePhoneNumber(String phoneNumber){
        if(!patternMatcher.isAMatch(phoneNumber,regex.phoneNumberRegex())){
            throw new InvalidArgumentException("Invalid Phone Number");
        }
        System.out.println("Valid Phone Number");
        return true;
    }

    public boolean validateEmail(String email){
        if(!patternMatcher.isAMatch(email,regex.emailRegex())){
            throw new InvalidArgumentException("Invalid Email");
        }
        System.out.println("Valid Email");
        return true;
    }

    public boolean validatePassword(String password){
        if(!patternMatcher.isAMatch(password,regex.passwordRegex())){
            throw new InvalidArgumentException("Invalid Password");
        }
        System.out.println("Valid Password");
        return true;
    }

    public boolean isValidUserDetails(){
        if( validateFirstName(this.firstName) && validateLastName(this.lastName) && validatePhoneNumber(this.phoneNumber)
                && validateEmail(this.email) && validatePassword(this.password)){
            System.out.println("Its a Valid User Details ");
            return true;
        }else{
            System.out.println("Invalid User Details ");
            return false;
        }
    }


}
