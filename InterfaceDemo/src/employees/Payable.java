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
public interface Payable {
    public static final double FULL_SALARY = 750;
    public static final double TAX_RATE = 11;
    public abstract double calcSalary();
    public abstract double calcTaxRate();
    public abstract double calcSalaryAfterTaxes();
}
