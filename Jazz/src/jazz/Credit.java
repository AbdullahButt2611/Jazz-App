/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

/**
 *
 * 2020-CS-72
 * 2020-CS-63
 */
public class Credit {
    int Amount=0;
    Packages p=new Packages();
    Order o=new Order();
    
    
/**
 *
 * This method is used for verifying the present amount of Money with our purchasing 
 * @return flag
 */
    public boolean isMoneyAvaialbe(int Enter)
    {
        boolean flag=false;
        if(Amount>=Enter)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        return flag;
    }
    
} 
