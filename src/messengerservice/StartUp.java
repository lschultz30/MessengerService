/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

/**
 *
 * @author Lane Schultz
 */
public class StartUp {
    public static void main(String[] args) {
        TextReader reader = new ConsoleReader();
        TextWriter writer = new GuiWriter();
        MessengerService service = new MessengerService(writer,reader);
        service.deliverMessage();
    }
}
