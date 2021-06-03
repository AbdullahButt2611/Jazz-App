/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

/**
 *This is the class that will hold the data related to the Movies display
 * @author DEll
 */
public class Movies {
    
    private String ID;
    
    private String name;
    
    private String timing;
    
    private int seats;

    /**
     * This is a getter for the ID of the film
     * @return String returning the ID
     */
    public String getID() {
        return ID;
    }

   /**
    * This is a getter for the name of the film
    * @return String returning the Name
    */
    public String getName() {
        return name;
    }

    /**
     * This is a getter for the timing of the film
     * @return String returning the Timing(Morning / Evening)
     */
    public String getTiming() {
        return timing;
    }

    /**
     * This is a getter for the no of seats available for the film
     * @return int returning the number of seats available value
     */
    public int getSeats() {
        return seats;
    }

    /**
     * This is a setter for the ID of the movie
     * @param ID String containing the ID of the particular movie
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * This is a setter for the name of the movie
     * @param name String containing the name of the particular movie
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is a timing for the name of the movie
     * @param timing String containing the timing of the particular movie
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }

    /**
     * this is a setter for the number of seats available
     * @param seats int containing the new value of seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    
    
    
}
