/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class Driver extends Employee{
   private String ID;

    Driver() {
      
    }


    public void setID(String ID) {
        this.ID = ID;
    }

 
    public String getID() {
        return ID;
    }

    public Driver(String ID,String name ,String salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        
    }

  

    
}
