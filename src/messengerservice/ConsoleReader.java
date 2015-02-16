package messengerservice;

import java.util.Scanner;

/**
 *
 * @author Lane Schultz
 */
public class ConsoleReader implements Reader {
    private Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String setMessage(){
        System.out.print("Enter Your Text: ");
        message = keyboard.nextLine();
        
        return message;
    }
}
