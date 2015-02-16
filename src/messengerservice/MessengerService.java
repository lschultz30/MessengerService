package messengerservice;

/**
 *
 * @author Lane Schultz
 */
public class MessengerService {
    private Messageable messenger; //Variable to hold a message strategy
    private Writer writer; //Variable to hold a writer 
    private Reader reader; //Variable to hold a message reader
    
    //Constructors 
    public MessengerService(){
        
    }
    
    public MessengerService(Messageable msg, Writer writer, Reader reader) {
        this.setMessenger(msg);
        this.setWriter(writer);
        this.setReader(reader);
        
    }

    //Setters
    public void setMessenger(Messageable msg) {
        this.messenger = msg;
    }
    
    public void setWriter(Writer writer){
        this.writer=writer;
    }
    
    public void setReader(Reader reader){
        this.reader = reader;
    }
    
    public void setMessage(){
        messenger.setMessage(reader.setMessage());
    }

    //Gets the message
    public void getMessage(){
        writer.displayMessage(messenger.getMessage());
    }
}
