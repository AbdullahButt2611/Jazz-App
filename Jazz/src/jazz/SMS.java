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
public class SMS {
    private int numberOfSMS;
    public SMS(int n)
    {
        this.numberOfSMS=n;
       
    }
    public int GetNumberOfSMS()
    {
        return this.numberOfSMS;
    }
    public boolean SetNumberOfSMS(int n)
    {
         if(n>=0)
        {
        this.numberOfSMS=n;
        return true;
        }
        return false;
    }
    
}
