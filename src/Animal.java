public class Animal extends Zoo{
    String color;

    Animal(String name, String type, String color, int age){
        super(name, type, age);  //super here can be replaced with parent of animal >> zoo
        this.color = color;
    }
        
    void move(){
        System.out.println("the animal is running");
    }

    void eat(){
        System.out.println("the animal is eating");
    }
    void intro(){
        System.out.println(this.getName() + " is a" + this.getType() + "and it's " + this.color +" colored");
    }
}