package messengerservice;

/**
 *
 * @author Lane Schultz
 */
public class ConsoleWriter implements Writer {
   @Override
    public void displayMessage(String message){
        System.out.println(message);
    }
}
