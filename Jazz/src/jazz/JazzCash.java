/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.util.*;

/**
 *
 * @author it
 */
public class JazzCash {
    private static JazzCash instance;
    
    private List<Credit> credit;
    
    /**
     * This is a constructor for the JAzzCash class
     */
    public JazzCash()
    {
       credit = new ArrayList<Credit>(); 
    }

    public List<Credit> getCredit() {
        return credit;
    }
    
    /**
     * This is a getter for the instance of the method
     * @return JazzCash reference to this class     */
    public static JazzCash cashInstance()
    {
        if(instance==null)
            instance = new JazzCash();
        
        return instance;
    }
}
