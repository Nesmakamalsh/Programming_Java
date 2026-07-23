import java.util.Scanner;

public class main{
    public static void main(String[] args){
        System.out.println("Hallo ich bin Nesma\n");
        /* 
        This is how to write a comment
        */
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


       scanner.close();
    }
}