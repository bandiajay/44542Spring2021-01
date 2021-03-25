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
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GraduateAssistant hga = new HalfGA("John", "Smith");
        System.out.println(hga.getInitials());
        System.out.println(hga.calcSalary()); 
        System.out.println(hga.calcSalaryAfterTaxes());
        
        GraduateAssistant tga = new ThreeFourthGA("Byron", "Williams");
        System.out.println(tga.getInitials()); 
        System.out.println(tga.calcSalary()); 
        System.out.println(tga.calcSalaryAfterTaxes());
        
        Payable p = new HalfGA("Happi", "Pottamus");
        System.out.println(p.calcSalary());
       
        
        
      
}
}
