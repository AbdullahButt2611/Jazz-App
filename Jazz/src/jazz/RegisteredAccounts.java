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
 * This is the Singleton class that will hold the list concatenated data of the user.
 * @author 2020-CS-72
 * @author 2020-CS-63
 */
public class RegisteredAccounts {
    private static RegisteredAccounts instance;
    
    private List<Users> users;
    
    /**
     * This is a constructor for this class and will be called only to initialize the arrays in the method of getInstance
     */
    private RegisteredAccounts()
    {
        users = new ArrayList<Users>();
    }
    
    /**
     * This is a method for the instance to get access as we will be using it to do all the thing with it 
     * @return RegisteredAccounts which will hold a reference to this this class
     */
    public static RegisteredAccounts getUsersInstance()
    {
        if(instance==null)
            instance=new RegisteredAccounts();
        
        return instance;
    }

    /**
     * This is a getter for the list of users that have logged in to the system or have been registered to it
     * @return List<Users> which will hold the list of all the students.
     */
    public List<Users> getUsers() {
        return users;
    }
    
    /**
     * This method will be called when we want to write the data of this class into the file. The data will set in file as comma seperated.
     */
    public void saveData()
    {
        try
        {
            FileWriter fw= new FileWriter("User.txt");
            BufferedWriter br = new BufferedWriter(fw);
            br.write("Username,                CNIC,                 Contact,                   Email,                  logins,                   TPN\n");
            for(int i=0;i<users.size();i++)
            {
                br.write(users.get(i).getUsername()+","+users.get(i).getCnic()+","+users.get(i).getContact()+","+users.get(i).getEmail()+","+users.get(i).getLogins()+","+users.get(i).getTPN()+"\n");
            }
            br.flush();
            br.close();
            fw.close();
        }
        catch(Exception ex)
        {
             System.out.println("Null identified");
        }
    }
    
    /**
     * This is a function for reading the data of this class from the file on the start of this system
     */
    public void readData()
    {
        try
        {
            FileReader fr=new FileReader("User.txt");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            line=br.readLine();
            while(line!=null || line!="")
            {
                Users us=new Users();
                String toks[]=line.split(",");
                us.setFUsername(toks[0],1);
                us.setFCnic(toks[1],1);
                us.setFContact(toks[2],1);
                us.setFEmail(toks[3], 1);
                us.setFLogins(Integer.parseInt(toks[4]), 0);
                us.setFTPN(Integer.parseInt(toks[5]), 0);
                RegisteredAccounts.getUsersInstance().users.add(us);
                line=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Registered Accounts Read");
        }
    }
    
    
}
