import java.util.Scanner;

public class TakeInput {
    Scanner S;

    TakeInput(){
        S=new Scanner(System.in);
    }

    public String input(){
        return S.next();
    }
}
