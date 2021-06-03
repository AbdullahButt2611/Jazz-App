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
    public void SetNumberOfMBS(int n)
    {
        this.numberOfMinutes=n;
    }
    public void SetNumberOfUsedMinutes(int m)
    {
        this.numberOfMinutes=m;
    }
    public void SetNumberOfRemainingMinutes(int i)
    {
        this.numberOfMinutes=i;
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
