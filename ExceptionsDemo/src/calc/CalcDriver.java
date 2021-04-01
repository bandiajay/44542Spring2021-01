/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author ajay
 */
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = new Calculator(5, 0);
        System.out.println(calc.add());
        System.out.println(calc.sub());

        try {
            System.out.println(calc.div());
        } catch (ArithmeticException ex) {
            System.out.println(ex + " " + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.toString() + " " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Executes all the time.");
        }
        System.out.println(calc.mul());

    }
}
