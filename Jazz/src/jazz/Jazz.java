/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

/**
 *
 * @author DEll
 */
public class Jazz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        RegisteredAccounts.getUsersInstance().readData();
        JazzCash.cashInstance().readCreditData();
        JazzCash.cashInstance().readMoviesData();
        JazzWorld.worldInstance().readBalanceData();
        JazzWorld.worldInstance().readIntData();
        JazzWorld.worldInstance().readMinData();
        JazzWorld.worldInstance().readPackData();
        JazzWorld.worldInstance().readSmsData();
        JazzWorld.worldInstance().getOrder().readHardeezdata();
        JazzWorld.worldInstance().getOrder().readKfcdata();
        JazzWorld.worldInstance().getOrder().readMcdata();
        FirstScreen first = new FirstScreen();
        first.setVisible(true);
        
    }
    
}
