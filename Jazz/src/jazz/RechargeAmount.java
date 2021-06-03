/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

/**
 *
 * @author it
 */
public class RechargeAmount {
     double Balance;
    Credit c=new Credit(0);
    public RechargeAmount(double b)
            
    {
        this.Balance=b;
    }
    
    public boolean isBalanceVaild()
    {
        if(Balance>=0)
        {
            return true;
        }
    return false;
    }
    public boolean RechargeBalance()
      
    {
        if(Balance<=c.getAmount())
        {
            return true;
        }
        return false;
    }
}
