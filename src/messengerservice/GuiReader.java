/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messengerservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Lane Schultz
 */
public class GuiReader implements Reader{
    
    @Override
    public String setMessage() {
        String message = JOptionPane.showInputDialog("Enter Your Text: ");
        return message;
    } 
}
