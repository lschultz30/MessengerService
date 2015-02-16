package messengerservice;

/**
 *
 * @author Lane Schultz
 */
public class DeliveryMan {
  
  public static void main(String[] args)
    {
       MessengerService service = new MessengerService(
               new RandomQuote(), new ConsoleWriter(), new ConsoleReader() ); 
       
        service.setMessage();

       service.getMessage();
           
       
    }
}
