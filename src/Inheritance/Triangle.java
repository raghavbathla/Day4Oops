package Inheritance;

public class Triangle extends Square{
    int a = 30;
    int b= 40;
    int c = 60;
    public int area(){
        return a*b*c;
    }

    public void print(){
        System.out.println("Area of square is" + this.area());
        System.out.println("Area of rectangle is" + super.area());
    }

}
