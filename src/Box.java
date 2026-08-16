public class Box<T, U>{

    T item;
    U price;

    Box(T item, U price){
        this.item=item;
        this.price = price;
    }

    void setItem(T item){
        this.item = item;
    }

    U getItem(){
        return this.price;
    }

}