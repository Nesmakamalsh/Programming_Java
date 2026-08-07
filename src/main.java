import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;

public class main {

    int x = 5; // class var can be used among all classes
    static double balance = 0;
    static String[] Questions = { "What is Austria 1st language?", "Who is the current Egyptian presedient?",
            "What is the meal i am craving the most?" };
    static String[][] Answers = { { "1. English", "2. Deutsch", "3. Spanish" }, { "1. Sese", "2. Morsi", "3. Sadat" },
            { "1. Molocheia", "2. Bamya", "3. Mahshi" } };

    public static void main(String[] args) throws InterruptedException {

        /*
         * // EX.1
         * 
         * System.out.println("Hallo ich bin Nesma\n");
         * 
         * int age = 24;
         * boolean istNett = true;
         * System.out.println("Ich bin " + age + " Jahre alt");
         * 
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("Was ist dein Name?");
         * 
         * String name = scanner.nextLine();
         * 
         * // .nextLine() >> will take the full name including spaces
         * // .next() >> no spaces considered, so will take the name before the space
         * only
         * 
         * if(istNett){
         * System.out.println("Freut mich dich kennenlernen " + name);
         * }
         * else{
         * System.out.println("Wir sehen uns noch " + name);
         * }
         * 
         * System.out.println("Wie alt bist du?");
         * 
         * int yourAge = scanner.nextInt();
         * 
         * if(yourAge == 24){
         * System.out.println("ohh, das gleiche wie ich!");
         * }
         * else{
         * System.out.println("ohh, " + yourAge + " ist eine gute Nummer!");
         * }
         * 
         * System.out.println("Wohnst du in Klagenfurt?");
         * 
         * boolean yourPlace = scanner.nextBoolean();
         * 
         * if(yourPlace){
         * System.out.println("Ich auch!!");
         * }
         * else{
         * System.out.println("dann wo?");
         * 
         * String Place = scanner.nextLine();
         * 
         * System.out.println(Place + " ist eine shöne Stadt:)");
         * }
         * 
         * scanner.nextLine(); //to clear the input buffer
         * 
         * scanner.close();
         * 
         */

        // ------------------------------------------------

        /*
         * // EX.2
         * 
         * Scanner rectangle = new Scanner(System.in);
         * 
         * System.out.println("Enter the width and height of a rectangle");
         * 
         * double width = rectangle.nextDouble();
         * 
         * double height = rectangle.nextDouble();
         * 
         * double area = width * height;
         * 
         * System.out.println("The area of the rectangle = " + area);
         * 
         * 
         * rectangle.close();
         * 
         */

        /*
         * Ex.3
         * 
         * Scanner cart = new Scanner(System.in);
         * 
         * System.out.print("What item would you like to buy?: ");
         * 
         * String item = cart.nextLine();
         * 
         * System.out.print("What is the price for each?: ");
         * 
         * double price = cart.nextDouble();
         * 
         * System.out.print("How many would you like?: ");
         * 
         * int quantity = cart.nextInt();
         * 
         * double total = price * quantity;
         * 
         * System.out.println(" You have bought " + quantity + " " + item);
         * System.out.println(" Your total is $" + total);
         * 
         * cart.close();
         */

        /*
         * Ex.4
         * 
         * Random random = new Random();
         * 
         * int dice = random.nextInt(1, 7);
         * 
         * boolean coin = random.nextBoolean();
         * 
         * if(coin){
         * System.out.println("the coin is flipped as: Heads");
         * }
         * else{
         * System.out.println("the coin is flipped as: Tails");
         * }
         * 
         * System.out.println("the num generated = " + dice);
         */
        /*
         * Ex.5
         * //Math.PI
         * // Math.E
         * // Math.pow(2, 3);
         * //Math.abs();
         * // Math.sqrt();
         * // Math.round();
         * // Math.ceil(), >> round up
         * // Math.floor(); >> round down
         * // Math.max(20,30);
         * // Math.min(20,30);
         * 
         * System.out.printf("num = %.2f\n", Math.sqrt(15));
         * String name = "nesma";
         * int age = 24;
         * System.out.printf("%s is %d years old.", name, age);
         */

        /*
         * Ex.6
         * String name = "nesma kamal";
         * int len = name.length();
         * char letter = name.charAt(0);
         * int index = name.indexOf("a"); //1st occurance
         * int lastIndex = name.lastIndexOf("a"); //last occurance
         * name = name.toUpperCase();
         * name = name.toLowerCase();
         * name = name.replace("a", "o");
         * boolean nameState = name.isEmpty();
         * boolean nameSpaces = name.contains(" ");
         * boolean nameCheck = name.equals("password");
         * nameCheck = name.equalsIgnoreCase("Nesmo komol");
         * 
         * System.out.printf("%d %c %d %d %s %b %b %b\n", len, letter, index, lastIndex,
         * name, nameState, nameSpaces, nameCheck);
         * 
         * int income = 3000;
         * double taxRate = (income >= 4000) ? 0.25 : 0.15;
         * System.out.printf("%.2f\n", taxRate);
         * 
         * 
         * 
         * String email = "ne.kamal@nu.edu.eg";
         * int sepIndex = email.indexOf("@");
         * String userName = email.substring(0, sepIndex);
         * String domain = email.substring(sepIndex, email.length());
         * //String domain = email.substring(sepIndex + 1);
         * System.out.printf("Username: %s\n Domain: %s\n", userName, domain);
         * 
         */

        /*
         * Ex.7
         * 
         * Scanner scanner = new Scanner(System.in);
         * System.out.printf("Enter the first number: ");
         * double num1 = scanner.nextDouble();
         * System.out.printf("Enter the Second number: ");
         * double num2 = scanner.nextDouble();
         * System.out.printf("Enter the operator: ");
         * String operation = scanner.next();
         * 
         * switch(operation){
         * case "+" -> System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
         * case "-" -> System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
         * case "*" -> System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
         * case "/" -> System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
         * case "^" -> System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2,
         * Math.pow(num1, num2));
         * default ->
         * System.out.println("Choose one of these operations: +, -, *, /, ^");
         * }
         * scanner.close();
         * 
         */
        /*
         * Scanner scanner = new Scanner(System.in);
         * String var;
         * 
         * do{
         * System.out.println("You are trapped, you must find an Exit!");
         * var = scanner.nextLine();
         * }while(!var.equals("Q"));
         * 
         * 
         * 
         * 
         * scanner.close();
         */

        /*
         * 
         * Scanner scanner = new Scanner(System.in);
         * double num;
         * 
         * do{
         * System.out.print("What is the time RN? ");
         * num = scanner.nextDouble();
         * if(num < 12){
         * System.out.println("Wait a bit");}
         * }while(num < 11.59 && num < 12);
         * 
         * if(num < 12){
         * for(int i=10; i>0; i--){
         * System.out.println(i);
         * Thread.sleep(1000);
         * }
         * System.out.println("Happy New year!");
         * 
         * }
         * else{
         * System.out.println("Enjoy ur celebration!");
         * }
         * 
         * scanner.close();
         */

        /*
         * String name = "Nesma";
         * int age = 24;
         * 
         * introduceurself(name, age);
         * 
         * double num = 5.25;
         * 
         * System.out.println(sqrnum(num));
         */
        /*
         * 
         * int x = 3; //local var to the main class
         * System.out.println(x); //local vars have higher pirority over class vars
         * inside the class if both have the same name param
         */

        /*
         * //Banking Program
         * Scanner scanner = new Scanner(System.in);
         * int choice;
         * double insertMoney;
         * double withdrawMoney;
         * 
         * do{
         * 
         * System.out.println("*****************");
         * System.out.println("Banking Program");
         * System.out.println("*****************");
         * System.out.println("1. Show Balance");
         * System.out.println("2. Deposit");
         * System.out.println("3. Withdraw");
         * System.out.println("4. Exit");
         * System.out.printf("Enter your choice (1-4): ");
         * 
         * choice = scanner.nextInt();
         * 
         * if(choice == 1){
         * System.out.printf("Your current Balance is %f EUR \n", showBalance());
         * }
         * else if(choice == 2){
         * System.out.printf("Enter your deposit amount: ");
         * insertMoney = scanner.nextDouble();
         * Deposit(insertMoney);
         * System.out.printf("You've deposit %f EUR into your account \n", insertMoney);
         * }
         * else if(choice == 3){
         * System.out.printf("Enter your withdrawal amount: ");
         * withdrawMoney = scanner.nextDouble();
         * Withdraw(withdrawMoney);
         * System.out.printf("You've withdrawed %f EUR \n", withdrawMoney);
         * 
         * }
         * else{
         * System.out.println("Invalid input!");
         * }
         * 
         * }while(choice != 4);
         * 
         * System.out.println("Thanks for using our service, have a good day!");
         * 
         * 
         * 
         * scanner.close();
         */
        // Scanner scanner = new Scanner(System.in);

        // String[] fruits = {"Orange", "Apple", "Banana", "Grabs"};

        // int numofFruits = fruits.length;
        // System.out.println(numofFruits);

        // System.out.println(fruits[1]);
        // for printing all elements

        // Arrays.sort(fruits); //arranged alphapitacally
        // Arrays.fill(fruits, "pineapple");

        // for(String fruit : fruits){ //enhanced for loop/ for each loop
        // System.out.println(fruit);
        // }

        // String[] names = new String[3]; //to create an empty array you need to know
        // the size of the array

        // for(int i=0; i<3; i++){
        // names[i] = scanner.nextLine();
        // }

        // for(String name : names){
        // System.out.println(name);}
        /*
         * int[] numbers = {1,2,3,4,5,6};
         * int target = 5;
         * 
         * for(int i=0; i<numbers.length; i++){
         * if(target == numbers[i]){
         * System.out.printf("the target in index %d \n", i);
         * break;
         * }
         * }
         */
        /*
         * String[] fruits = {"Orange", "Apple", "Banana", "Grabs"};
         * String target = "grabs";
         * 
         * for(int i=0; i<fruits.length; i++){
         * if(target.equalsIgnoreCase(fruits[i])){ // string is a refernce type var
         * which means comparing the memory locations and that is not the target
         * System.out.printf("the target in index %d \n", i);
         * break;
         * }
         * }
         * 
         * scanner.close();
         */
        // add(1,2,3,4,5);

        // System.out.println(average(1,2,3,4,5));

        /*
         * char[][] telephone =
         * {{'0','1','2'},{'3','4','5'},{'6','7','8'},{'9','0','#'}};
         * //enhanced for loop
         * for(char[] nums:telephone){
         * for(char num:nums){
         * System.out.printf("%c ",num);
         * }
         * System.out.println();
         * 
         * }
         */
        /*
         * int ansInput;
         * int total = 0;
         * 
         * System.out.println("*************************");
         * System.out.println("Welcome to the quiz game!");
         * System.out.println("*************************");
         * System.out.println();
         * printQuestions(1);
         * System.out.println();
         * printAnswers(1);
         * System.out.println();
         * System.out.printf("Enter your choice (1-3): ");
         * ansInput = scanner.nextInt();
         * if(ansCheck(1, ansInput)){
         * total += 1;
         * }
         * 
         * System.out.println();
         * printQuestions(2);
         * System.out.println();
         * printAnswers(2);
         * System.out.println();
         * System.out.printf("Enter your choice (1-3): ");
         * ansInput = scanner.nextInt();
         * if(ansCheck(2, ansInput)){
         * total += 1;
         * }
         * 
         * System.out.println();
         * printQuestions(3);
         * System.out.println();
         * printAnswers(3);
         * System.out.println();
         * System.out.printf("Enter your choice (1-3): ");
         * ansInput = scanner.nextInt();
         * if(ansCheck(3, ansInput)){
         * total += 1;
         * }
         * System.out.println();
         * System.out.printf("You've guessed %d right answers out of 3", total);
         */
        /*
         * // Objects : entities that hold data (attributes)
         * Car car = new Car();
         * 
         * System.out.println(car.model);
         * // objects : can perform actions (methods)
         * car.start();
         * car.stop();
         */

        // Constructor: a special method in a class to intialise objects, within you can
        // pass different arguments to different objects
        /*
         * Student student1 = new Student("Nesma", 24, 3.73);
         * Student student2 = new Student("Ahmed", 28, 3.99);
         * 
         * System.out.println(student1.name +" "+ student1.age +" "+ student1.GPA+" "+
         * student1.isEnrolled);
         * System.out.println(student2.name+" "+ student2.age +" "+ student2.GPA+" "+
         * student2.isEnrolled);
         * 
         * student1.work();
         * student2.work();
         */

        // Overloaded constructors: allowing class to have multiple constuctors with
        // different parameter lists. and enble objects to be initialised in different
        // ways
        /*
         * User user1 = new User("Nesma");
         * User user2 = new User("Ahmed", "Ahmed.Aboahmed@iis.fraunhofer.de",
         * "ahmed06121997");
         * User user3 = new User("Valerio", "Radishi.valerio@infineon.com");
         * 
         * System.out.println(user1.username +" "+ user1.password);
         * System.out.println(user2.username +" "+user2.email+" "+ user2.password);
         * System.out.println(user3.username +" "+user3.email+" "+ user3.password);
         * 
         * user1.company();
         * user2.company();
         */
        // Car[] is the data type >> array of objects
        /*
         * Car car1 = new Car("Fiat", "128");
         * Car car2 = new Car("BMW", "BLA");
         * Car car3 = new Car("Audi", "BLABLA");
         * 
         * Car[] cars = {car1, car2, car3};
         * 
         * for(int i =0; i<cars.length; i++){
         * cars[i].drive();
         * }
         */
        /*
         * Car[] cars = {new Car("Fiat", "128"), new Car("BMW", "BLA"), new Car("Audi",
         * "BLABLA")};
         * 
         * for(Car car:cars){
         * car.drive();
         * }
         */
        // Static belongs to the class itself. Non-static belongs to an object created
        // from the class.
        // static make a var or a method belong to the class instead of belonging to an
        // object from the class >> used for shared resources over the whole class or
        // utilitz methods like Math.round(), round() is a static method of the Math
        // class so we don't need to create an object from math in order to use round
        // method
        /*
         * Friend friend1 = new Friend("salah");
         * Friend friend2 = new Friend("salma");
         * Friend friend3 = new Friend("sadeen");
         * 
         * //used the class directly not friend1 obj for example, meaning the
         * numofFriends is public to the whole class not local to any obj
         * Friend.num();
         */
        // inheritance: one class inhirets the attributes and methods from another class
        // Child <- Parent
        // -> dog
        // Child <- Parent <- Grandparent >>> multilevel inhertance ex: Zoo -> Animal -
        // -> cat
        /*
         * Dog dog = new Dog("Poppy", "Dog", "black");
         * System.out.println(dog.isAlive);
         * Cat cat = new Cat("citty", "cat", "stipped white and beige");
         * System.out.println(cat.isAlive);
         * dog.eat();
         * cat.eat();
         * dog.Speak();
         * cat.Speak();
         * 
         * dog.intro();
         * cat.intro();
         * System.out.println(cat.isAlive);
         * // method override is when a subclass (child) provide its own implementation
         * of a method that was prev defined as to overriding this method to suit this
         * child specifically
         * Fish fish = new Fish("nemo", "Fish", "orange");
         * 
         * dog.move();
         * cat.move();
         * fish.move();
         * 
         * //.toString(): method inherited from the object class. used to return a
         * string representation of an object instead of Hahcode refering to a memory
         * address, this hash code can be overriden with a string
         * 
         * Car car = new Car("Ford", "Mustang", 2025, 500000);
         * 
         * System.out.println(car);
         */

        // abstract: used to define abstract classes and methods
        // abstraction is the process of hiding implementation details and showing only
        // the essintial features and adding some level of security
        // for ex: abstract classes can't be instantiated directly >> Shape shape = new
        // Shape(); will give an err as you can't intintiate objects or change arguments
        // from shape but can do that with its children for the sake of security
        // abstract classes can contain abstract methods >> should be defined in the
        // children classes not the parent class and must be implemented by the
        // children, can't be inherited directly like display();
        // abstract classes can contain concrete methods >> inhertied directly like
        // display();

        /*
         * Circle circle = new Circle(3);
         * Rectangle rectangle = new Rectangle(4,5);
         * 
         * circle.display();
         * 
         * System.out.println(circle.area());
         * System.out.println(rectangle.area());
         */

        // Interface: a blueprint for a class that spicifies a set of abstract methods
        // that implementing classes MUST define >> supports multiple inheritance-like
        // behaviour
        // meaning it's the same as apstracted classes but allow the idea of having
        // multiple parents like Fish();
        /*
         * Cat cat = new Cat();
         * Fish fish = new Fish();
         * Hawk hawk = new Hawk();
         * 
         * cat.flee("Dog");
         * fish.attack("Sardiens");
         * fish.flee("Shark");
         * hawk.attack("Rat");
         */

        // Polymorphysim: poly >> many , morph >> shape
        // used to to inroduce the ability to identify objects as other objects, they
        // can be treated as objects of a common super class, also works with interfaces
        /*
         * Car car = new Car();
         * Bike bike = new Bike();
         * Boat boat = new Boat();
         * 
         * Veichle[] veichles ={car, bike, boat};
         * 
         * for(Veichle veichle:veichles){
         * veichle.go();
         * 
         * }
         */
        // Runtime Polymerphysim: when the method that is excuted decided during runtime
        // based on the actual type of the object
        /*
         * Veichle veichle;
         * 
         * System.out.printf("Enter 1 for car, 2 for bike, 3 for boat: ");
         * int choice = scanner.nextInt();
         * 
         * if(choice ==1){
         * veichle = new Car();
         * veichle.go();
         * }
         * else if(choice ==2){
         * veichle = new Bike();
         * veichle.go();
         * }
         * else if(choice ==3){
         * veichle = new Boat();
         * veichle.go();
         * }
         */
        // getters, setters: help protect object data and add rules for accessing or
        // modifying them >> for private data
        // getters: methods that make a field readable.
        // setters: methods that make field writable.
        /*
         * Zoo zoo = new Zoo("fluffy", "bear", 15);
         * 
         * Animal animal = new Animal("fluffy", "bear", "brown", 15);
         * 
         * animal.setName("doppy");
         * 
         * 
         * 
         * animal.setAge(-100);
         * 
         * System.out.println(animal.getAge());
         * 
         * animal.intro();
         */

        // Aggregation: represents "has a" relationship between objects, as one obj
        // contains another obj as par of its structure but the contained objects can
        // exist independentaly
        // without parent/children relationships
        // our library obj has a book obj within it, but books exist independentaly
        // outside of the library, meaning if we deleted the library class, books still
        // exist>> unlike composition
        /*
         * Book book1 = new Book("Lord of the Rings", 455);
         * Book book2 = new Book("Norma People", 216);
         * Book book3 = new Book("Worlds Atlas", 2000);
         * 
         * Book[] books = {book1, book2, book3};
         * 
         * Library library = new Library("NYC", "Newyork city", 1985, books);
         * library.libraryInfo();
         */
        // Composition: represents "part-of" a relationship between objects, for ec
        // engine is a part of a car, it allows complex obects to be constructed from
        // smaller objects.
        // the key difference from aggregation is that the Engine object is created
        // inside the Car object so the engine cannot exist without a car
        /*
         * Car car = new Car("Ford", 2026, "V8");
         * car.start();
         */

        /*
         * //Wrapper classes: allow primitive value to be used as objects
         * "wrap them in a objects" >> needed when using collection frameworks or static
         * utilities
         * // the old method was wrapping the primitive var into an object as:
         * 
         * Integer a = new Integer(15);
         * Double b = new Double(3.14);
         * 
         * // new method of wrapping is Autoboxing:
         * 
         * Integer d = 15;
         * Double f = 13.4;
         * String e = "hallo";
         * 
         * //to unwrap it beck from object to a primitive value we use unboxing:
         * 
         * int x = d;
         * double z= f;
         * String y = e;
         * 
         * //Some static utility methods within wrapper classes:
         * //convert any oher datatype to string
         * 
         * String q = Integer.toString(123); //toString() is a static method within the
         * the Integer wrapper class
         * String l = Double.toString(12.8);
         * String m = Boolean.toString(false);
         * 
         * System.out.println(q+l+m);
         * 
         * //convert String to any datatype through the parsing method within the
         * wrapper classes
         * 
         * int A = Integer.parseInt("123");
         * double B = Double.parseDouble("15.5");
         * boolean D = Boolean.parseBoolean("true");
         * 
         * //check the user inputs through static utilities:
         * 
         * char letter = 'B';
         * System.out.println(Character.isLetter(letter));
         * System.out.println(Character.isUpperCase(letter));
         */
        // Arraylist: a resizable (dynamic) array that holds objects (Autoboxing)
        /*
         * ArrayList<String> fruits = new ArrayList<>();
         * 
         * fruits.add("Apple");
         * fruits.add("Orange");
         * fruits.add("Kiwi");
         * fruits.add("Pineapple");
         * 
         * 
         * //fruits.remove(1);
         * fruits.set(1, "Watermelon");
         * 
         * 
         * //System.out.println(fruits.get(3));
         * //System.out.println(fruits.size());
         * 
         * Collections.sort(fruits); //collection framework
         * 
         * //System.out.println(fruits);
         * 
         * ArrayList<String> foods = new ArrayList<>();
         * String food;
         * 
         * do{
         * System.out.printf("Enter the food you want, when done enter done: ");
         * food = scanner.nextLine();
         * if(!food.equals("done")){
         * foods.add(food);
         * }
         * 
         * }while(!food.equals("done"));
         * System.out.println(foods);
         */
        // scanner.close();

        // Exception: event that inturrupts the normal flow of a program {divide by
        // zero, wrong input,..etc}
        // try{}, catch{}, finally{}
        /* 
        try (Scanner scanner = new Scanner(System.in)) { // scanner is closed automatically in "try with recources"

            System.out.printf("Enter a number: ");
            int num = scanner.nextInt();
        } catch (ArithmeticException err) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException err){
            System.out.println("this not a number dumbass!");
        } catch (Exception err){
            System.out.println("Smth went wrong");
        } finally {
            System.out.println("enough errs");
        }
            */

        //Writting a files in Java (4 popular options)
        // 1. FileWriter >> FOR SMALL TO MEDIUM SIZED TEXT FILES
        // 2. BufferedWriter >> Large amount of text
        // 3. PrintWriter >> Structured data like reports, logs
        // 4. FileOutputStream >> Best for binary files (e.g. videos, images, audio files)
        /* 
        String filePath = "test.txt";
        String textContent = """
                Everybody tells me that it's about time that i moved on;
                sometimes i feel lonley in the touch of your arms
                Oh i can't go back to the river
                but it's my root, my vains, in my blood!!
                                """;
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);

        } catch(FileNotFoundException err){
            System.out.println("could not locate the fie location");
        }
        catch (IOException err){
            System.out.println("Can't write this file");
        }
        */
    
        // Read files using Java (3 popular options)
        // 1. BufferedReader + FileReader >> best for reading text files line by line
        // 2. FileInputStream >> Best for binary files (e.g. videos, images, audio files)
        // 3. RandomAccessFile >> Best for read/write a specific portions of a large file

        /* 

        String filePath = "test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch(FileNotFoundException err){
            System.out.println("could not locate this file");
        } catch(IOException err){
            System.out.println("smth went wrong");
        }
            */

        /*

        String filePath = "/workspaces/Programming_JavaxPython/Halfway In - Anno Domini Beats.au";
        File file = new File(filePath);

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file)){
                Clip clip = AudioSystem.getClip();
                clip.open(audio);

                String response = " ";

                while(!response.equals("Q")){
                    System.out.println("press P to play the song");
                    System.out.println("press S to stop the song");
                    System.out.println("press R to reset the song");
                    System.out.println("press Q to quit");
                    System.out.printf("Enter your choice: ");
                    response = scanner.next().toUpperCase();

                    switch(response){
                        case "P" -> clip.start();
                        case "S" -> clip.stop();
                        case "R" -> clip.setMicrosecondPosition(0);
                        case "Q" -> clip.close();
                        default -> System.out.println("Invalid Input");
                    }
                }

        }
        catch(FileNotFoundException err){
            System.out.println("can't locate the Audio file");
        } catch (LineUnavailableException err){
            System.out.println("Can't access the Audio file");
        } catch (UnsupportedAudioFileException err){
            System.out.println("Unsupported Audio file");
        }
        catch(IOException err){
            System.out.println("smth went wrong");
        }
        finally{
            System.out.println("Bye!");
        }

        */



        

    }

    // metods in Java are replacing functions as each function needs to be in a
    // class in java so it's a method
    /*
     * static void introduceurself(String name, int age){
     * //void means return nothing, if there is a return it can be int, double..etc
     * instead of void
     * System.out.printf("My name is %s \n", name);
     * System.out.printf("I am %d yrs \n", age);
     * }
     * 
     * static double sqrnum(double num){
     * return Math.sqrt(num);
     * }
     */

    /*
     * //BANKING PROGRAM METHODS
     * 
     * static double showBalance(){
     * 
     * return balance;
     * }
     * 
     * static double Deposit(double amount){
     * balance = balance + amount;
     * return balance;
     * }
     * static double Withdraw(double amount){
     * balance = balance - amount;
     * return balance;
     * }
     * 
     */
    // for unknown no. of arguments, ... is a way to pack all the arguments in array
    /*
     * static void add(int... numbers){
     * 
     * for(int i=0; i< numbers.length; i++){
     * System.out.println(numbers[i]);
     * }
     * 
     * }
     * 
     * 
     * static double average(double... nums){
     * double sum = 0;
     * for(double num : nums){
     * sum += num;
     * }
     * 
     * int len = nums.length;
     * 
     * return (sum / len);
     * 
     * 
     * }
     * 
     * static void printQuestions(int quesNum){
     * 
     * switch(quesNum){
     * case 1 -> System.out.println(Questions[0]);
     * case 2 -> System.out.println(Questions[1]);
     * case 3 -> System.out.println(Questions[2]);
     * }
     * }
     * 
     * static void printAnswers(int ansNum){
     * switch(ansNum){
     * case 1 : {
     * for(int i=0; i<3; i++){
     * System.out.println(Answers[0][i]);
     * }
     * };
     * break;
     * case 2 : {
     * for(int i=0; i<3; i++){
     * System.out.println(Answers[1][i]);
     * }
     * };
     * break;
     * case 3 :{
     * for(int i=0; i<3; i++){
     * System.out.println(Answers[2][i]);
     * }
     * };
     * break;
     * }
     * }
     * 
     * static boolean ansCheck(int quesInput, int ansInput){
     * switch(quesInput){
     * case 1 :{
     * switch(ansInput){
     * case 1 :{
     * return false;
     * }
     * case 2 :{
     * return true;
     * }
     * case 3 :{
     * return false;
     * }
     * }
     * };
     * case 2 :{
     * switch(ansInput){
     * case 1 :{
     * return true;
     * }
     * case 2 :{
     * return false;
     * }
     * case 3 :{
     * return false;
     * }
     * }
     * };
     * case 3 :{
     * switch(ansInput){
     * case 1 :{
     * return false;
     * }
     * case 2 :{
     * return false;
     * }
     * case 3 :{
     * return true;
     * }
     * }
     * };
     * default :{
     * return false;
     * }
     * }
     * 
     * }
     */

}