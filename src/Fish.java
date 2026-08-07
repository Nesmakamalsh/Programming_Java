/* 
public class Fish extends Animal{
    Fish(String name, String type, String color){
        super(name, type, color);
    }

    @Override
    void move(){
        System.out.println("the animal is swimming");
    }

}
    */

public class Fish implements Prey, Predator{


    @Override
    public void flee(String name){
        System.out.printf("Run away from the %s!\n", name);
    
    }

    @Override
    public void attack(String name){
        System.out.printf("Go and hunt the %s down\n", name);
    }


}