import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    static User user1,user2,user3,user4;

    static {
        user1=null;
    }

    @BeforeAll
    public static void initializeUser(){
        System.out.println("Hit this block");
        user1=new User("Sanjeev","Kumar","91 8102051085","wwsanjeev1729@gmail.com","fASd12#ad");
        user2=new User("Sam","Kumar","9 9835558626","wwsanjeev.asd1729@gma.il.com","d12#adD1");
        user3=new User("anjee","umar","8102051085","1wwsanjeev1729@gmail.com","fASd");
        user4=new User("Sa"," ","918102051085","wwsanjeev1729@gmail.com.in.im","fASd$12#ad");


    }

    @Test
    public void validatingFirstNameHappyTestCase(){
        assertTrue(user1.validateFirstName());
        assertTrue(user2.validateFirstName());
    }

    @Test
    public void validatingFirstNameHappySadCase(){
        assertFalse(user3.validateFirstName());
        assertFalse(user4.validateFirstName());
    }

    @Test
    public void validatingLastNameHappyTestCase(){
        assertTrue(user1.validateLastName());
        assertTrue(user2.validateLastName());
    }

    @Test
    public void validatingLastNameHappySadCase(){
        assertFalse(user3.validateLastName());
        assertFalse(user4.validateLastName());
    }

    @Test
    public void validatingPhoneNumberHappyTestCase(){
        assertTrue(user1.validatePhoneNumber());
        assertTrue(user2.validatePhoneNumber());
    }

    @Test
    public void validatingPhoneNumberHappySadCase(){
        assertFalse(user3.validatePhoneNumber());
        assertFalse(user4.validatePhoneNumber());
    }

    @Test
    public void validatingPasswordHappyTestCase(){
        assertTrue(user1.validatePassword());
        assertTrue(user2.validatePassword());
    }

    @Test
    public void validatingPasswordHappySadCase(){
        assertFalse(user3.validatePassword());
        assertFalse(user4.validatePassword());
    }

    @Test
    public void validatingEmailHappyTestCase(){
        assertTrue(user1.validateEmail());
        assertTrue(user2.validateEmail());
    }

    @Test
    public void validatingEmailHappySadCase(){
        assertFalse(user3.validateEmail());
        assertFalse(user4.validateEmail());
    }
}