/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AJAY
 */
public class WeatherDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Weather w1 = new Weather("NE", -12, true);
        System.out.println(w1);
        PrintWriter write = new PrintWriter(new File("output.txt"));
        Scanner scan = new Scanner(new File("weatherData.txt"));
        while (scan.hasNext()) {
            //System.out.println("Enter the direction: ");
            // String dir = scan.next();
            //scan.nextLine();
            //System.out.println("Enter the temprature: ");
            //double temp = scan.nextDouble();
            //System.out.println("Enter whether it is snowing or not? ");
            //boolean isSnow = scan.nextBoolean();

            Weather w2 = new Weather(scan.next(), scan.nextDouble(), scan.nextBoolean());
            System.out.println(w2);
            write.println(w2);
        }

        scan.close();
        write.close();

    }

}
