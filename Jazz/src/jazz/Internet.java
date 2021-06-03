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
    public Internet(int n)
    {
        this.numberOfMBS=n;
        
    }
    public int GetNumberOfMBS()
    {
        return this.numberOfMBS;
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
    
    
    
}
