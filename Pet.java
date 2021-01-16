/*
 * Author: Brian Klein
 * Date: 
 * Program:
 * Description:
 */

public abstract class Pet {
    
    //data members
    private String name;
    private String breed;
    private double weight;
    private int age;

    public Pet() {
    }

    public Pet(String name, String breed, double weight, int age) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    /*
    //this method is for polymorphism
    //we will study polymorphism later
    public String talk(){
        return "";
    }
    */
    
    public abstract String talk();

    public String toString() {
        return "\nName: " + name + 
               "\nBreed: " + breed + 
               "\nWeight: " + weight + " lbs." +
               "\nAge: " + age;
    }
    
    
    
    
}
