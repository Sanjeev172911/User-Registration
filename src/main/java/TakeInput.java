import java.util.Scanner;

public class TakeInput {
    Scanner S;

    TakeInput(){
        S=new Scanner(System.in);
    }

    public String input(){
        System.out.println("Enter Data : ");
        return S.next();
    }

}
