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
    public void SetNumberOfSMS(int n)
    {
        this.numberOfSMS=n;
    }
    public void SetNumberOfUsedSMS(int m)
    {
        this.numberOfSMS=m;
    }
    public void SetNumberOfRemainingSMS(int i)
    {
        this.numberOfSMS=i;
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
