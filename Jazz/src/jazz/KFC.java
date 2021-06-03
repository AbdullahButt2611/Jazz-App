/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

/**
 *This class contains the KFC package of the orders
 * @author 2020-CS-72
 * @2020-CS-63
 */
public class KFC {
    
    private String ID;
    
    private String name;
    
    private String deal;
    
    private int persons;
    
    private int price;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDeal() {
        return deal;
    }

    public int getPersons() {
        return persons;
    }

    public int getPrice() {
        return price;
    }
}
