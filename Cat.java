/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class Cat extends Pet{
    
    private String bodyType;

    public Cat() {
    }

    public Cat(String bodyType, String name, String breed, double weight, int age) {
        super(name, breed, weight, age);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    
    //override talk() method
    public String talk() {
        return "Meow, meow, meow";
    }

    public String toString() {
        return super.toString() + 
                "\nBody Type: " + bodyType;
    }

}//end class
