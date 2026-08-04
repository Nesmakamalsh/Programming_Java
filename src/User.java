public class User{
    String username;
    String email;
    String password;

    User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
    //Overloaded constructors, as the constructor can be used with the same name bt should have different num of param
     User(String username, String email){
        this.username = username;
        this.email = email;
        this.password = "not provided"; //optional param here no need to be passed.
    }
    User(String username){
        this.username = username;
        this.email = "not provided";
        this.password = "not provided"; //optional param here no need to be passed.
    }

    void company(){
        System.out.println(this.username+" is working currently");
    }
}