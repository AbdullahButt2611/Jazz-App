/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.util.ArrayList;
import java.util.*;

/**
 *This is the class that will hold all the data related to JazzWorld
 * @author 2020-CS-63
 * @author 2020-CS-72
 */
public class JazzWorld {
    
    private static JazzWorld instance;
    
    private List<Minutes> min ;
    
    private List<Internet> internet ;
    
    private List<SMS> sms ;
    
    private List<Packages> pack;
    
    private List<RechargeAmount> balance;
    
    
    
    private Order order;

    public List<Minutes> getMin() {
        return min;
    }

    public List<Internet> getInternet() {
        return internet;
    }

    public List<SMS> getSms() {
        return sms;
    }

    public List<Packages> getPack() {
        return pack;
    }

    public List<RechargeAmount> getBalance() {
        return balance;
    }
    
    /**
     * This is a constructor for the JazzWorld class
     */
    public JazzWorld()
    {
        min = new ArrayList<Minutes>();
        internet = new ArrayList<Internet>();
        sms = new ArrayList<SMS>();
        pack = new ArrayList<Packages>();
        balance = new ArrayList<RechargeAmount>();
        
        order = new Order();
    }
    
    
    public static JazzWorld worldInstance()
    {
        if(instance==null)
            instance = new JazzWorld();
        
        return instance;
    }
    
}
