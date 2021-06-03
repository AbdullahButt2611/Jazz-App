/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author it
 */
public class JazzWorld {
    
    private static JazzWorld instance;
    
    private List<Minutes> min ;
    
    private List<Internet> internet ;
    
    private List<SMS> sms ;
    
    private List<Packages> pack;
    
    private List<RechargeAmount> balance;

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
    }
    
    
    public static JazzWorld worldInstance()
    {
        if(instance==null)
            instance = new JazzWorld();
        
        return instance;
    }
    
}
