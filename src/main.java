import java.util.Scanner;

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
    }
}