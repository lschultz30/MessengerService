package messengerservice;

import java.util.Scanner;

/**
 *
 * @author Lane Schultz
 */
//This class implements the Reader and reads imput from the Console.
//It has a set message method that returns the keyboard input as a string to the message service.
public class ConsoleReader implements TextReader {
    private Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String getMessage(){
        System.out.print("Enter Your Text: ");
        message = keyboard.nextLine();
        
        return message;
    }
}
