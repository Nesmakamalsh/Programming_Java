public class Animal extends Zoo{
    String color;

    Animal(String name, String type, String color){
        super(name, type);  //super here can be replaced with parent of animal >> zoo
        this.color = color;
    }
        

    void eat(){
        System.out.println("the animal is eating");
    }
    void intro(){
        System.out.println(this.name +" is a" + this.type + "and it's " + this.color +" colored");
    }
}