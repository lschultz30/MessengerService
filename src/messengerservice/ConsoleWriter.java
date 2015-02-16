package messengerservice;

/**
 *
 * @author Lane Schultz
 */
//This class implements the writer.  It will display the message at the end of the program.
public class ConsoleWriter implements Writer {
   @Override
    public void displayMessage(String message){
        System.out.println(message);
    }
}
