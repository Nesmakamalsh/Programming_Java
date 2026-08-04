public class Friend{
    static int numofFriends = 0;
    String name;

Friend(String name){
    this.name = name;
    numofFriends++;
}

static void num(){
    System.out.println("You have " + numofFriends + " total number of friends");
}

}