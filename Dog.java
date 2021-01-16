/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class Dog extends Pet{
    
    //data member
    private String group;
    
    //constructor
    public Dog() {
    }
    
    public Dog(String group, String name, String breed, double weight, int age) {
        //invoke the superclass constructor to initilize
        //the superclass data members
        super(name, breed, weight, age);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    //override talk method
    public String talk() {
        return "Woof, woof, woof";
    }

    public String toString() {
        return super.toString() + //call Pet's toString() method
                "\nGroup: " + group;
    }
    
}//end class
