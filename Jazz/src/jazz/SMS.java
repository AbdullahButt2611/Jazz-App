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
    private int numberOfUsedSMS;
    private int numberOfRemainingSMS;
    private String Expiry;
    public SMS(int n,int u, int h)
    {
        this.numberOfSMS=n;
        this.numberOfRemainingSMS=u;
        this.numberOfUsedSMS=h;
       
    }
    public int GetNumberOfSMS()
    {
        return this.numberOfSMS;
    }
    public int GetNumberOfUsedSMS()
    {
        return this.numberOfUsedSMS;
    }
    
    public int GetNumberOfRemainingSMS()
    {
        return this.numberOfRemainingSMS;
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
    public boolean SetNumberOfUsedSMS(int m)
    {
         if(m>=0)
        {
        this.numberOfSMS=m;
        return true;
        }
        return false;
    }
    public boolean SetNumberOfRemainingSMS(int i)
    {
         if(i>=0)
        {
        this.numberOfSMS=i;
        return true;
        }
        return false;
    }
    public String GetExpiry()
    {
      return  this.Expiry;
    }
    public void SetExpiry(String d)
    {
        this.Expiry=d;
    }
}
