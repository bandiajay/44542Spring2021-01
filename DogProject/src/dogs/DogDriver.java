/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog("Jimmy", 12, "Standard Poodle");
        Dog d2 = new Dog("Puppy", 11, "German Shepard" );
        
        String breed1 = d1.getBreed();
        System.out.println(breed1);
        
        int age = d1.getAge();
        System.out.println(age);
        
        System.out.println(d1.getName());
        
        d1.setName("Snoopy");
        
        String name = d1.getName();
        System.out.println(name);
        
        System.out.println(d1);
        
        System.out.println(d2);
        
        d1.incrementAge();
        
        System.out.println(d1);
        d1.incrementAge();
        System.out.println(d1);
        
   }
    
}
