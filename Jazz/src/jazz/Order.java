/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 *This is the class that will come to work in the order button 
 * @author 2020-CS-63
 * @author 2020-CS-72
 */
public class Order {
    
    ArrayList<KFC> kfc= new ArrayList<KFC>();
    
    Set<Hardeez> hardeez = new HashSet<>();
    
    LinkedList<McDonalds> mc = new LinkedList<>();
    
    /**
     * This is a method for reading data from the file and storing it in the KFC Stack
     */
    public void readKfcdata()
    {
        try 
        {
            FileReader fr = new FileReader("KFC.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line=br.readLine();
            
            while((line!=null) || line!="")
            {
                KFC k = new KFC();
                String toks[]=line.split(",");
                k.setID(toks[0]);
                k.setName(toks[1]);
                k.setDeal(toks[2]);
                k.setPersons(Integer.parseInt(toks[3]));
                k.setPrice(Integer.parseInt(toks[4]));
                JazzWorld.worldInstance().getOrder().kfc.add(k);
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception");
        }
    }
    
    public void readHardeezdata()
    {
        try 
        {
            FileReader fr = new FileReader("Hardeez.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line=br.readLine();
            while((line!=null) || line!="")
            {
                Hardeez k = new Hardeez();
                String toks[]=line.split(",");
                k.setID(toks[0]);
                k.setName(toks[1]);
                k.setDeal(toks[2]);
                k.setPersons(Integer.parseInt(toks[3]));
                k.setPrice(Integer.parseInt(toks[4]));
                JazzWorld.worldInstance().getOrder().hardeez.add(k);
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception");
        }
    }
    
    public void readMcdata()
    {
        try 
        {
            FileReader fr = new FileReader("McDonald.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line=br.readLine();
            while((line!=null) || line!="")
            {
                McDonalds k = new McDonalds();
                String toks[]=line.split(",");
                k.setID(toks[0]);
                k.setName(toks[1]);
                k.setDeal(toks[2]);
                k.setPersons(Integer.parseInt(toks[3]));
                k.setPrice(Integer.parseInt(toks[4]));
                JazzWorld.worldInstance().getOrder().mc.add(k);
                line = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception");
        }
    }
}
