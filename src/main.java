import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args){

        /*
        // EX.1

        System.out.println("Hallo ich bin Nesma\n");
        
       int age = 24;
       boolean istNett = true;
       System.out.println("Ich bin " + age + " Jahre alt");

       Scanner scanner = new Scanner(System.in);

       System.out.println("Was ist dein Name?");
       
       String name = scanner.nextLine();

       // .nextLine() >> will take the full name including spaces
       // .next() >> no spaces considered, so will take the name before the space only

       if(istNett){
        System.out.println("Freut mich dich kennenlernen " + name);
       }
       else{
        System.out.println("Wir sehen uns noch " + name);
       }

       System.out.println("Wie alt bist du?");

       int yourAge = scanner.nextInt();

       if(yourAge == 24){
        System.out.println("ohh, das gleiche wie ich!");
       }
       else{
        System.out.println("ohh, " + yourAge + " ist eine gute Nummer!");
       }

       System.out.println("Wohnst du in Klagenfurt?");

       boolean yourPlace = scanner.nextBoolean();

       if(yourPlace){
        System.out.println("Ich auch!!");
       }
       else{
        System.out.println("dann wo?");

        String Place = scanner.nextLine();

        System.out.println(Place + " ist eine shöne Stadt:)");
       }

       scanner.nextLine();      //to clear the input buffer

       scanner.close();

       */

        //------------------------------------------------

        /*
        // EX.2 

        Scanner rectangle = new Scanner(System.in);

        System.out.println("Enter the width and height of a rectangle");

        double width = rectangle.nextDouble();

        double height = rectangle.nextDouble();

        double area = width * height;

        System.out.println("The area of the rectangle = " + area);


        rectangle.close();

        */

        /* Ex.3

        Scanner cart = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");

        String item = cart.nextLine();

        System.out.print("What is the price for each?: ");

        double price = cart.nextDouble();

        System.out.print("How many would you like?: ");

        int quantity = cart.nextInt();

        double total = price * quantity;

        System.out.println(" You have bought " + quantity + " " + item);
        System.out.println(" Your total is $" + total);

        cart.close();
        */

        /* Ex.4

       Random random = new Random();

       int dice = random.nextInt(1, 7);

       boolean coin = random.nextBoolean();

       if(coin){
        System.out.println("the coin is flipped as: Heads");
       }
       else{
        System.out.println("the coin is flipped as: Tails");
       }

       System.out.println("the num generated = " + dice);
       */
      /*Ex.5
     //Math.PI
     // Math.E
     // Math.pow(2, 3);
     //Math.abs();
     // Math.sqrt();
     // Math.round();
     // Math.ceil(),     >> round up
     // Math.floor();    >> round down
     // Math.max(20,30);
     // Math.min(20,30);
     
      System.out.printf("num = %.2f\n", Math.sqrt(15));
      String name = "nesma";
      int age = 24;
      System.out.printf("%s is %d years old.", name, age);
      */

      /*Ex.6 
      String name = "nesma kamal";
      int len = name.length();
      char letter = name.charAt(0);
      int index = name.indexOf("a"); //1st occurance
      int lastIndex = name.lastIndexOf("a"); //last occurance
      name = name.toUpperCase();
      name = name.toLowerCase();
      name = name.replace("a", "o");
      boolean nameState = name.isEmpty();
      boolean nameSpaces = name.contains(" ");
      boolean nameCheck = name.equals("password");
      nameCheck = name.equalsIgnoreCase("Nesmo komol");

      System.out.printf("%d %c %d %d %s %b %b %b\n", len, letter, index, lastIndex, name, nameState, nameSpaces, nameCheck);
      
      String email = "ne.kamal@nu.edu.eg";
      int sepIndex = email.indexOf("@");
      String userName = email.substring(0, sepIndex);
      String domain = email.substring(sepIndex, email.length());
      //String domain = email.substring(sepIndex + 1);
      System.out.printf("Username: %s\n Domain: %s\n", userName, domain);
      */

   /*Ex.7 */


       

      
       
    }
}