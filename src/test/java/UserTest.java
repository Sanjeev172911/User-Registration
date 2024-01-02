import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    static User user;

    @BeforeAll
    public static void initializeUser(){
        System.out.println("Hit this block");
        user=new User();

    }

    @ParameterizedTest
    @ValueSource(strings = {"Sanjeev","Sam"})
    public void validatingFirstNameHappyTestCase(String firstName){
        assertTrue(user.validateFirstName(firstName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sa","sam","srushti","amMy"})
    public void validatingFirstNameSadCase(String firstName){
        InvalidArgumentException exception=assertThrows(InvalidArgumentException.class,
                ()->user.validateFirstName(firstName));

        assertEquals("First Name should start with Cap and minimum of length 3", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kumar","Jenner","Kims"})
    public void validatingLastNameHappyTestCase(String lastName){
        assertTrue(user.validateLastName(lastName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ka","kam","pahadi","pmMy"})
    public void validatingLastNameSadCase(String lastName){
        InvalidArgumentException exception=assertThrows(InvalidArgumentException.class,
                ()->user.validateLastName(lastName));

        assertEquals("Last Name should start with Cap and minimum of length 3", exception.getMessage());
    }


    @ParameterizedTest
    @ValueSource(strings = {"91 8102051085","1 8294562789","231 9871234560"})
    public void validatingPhoneNumberHappyTestCase(String phoneNumber){
       assertTrue(user.validatePhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"918102051085","8294562789","231 987123460","231987123460"})
    public void validatingPhoneNumberSadCase(String phoneNumber){
        InvalidArgumentException exception=assertThrows(InvalidArgumentException.class,
                ()->{user.validatePhoneNumber(phoneNumber);});

        assertEquals("Invalid Phone Number",exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"asdfW12@j","12345As@iuy","dfgAD@19","zxcVBN1@1"})
    public void validatingPasswordHappyTestCase(String password){
        assertTrue(user.validatePassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"asdfW12j","As@iuy","dfAD@19","zxcasdfg1@1","@#dfgA12A"})
    public void validatingPasswordSadTestCase(String password){
        try{
            user.validatePassword(password);
            fail("Expected exception, but the code executed successfully");
        }catch (InvalidArgumentException e){
            assertEquals("Invalid Password",e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings={"abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com"})
    public void validatingEmailHappyTestCase(String email){
        assertTrue(user.validateEmail(email));

    }

    @ParameterizedTest
    @ValueSource(strings={"abc",
            "abc@.com.my",
            "abc123@gmail.ab.",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com"})
    public void validatingEmailSadTestCase(String email){
        try{
            user.validateEmail(email);
            fail("Expected exception, but the code executed successfully");
        }catch(InvalidArgumentException e){
            assertEquals("Invalid Email",e.getMessage());
        }
    }


}