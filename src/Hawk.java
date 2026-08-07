public class Hawk implements Predator{

    @Override
    public void attack(String name){
        System.out.printf("Hunt this %s down!\n", name);
    }
}