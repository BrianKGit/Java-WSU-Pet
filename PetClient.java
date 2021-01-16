/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class PetClient {
    
    public static void main(String [] args) {
        
        //create a Pet array
        Pet [] petList = new Pet[5];
        
        //add Dog and Cat objects in the array
        petList[0] = new Cat("Big", "Tony", "Tiger", 800, 7);
        petList[1] = new Dog("Working Group", "Tommy", "Unknown", 35, 4);
        petList[2] = new Dog("Sporting Group", " Jimmy", "Bulldog", 45, 6);
        petList[3] = new Cat("Small", "Annie", "Bombay", 5, 3);
        petList[4] = new Dog("Working Group", "Frankie", "Spaniel", 39, 5);
        
        int dog_count = 0;
        
        //call toString and talk methods polymorphically
        for(int i = 0; i < petList.length; i++) {
            System.out.println("\n" + petList[i]);
            //the actual subclass object's talk method is called
            System.out.println(petList[i].talk());
            
            if(petList[i] instanceof Dog) {
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
