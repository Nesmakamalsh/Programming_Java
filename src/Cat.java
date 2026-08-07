/* 
public class Cat extends Animal{

    Cat(String name, String type, String color){
        super(name, type, color);

    }

 
    void Speak(){
        System.out.println("the cat goea meow");
    }
    
}
    */

public class Cat implements Prey{

    @Override
    public void flee(String name){
        System.out.printf("run away from the %s!\n", name);
    }
}