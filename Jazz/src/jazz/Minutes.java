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
public class Minutes {
    private int numberOfMinutes;
    private int numberOfUsedMinutes;
    private int numberOfRemainingMinutes;   
    private String Expiry;
    public Minutes (int n,int u, int h)
    {
        this.numberOfMinutes=n;
        this.numberOfRemainingMinutes=u;
        this.numberOfUsedMinutes=h;
        
    }
    public int GetNumberOfMinutes()
    {
        return this.numberOfMinutes;
    }
    public int GetNumberOfUsedMinutes()
    {
        return this.numberOfUsedMinutes;
    }
    
    public int GetNumberOfRemainingMinutes()
    {
        return this.numberOfRemainingMinutes;
    }
    public boolean SetNumberOfMBS(int n)
    {
        if(n>=0)
        {
        this.numberOfMinutes=n;
        return true;
        }
        return false;
    }
    public boolean SetNumberOfUsedMinutes(int m)
    {
         if(m>=0)
        {
        this.numberOfUsedMinutes=m;
        return true;
        }
        return false;
    }
    public boolean SetNumberOfRemainingMinutes(int i)
    {
         if(i>=0)
        {
        this.numberOfMinutes=i;
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
