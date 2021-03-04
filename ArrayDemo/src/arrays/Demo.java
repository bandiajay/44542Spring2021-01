/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author ajay
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers; //Declaration
        numbers = new int[5];
        numbers[3] = 22;
        //numbers[5] = 33; // exception

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*i*i;
           
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("************");
        for(int num :numbers){
            System.out.println(num);
        }

    }

}
