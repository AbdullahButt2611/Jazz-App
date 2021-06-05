/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import javax.swing.JOptionPane;

/**
 *
 * @author 2020-CS-72
 * @author 2020-CS-63
 */

public class UserReview {
    
    public void AddComments(int n)
    {
        
    }
    public void Action(String Comments)
    {
        JOptionPane.showMessageDialog(null," We have recorded your message"+" "+Comments+ " and we will make us quallty better in Future ");
    }
}
class Ratings extends UserReview{
    
    @Override
    public void AddComments(int g){
        if(g==1)
        {
            JOptionPane.showMessageDialog(null,g+" We will Improve our Quality in Future");
        }
        if(g==2)
        {
            JOptionPane.showMessageDialog(null,g+" We will Improve our Quality in Future");
        }
        if(g==3)
        {
            JOptionPane.showMessageDialog(null,g+"THANK YOU Things will get better with time");
        }
        if(g==4)
        {
            JOptionPane.showMessageDialog(null,g+" Thanks alot for this Do share our app with your friends");
        }
        if(g==5)
        {
            JOptionPane.showMessageDialog(null,g+" Thanks alot for this Do share our app with your friends");
        }
        
    }
    
}
