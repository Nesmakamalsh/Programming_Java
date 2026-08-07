public class Book{

    String title;
    int numberofPages;

    Book(String title, int numberofPages){
        this.title = title;
        this.numberofPages = numberofPages;
    }


    String bookInfo(){
        return this.title +" ("+ this.numberofPages +" "+ " page)";
    }


}