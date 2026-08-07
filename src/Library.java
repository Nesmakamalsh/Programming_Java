public class Library{

    String name;
    String location;
    int year;
    Book[] books;


    Library(String name, String location, int year, Book[] books){
        this.name = name;
        this.location = location;
        this.year = year;
        this.books = books;
    }


    void libraryInfo(){
        System.out.println("The"+" "+ this.name +" library in "+ this.location +" established in year "+ this.year);
        System.out.println("Books available");
        for(Book book:books){
            System.out.println(book.bookInfo());
        }

    }
}