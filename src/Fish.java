public class Fish extends Animal{
    Fish(String name, String type, String color){
        super(name, type, color);
    }

    @Override
    void move(){
        System.out.println("the animal is swimming");
    }

}