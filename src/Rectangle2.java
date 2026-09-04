public class Rectangle2{
    private int Width;
    private int Height;
    private int Area;
    private static int count;

    Rectangle2(){
        this.Height = 20;
        this.Width = 10;
        count++;
    }

    Rectangle2(int Height, int Width){
        this.Height = Height;
        this.Width = Width;
        count++;
    }

    int calculateArea(){
        this.Area= Height*Width;
        return Area;
    }

    void printInfo(){
        System.out.printf("The height of the Rectangle= %d, Width= %d, Area= %d", this.Height, this.Width, this.Area);

    }

    void setHeight(int Height){
        this.Height = Height;
    }
    void setWidth(int Width){
        this.Width = Width;
    }
    int getHeight(){
        return this.Height;
    }

    int getWidth(){
        return this.Width;
    }

    int getArea(){
        return this.Area;
    }

    static void setCount(int Count){
        Count = count;
    }

    static int getCount(){
        return count;
    }
}