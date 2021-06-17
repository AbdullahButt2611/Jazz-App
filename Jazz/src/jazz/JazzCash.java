/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author it
 */
public class JazzCash {
    private static JazzCash instance;
    
    private List<Credit> credit;
    
    ArrayList<Movies> movie ;
    
    
    /**
     * This is a constructor for the JAzzCash class
     */
    private JazzCash()
    {
       credit = new ArrayList<Credit>(); 
       movie = new ArrayList<>();
       
    }

    public List<Credit> getCredit() {
        return credit;
    }
    
    /**
     * This is a getter for the instance of the method
     * @return JazzCash reference to this class     */
    public static JazzCash cashInstance()
    {
        if(instance==null)
            instance = new JazzCash();
        
        return instance;
    }
    
    public void writeCreditData()
    {
        try
        {
            FileWriter fr = new FileWriter("Credit.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("credit\n");
            for(int i=0;i<credit.size();i++)
            {
                br.write(credit.get(i).getAmount()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("null exception");
        }
    }
    
    public void readCreditData()
    {
        try
        {
            FileReader fr = new FileReader("Credit.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line=br.readLine();
            while(line!=null || line!="")
            {
                Credit cr = new Credit(0);
                cr.setAmount(Integer.parseInt(line));
                credit.add(cr);
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("null Exception");
        }
    }
    
    public void readMoviesData()
    {
        try
        {
            FileReader fr = new FileReader("Movies.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line=br.readLine();
            while(line!="" || line!=null)
            {
                String toks[]=line.split(",");
                Movies m = new Movies();
                m.setID(toks[0]);
                m.setName(toks[1]);
                m.setTiming(toks[2]);
                m.setSeats(Integer.parseInt(toks[3]));
                movie.add(m);
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("null Exception");
        }
    }
    
}
