/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

import java.util.ArrayList;

public class PetClient2 {
    
    public static void main(String [] args) {
        
        //create a Pet ArrayList
        ArrayList<Pet> petList = new ArrayList<Pet>();
        
        //add Dog and Cat objects in the array
        petList.add(new Cat("Big", "Tony", "Tiger", 800, 7));
        petList.add(new Dog("Working Group", "Tommy", "Unknown", 35, 4));
        petList.add(new Dog("Sporting Group", " Jimmy", "Bulldog", 45, 6));
        petList.add(new Cat("Small", "Annie", "Bombay", 5, 3));
        petList.add(new Dog("Working Group", "Frankie", "Spaniel", 39, 5));
        
        int dog_count = 0;
        
        //call toString and talk methods polymorphically
        for(int i = 0; i < petList.size(); i++) {
            System.out.println("\n" + petList.get(i));
            //the actual subclass object's talk method is called
            System.out.println(petList.get(i).talk());
            
            if(petList.get(i) instanceof Dog) {
                dog_count++;
            }
        }
        
        System.out.println("Number of Dogs: " + dog_count);
        
        
        /*
        Pet p1;
        Dog d1;
        Cat c1;
        
        p1 = new Pet("Tommy", "Unknown", 35, 4);
        d1 = new Dog("Sporting Group", "Jimmy", "Bulldog", 45, 6);
        c1 = new Cat("Small", "Annie", "Bombay", 5, 3);
        
        System.out.println("\nPet: ");
        System.out.println(p1);
        System.out.println(p1.talk());
        
        System.out.println("\nDog: ");
        System.out.println(d1);
        System.out.println(d1.talk());
        
        System.out.println("\nCat: ");
        System.out.println(c1);
        System.out.println(c1.talk());
        */
        
        
        
    }
    
}
