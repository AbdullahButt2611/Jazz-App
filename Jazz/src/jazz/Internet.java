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
public class Internet {
    private int numberOfMBS;
    private int numberOfUsedMBS;
    private int numberOfRemainingMBS;
    private String Expiry;
    public Internet(int n,int u, int h)
    {
        this.numberOfMBS=n;
        this.numberOfRemainingMBS=u;
        this.numberOfUsedMBS=h;
        
    }
    public int GetNumberOfMBS()
    {
        return this.numberOfMBS;
    }
    public int GetNumberOfUsedMBS()
    {
        return this.numberOfUsedMBS;
    }
    
    public int GetNumberOfRemainingMBS()
    {
        return this.numberOfRemainingMBS;
    }
    public boolean SetNumberOfMBS(int n)
    {
         if(n>=0)
        {
        this.numberOfMBS=n;
        return true;
        }
        return false;
    }
    public boolean SetNumberOfUsedMBS(int m)
    {
         if(m>=0)
        {
        this.numberOfMBS=m;
        return true;
        }
        return false;
    }
    public boolean SetNumberOfRemainingMBS(int i)
    {
         if(i>=0)
        {
        this.numberOfMBS=i;
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
