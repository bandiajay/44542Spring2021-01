/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author ajay
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    
    public Employee(){
        
    }

    public Employee(String fisrtName, String lastName, String SSN) {
        this.firstName = fisrtName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFisrtName() {
        return firstName;
    }

    public void setFisrtName(String fisrtName) {
        this.firstName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    public String getFullName(){
        return lastName+", "+firstName;
    }
    
    @Override
    public String toString(){
        return SSN+" "+getFullName();
    }
}
