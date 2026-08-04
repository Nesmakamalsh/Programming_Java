import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class main{

    int x = 5;   //class var can be used among all classes
    static double balance = 0;
    static String[] Questions = {"What is Austria 1st language?", "Who is the current Egyptian presedient?", "What is the meal i am craving the most?"};
    static String[][] Answers = {{"1. English", "2. Deutsch", "3. Spanish"},{"1. Sese", "2. Morsi", "3. Sadat"},{"1. Molocheia", "2. Bamya", "3. Mahshi"}};

    public static void main(String[] args) throws InterruptedException{

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
        
      int income = 3000;
      double taxRate = (income >= 4000) ? 0.25 : 0.15;
      System.out.printf("%.2f\n", taxRate);
      


      String email = "ne.kamal@nu.edu.eg";
      int sepIndex = email.indexOf("@");
      String userName = email.substring(0, sepIndex);
      String domain = email.substring(sepIndex, email.length());
      //String domain = email.substring(sepIndex + 1);
      System.out.printf("Username: %s\n Domain: %s\n", userName, domain);

      */

   /*Ex.7 

   Scanner scanner = new Scanner(System.in);
   System.out.printf("Enter the first number: ");
   double num1 = scanner.nextDouble();
   System.out.printf("Enter the Second number: ");
   double num2 = scanner.nextDouble();
   System.out.printf("Enter the operator: ");
   String operation = scanner.next();
   
   switch(operation){
    case "+" -> System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
    case "-" -> System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
    case "*" -> System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
    case "/" -> System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
    case "^" -> System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, Math.pow(num1, num2));
    default -> System.out.println("Choose one of these operations: +, -, *, /, ^");
   }
    scanner.close();

   */
  /* 
  Scanner scanner = new Scanner(System.in);
  String var;

   do{
    System.out.println("You are trapped, you must find an Exit!");
    var = scanner.nextLine();
   }while(!var.equals("Q"));


       

    scanner.close();
       */

    /* 

    Scanner scanner = new Scanner(System.in);
    double num;

    do{
        System.out.print("What is the time RN? ");
        num = scanner.nextDouble();
        if(num < 12){
        System.out.println("Wait a bit");}
    }while(num < 11.59 && num < 12);

    if(num < 12){
        for(int i=10; i>0; i--){
        System.out.println(i);
        Thread.sleep(1000);
    }
    System.out.println("Happy New year!");

    }
    else{
        System.out.println("Enjoy ur celebration!");
    }

    scanner.close();
    */

    /* 
   String name = "Nesma";
   int age = 24;

   introduceurself(name, age);

   double num = 5.25;

   System.out.println(sqrnum(num));
    */  
   /* 

   int x = 3; //local var to the main class
   System.out.println(x);  //local vars have higher pirority over class vars inside the class if both have the same name param
    */

   /* 
//Banking Program
 Scanner scanner = new Scanner(System.in);
 int choice;
 double insertMoney;
 double withdrawMoney;

do{

    System.out.println("*****************");
    System.out.println("Banking Program");
    System.out.println("*****************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    System.out.printf("Enter your choice (1-4): ");

    choice = scanner.nextInt();

    if(choice == 1){
    System.out.printf("Your current Balance is %f EUR \n", showBalance());
}
else if(choice == 2){
    System.out.printf("Enter your deposit amount: ");
    insertMoney = scanner.nextDouble();
    Deposit(insertMoney);
    System.out.printf("You've deposit %f EUR into your account \n", insertMoney);
}
else if(choice == 3){
    System.out.printf("Enter your withdrawal amount: ");
    withdrawMoney = scanner.nextDouble();
    Withdraw(withdrawMoney);
    System.out.printf("You've withdrawed %f EUR \n", withdrawMoney);

}
else{
    System.out.println("Invalid input!");
}

}while(choice != 4);

System.out.println("Thanks for using our service, have a good day!");



scanner.close();
*/
Scanner scanner = new Scanner(System.in);

//String[] fruits = {"Orange", "Apple", "Banana", "Grabs"};

//int numofFruits = fruits.length;
//System.out.println(numofFruits);

//System.out.println(fruits[1]);
// for printing all elements

//Arrays.sort(fruits);  //arranged alphapitacally
//Arrays.fill(fruits, "pineapple");

//for(String fruit : fruits){                //enhanced for loop/ for each loop
 //   System.out.println(fruit);
//}

//String[] names = new String[3];  //to create an empty array you need to know the size of the array

//for(int i=0; i<3; i++){
//    names[i] = scanner.nextLine();
//}

//for(String name : names){
//   System.out.println(name);}
/* 
int[] numbers = {1,2,3,4,5,6};
int target = 5;

for(int i=0; i<numbers.length; i++){
    if(target == numbers[i]){
        System.out.printf("the target in index %d \n", i);
        break;
    }
}*/
/*String[] fruits = {"Orange", "Apple", "Banana", "Grabs"};
String target = "grabs";

for(int i=0; i<fruits.length; i++){
    if(target.equalsIgnoreCase(fruits[i])){   // string is a refernce type var which means comparing the memory locations and that is not the target
        System.out.printf("the target in index %d \n", i);
        break;
    }
}

scanner.close();
*/
//add(1,2,3,4,5);

//System.out.println(average(1,2,3,4,5));

/*char[][] telephone = {{'0','1','2'},{'3','4','5'},{'6','7','8'},{'9','0','#'}};

for(char[] nums:telephone){
    for(char num:nums){
        System.out.printf("%c ",num);
    }
    System.out.println();

}*/
/* 
int ansInput;
int total = 0;  

System.out.println("*************************");
System.out.println("Welcome to the quiz game!");
System.out.println("*************************");
System.out.println();
printQuestions(1);
System.out.println();
printAnswers(1);
System.out.println();
System.out.printf("Enter your choice (1-3): ");
ansInput = scanner.nextInt();
if(ansCheck(1, ansInput)){
    total += 1;
}

System.out.println();
printQuestions(2);
System.out.println();
printAnswers(2);
System.out.println();
System.out.printf("Enter your choice (1-3): ");
ansInput = scanner.nextInt();
if(ansCheck(2, ansInput)){
    total += 1;
}

System.out.println();
printQuestions(3);
System.out.println();
printAnswers(3);
System.out.println();
System.out.printf("Enter your choice (1-3): ");
ansInput = scanner.nextInt();
if(ansCheck(3, ansInput)){
    total += 1;
}
System.out.println();
System.out.printf("You've guessed %d right answers out of 3", total);
*/

// Objects : entities that hold data (attributes)
Car car = new Car();

System.out.println(car.model);
// objects : can perform actions (methods)
car.start();
car.stop();

scanner.close();


    }


    //metods in Java are replacing functions as each function needs to be in a class in java so it's a method
    /* 
    static void introduceurself(String name, int age){
        //void means return nothing, if there is a return it can be int, double..etc instead of void
        System.out.printf("My name is %s \n", name);
        System.out.printf("I am %d yrs \n", age);
    }

    static double sqrnum(double num){
        return Math.sqrt(num);
    }
        */

    /* //BANKING PROGRAM METHODS 

    static double showBalance(){ 

        return balance;
    }

    static double Deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    static double Withdraw(double amount){
        balance = balance - amount;
        return balance;
    }
        
*/
//for unknown no. of arguments, ... is a way to pack all the arguments in array
/* 
static void add(int... numbers){
    
    for(int i=0; i< numbers.length; i++){
        System.out.println(numbers[i]);
    }

}


static double average(double... nums){
    double sum = 0;
    for(double num : nums){
        sum += num;
    }

    int len = nums.length;

    return (sum / len);


}

static void printQuestions(int quesNum){

    switch(quesNum){
        case 1 -> System.out.println(Questions[0]);
        case 2 -> System.out.println(Questions[1]);
        case 3 -> System.out.println(Questions[2]);
    }
}

static void printAnswers(int ansNum){
    switch(ansNum){
        case 1 : {
            for(int i=0; i<3; i++){
                System.out.println(Answers[0][i]);
            }
        };
        break;
        case 2 : {
            for(int i=0; i<3; i++){
                System.out.println(Answers[1][i]);
            }
        };
        break;
        case 3 :{
            for(int i=0; i<3; i++){
                System.out.println(Answers[2][i]);
            }
        };
        break;
    }
}

static boolean ansCheck(int quesInput, int ansInput){
    switch(quesInput){
        case 1 :{
            switch(ansInput){
                case 1 :{
                    return false;
                }
                case 2 :{
                    return true;
                }
                case 3 :{
                    return false;
                }
             }
        };
        case 2 :{
            switch(ansInput){
                case 1 :{
                    return true;
                }
                case 2 :{
                    return false;
                }
                case 3 :{
                    return false;
                }
             }
        };
        case 3 :{
            switch(ansInput){
                case 1 :{
                    return false;
                }
                case 2 :{
                    return false;
                }
                case 3 :{
                    return true;
                }
             }
        };
        default :{
            return false;
        }
    }

}
*/

}