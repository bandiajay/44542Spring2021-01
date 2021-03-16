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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Employee("Byron", "Williams", "123-43-1234");
        System.out.println(emp1);
        
        HourlyEmployee hrEmp = new HourlyEmployee("John", "Smith", "123", 12, 10);
        System.out.println(hrEmp); 
   }
    
}
