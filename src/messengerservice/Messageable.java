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

//This is the template for my message classes.  Every one of them will will
//return a string.

public interface Messageable {
    public void setMessage(String message);
    public String getMessage(); 
}
