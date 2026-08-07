/* 
public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000;
    boolean isRunning = false;


    void start(){
        System.out.println("Start the engine");
    }

    void stop(){
        System.out.println("Stop the engine");
    }

    void drive(){
        System.out.println("You drive a "+this.make +" "+ this.model);
    }

    Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.make +" "+ this.model+" "+this.year+" "+this.price;
    }
}
*/
/* 
public class Car implements Veichle{
    
    @Override
    public void go(){
        System.out.println("drive the car");
    }
}
    */

public class Car{

    String model;
    int year;
    Engine engine;


    Car(String model, int year, String engineType){
        this.model = model;
        this.year=year;
        this.engine = new Engine(engineType);
    }

    void start(){
        engine.start();
        System.out.println("The "+this.model+" "+ this.year+" Car is running");
    }


}