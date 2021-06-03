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

    /**
     * This is a getter for the number f minutes  in a particular package
     * @return int return the number of minutes in a package
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * This is a getter for the number of MBs available in the package
     * @return int containing the count of MBs
     */
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

    /**
     * This is a setter for the subscribers value as it will be implemented in order to be incremented
     * @param subscribers int containing the 
     */
    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
    
    /**
     * This is a setter for the number of messages in a package
     * @param message int the value that needs to be checked
     * @return Boolean return true if the value is greater than 0
     */
    public boolean setMessages(int message)
    {
        if(messages>0)
        {
            this.messages=messages;
            return true;
        }
        else
            return false;
    }

    /**
     * This is a setter for the number of minutes in a package
     * @param minutes int the value that needs to be checked
     * @return Boolean return true if the value is greater than 0
     */
    public boolean setMinutes(int minutes) {
        if(minutes>0)
        {
            this.minutes = minutes;
            return true;
        }
        else 
            return false;
    }

    /**
     * This is a setter for the number of MBs in a package
     * @param mbs int the value that needs to be checked
     * @return Boolean return true if the value is greater than 0
     */
    public boolean setMbs(int mbs) {
        if(mbs>0)
        {
            this.mbs = mbs;
            return true;
        }
        else
            return false;
    }
    
    
    
}


