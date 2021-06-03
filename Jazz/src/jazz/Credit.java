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
    private int Amount;
    
    
    /**
     * This is a constructor for this particular class
     * @param amount 
     */
    public Credit(int amount)
    {
        Amount = amount;
    }

    /**
     * This is a getter for the credit of the user
     * @return int return the credit in the wallet of the user
     */
    public int getAmount() {
        return Amount;
    }

    /**
     * This is the setter for the credit of the user
     * @param Amount the amount that should be greater than 0
     */
    public boolean setAmount(int Amount) {
        if(Amount>0)
        {
            this.Amount = Amount;
            return true;
        }
        else
            return false;
    }
    
    public void addAmount(int amount)
    {
        int am=amount+this.Amount;
        this.setAmount(am);
    }
    
     public void retrieveAmount(int amount)
    {
        int am=this.Amount-amount;
        this.setAmount(am);
    }
    
    
    
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
