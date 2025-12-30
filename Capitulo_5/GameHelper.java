package Capitulo_5;
import java.util.Scanner;

public class GameHelper {
    private Scanner scanner = new Scanner(System.in);
    public int getUserImput(String prompt){
        System.out.print(prompt + ": ");
        
        return scanner.nextInt();
    }    
}
