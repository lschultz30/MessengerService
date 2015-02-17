package messengerservice;

/**
 *
 * @author Lane Schultz
 */
public class MessengerService {
//    private Messageable messenger; //Variable to hold a message strategy
    private TextWriter writer; //Variable to hold a writer 
    private TextReader reader; //Variable to hold a message reader
    
    //Constructors 
    public MessengerService(){
        
    }
    
  public MessengerService(TextWriter writer, TextReader reader) {
//        this.setMessenger(msg);
        this.setWriter(writer);
        this.setReader(reader);
        
    }
  
  public void deliverMessage() {
      String message = reader.getMessage();
      writer.deliverMessage(message);
  }

  //Setters
//    public void setMessenger(Messageable msg) {
//        this.messenger = msg;
//    }
    
    public void setWriter(TextWriter writer){
        this.writer=writer;
    }
    
    public void setReader(TextReader reader){
        this.reader = reader;
    }
    
//    public void setMessage(){
//        messenger.setMessage(reader.getMessage());
//    }

    //Gets the message
//    public void getMessage(){
//        writer.deliverMessage(messenger.getMessage());
//    }
}
