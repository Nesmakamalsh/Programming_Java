public class Zoo{
    private final boolean isAlive; //can't be accessed even through getters/setters
    private String name;
    private String type;
    private int age;
    
    Zoo(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
        isAlive = true;
    }

    String getName(){
        return this.name;
    }

    String getType(){
        return this.type;
    }

    boolean getisAlive(){
        return this.isAlive;
    } 

    int getAge(){
        return this.age;
    }


    void setName(String name){
        this.name = name;
    }

    void setType(String type){
        this.type = type;
    }

    void setisAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    void setAge(int age){
        if(age <0){
            System.out.println("age cant be a negative number");
        }
        else{
            this.age = age;
        }
    }


    
}