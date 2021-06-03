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
    public void SetNumberOfMBS(int n)
    {
        this.numberOfMBS=n;
    }
    public void SetNumberOfUsedMBS(int m)
    {
        this.numberOfMBS=m;
    }
    public void SetNumberOfRemainingMBS(int i)
    {
        this.numberOfMBS=i;
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
