package messengerservice;

/**
 *
 * @author Lane Schultz
 */

//This class creates the message.  Without the MessengerService object it would not work.

public class DeliveryMan {
  
  public static void main(String[] args)
    {
       MessengerService service = new MessengerService(
               new RandomQuote(), new ConsoleWriter(), new ConsoleReader() ); 
       
        service.setMessage();

       service.getMessage();
           
       
    }
}
