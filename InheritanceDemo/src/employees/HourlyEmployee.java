/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author ajay
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    private int hrsWorked;

    public HourlyEmployee( String fisrtName, String lastName, String SSN, double hourlyRate, int hrsWorked) {
        super(fisrtName, lastName, SSN);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }
    
    public double calcSalary(){
        return hourlyRate*hrsWorked;
    }
    
    @Override
    public String getFullName(){
        return super.getFisrtName()+" "+super.getLastName();
    }
    
    @Override
    public String toString(){
        return super.toString()+" $"+calcSalary();
    }
    
    
}
