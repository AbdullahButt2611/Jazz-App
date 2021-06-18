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
import java.util.ArrayList;
import java.util.*;

/**
 *This is the class that will hold all the data related to JazzWorld
 * @author 2020-CS-63
 * @author 2020-CS-72
 */
public class JazzWorld {
    
    private static JazzWorld instance;
    
    private List<Minutes> min ;
    
    private List<Internet> internet ;
    
    private List<SMS> sms ;
    
    private List<Packages> pack;
    
    private List<RechargeAmount> balance;

    public Order getOrder() {
        return order;
    }
    
    
    
    private Order order;

    public List<Minutes> getMin() {
        return min;
    }

    public List<Internet> getInternet() {
        return internet;
    }

    public List<SMS> getSms() {
        return sms;
    }

    public List<Packages> getPack() {
        return pack;
    }

    public List<RechargeAmount> getBalance() {
        return balance;
    }
    
    /**
     * This is a constructor for the JazzWorld class
     */
    private JazzWorld()
    {
        min = new ArrayList<Minutes>();
        internet = new ArrayList<Internet>();
        sms = new ArrayList<SMS>();
        pack = new ArrayList<Packages>();
        balance = new ArrayList<RechargeAmount>();
        
        order = new Order();
    }
    
    
    public static JazzWorld worldInstance()
    {
        if(instance==null)
            instance = new JazzWorld();
        
        return instance;
    }
    
    public void writeMinData()
    {
        try
        {
            FileWriter fr = new FileWriter("Minutes.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Minutes ,    Expiry Date\n");
            for(int i=0;i<min.size();i++)
            {
                br.write(min.get(i).GetNumberOfMinutes()+","+min.get(i).GetExpiry()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
        }
    }
    
    public void writeIntData()
    {
        try
        {
            FileWriter fr = new FileWriter("Internet.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("MBs\n");
            for(int i =0;i<internet.size();i++)
            {
                br.write(internet.get(i).GetNumberOfMBS()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
        }
    }
    
    public void writeSmsData()
    {
        try
        {
            FileWriter fr = new FileWriter("SMS.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("SMS\n");
            for(int i =0;i<sms.size();i++)
            {
                br.write(sms.get(i).GetNumberOfSMS()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
        }
    }
    
  
    
    public void writePackData()
    {
        try
        {
            FileWriter fr = new FileWriter("Packages.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("ID,       Subscribers,        messages,       minutes,     mbs,     name,     validity,     code\n");
            for(int i=0;i<pack.size();i++)
            {
                br.write(pack.get(i).getID()+","+pack.get(i).getSubscribers()+","+pack.get(i).getMessages()+","+pack.get(i).getMinutes()+","+pack.get(i).getMbs()+","+pack.get(i).getName()+","+pack.get(i).getValidity()+","+pack.get(i).getCode()+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
        }
    }
    
    public void writeBalanceData()
    {
        try
        {
            FileWriter fr = new FileWriter("Balance.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Balance\n");
            for(int i=0;i<balance.size();i++)
            {
                br.write(Double.toString(balance.get(i).Balance)+"\n");
            }
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
        }
    }
    
      public void readMinData()
      {
          try 
          {
            FileReader fr = new FileReader("Minutes.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while(line!="" || line!=null)
            {
                Minutes min = new Minutes(0);
                String toks[]=line.split(",");
                min.SetNumberOfMBS(Integer.parseInt(toks[0]));
                min.SetExpiry(toks[1]);
                this.min.add(min);
                line = br.readLine();
            }
            br.close();
            fr.close();
          }
          catch(Exception ex)
          {
              System.out.println("Null Exception");
          }
      }
    
      
      
      
      public void readIntData()
      {
          try 
          {
              FileReader fr = new FileReader("Internet.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while(line!="" || line!=null)
            {
                Internet in = new Internet(0);
                in.SetNumberOfMBS(Integer.parseInt(line));
                this.internet.add(in);
                line = br.readLine();
            }
            br.close();
            fr.close();
          }
          catch(Exception ex)
          {
              System.out.println("Null Exception");
          }
      }
      
      public void readSmsData()
      {
          try 
          {
              FileReader fr = new FileReader("SMS.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while(line!="" || line!=null)
            {
                SMS s = new SMS(0);
                s.SetNumberOfSMS(Integer.parseInt(line));
                this.sms.add(s);
                line = br.readLine();
            }
            br.close();
            fr.close();
          }
          catch(Exception ex)
          {
              System.out.println("Null Exception");
          }
      }
      
      public void readPackData()
      {
//          ID,       Subscribers,        messages,       minutes,     mbs,     name,     validity,     code
          try 
          {
              FileReader fr = new FileReader("Packages.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while(line!="" || line!=null)
            {
                
                String toks[] = line.split(",");
                Packages pack = new Packages(Integer.parseInt(toks[2]),Integer.parseInt(toks[6]));
                pack.setID(toks[0]);
                pack.setSubscribers(Integer.parseInt(toks[1]));
//                pack.setMessages();
                pack.setMinutes(Integer.parseInt(toks[3]));
                pack.setMbs(Integer.parseInt(toks[4]));
                pack.setName(toks[5]);
//                pack.setValidity();
                pack.setCode(toks[7]);
                this.pack.add(pack);
                line = br.readLine();
            }
            br.close();
            fr.close();
          }
          catch(Exception ex)
          {
              System.out.println("Null Exception");
          }
      }
      
      public void readBalanceData()
      {
          try 
          {
              FileReader fr = new FileReader("Balance.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while(line!="" || line!=null)
            {
                RechargeAmount b = new RechargeAmount(0);
                b.Balance=Double.parseDouble(line);
                this.balance.add(b);
                line = br.readLine();
            }
            br.close();
            fr.close();
          }
          catch(Exception ex)
          {
              System.out.println("Null Exception");
          }
      }
    
}
