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
    private String Expiry;
    public Minutes (int n)
    {
        this.numberOfMinutes=n;
        Expiry="";
        
    }
    public int GetNumberOfMinutes()
    {
        return this.numberOfMinutes;
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
    public String GetExpiry()
    {
      return  this.Expiry;
    }
    public void SetExpiry(String d)
    {
        this.Expiry=d;
    }
}
