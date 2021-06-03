/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.util.*;

/**
 *
 * @author DEll
 */
public class Packages {
    
    List<Minutes> min = new ArrayList<Minutes>();
    
    List<Internet> internet = new ArrayList<Internet>();
    
    List<SMS> sms = new ArrayList<SMS>();
    
    private int subscribers;
    
    private int messages;
    
    private int minutes;
    
    private int mbs;

    /**
     * This is a getter for the messages of the particular package
     * @return int 
     */
    public int getMessages() {
        return messages;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getMbs() {
        return mbs;
    }
    
    

    /**
     * This is a getter for the number of subscribers for a particular package
     * @return int which returns the count of the subscribers who have subscribed this package
     */
    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
    
    
    
}
