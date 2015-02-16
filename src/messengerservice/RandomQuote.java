/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Lane Schultz
 */
public class RandomQuote implements Messageable {
    
    private String[] quote = new String[30];
    private int quoteIndex; //Variable to store the index of Jokes for entering new jokes
    private Random  randomNumbers = new Random();
    private int index;
    
    public RandomQuote(){
        quote[0] = "Ammo, the solution to all of the world's creapy stuff!";
        quote[1] = "I believe in speed,Speed and Power.";
        quote[2] = "Always look behind you before going foreward. It helps to remember where you come from.";
        quoteIndex = 3;
    }
    
    //gets a random joke
    @Override
    public String getMessage(){
        index = randomNumbers.nextInt(quoteIndex);
        return quote[index];
    }

    //sets jokes
    @Override
    public void setMessage(String message) {
        if(quoteIndex < 30 ){
            quote[quoteIndex] = message;
            quoteIndex++;
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "Too much wisdom. No more....");
        }
    }
}
