public class Student{
    String name;
    int age;
    double GPA;
    boolean isEnrolled;



    Student(String name, int age, double GPA){
        // this here replacing the object >> student1.name ..etc
        this.name = name;
        this.age = age;
        this.GPA = GPA;
        this.isEnrolled = true;

    }
    Student(String name){
        this.name = name;
    }

    void work(){
        System.out.println(this.name +" is a good coworker");
    }

}