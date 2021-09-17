package StaticQuest;

public class StaticExample {
    public static int a = 30;
    public int b = 40;

    public StaticExample( int b) {
        this.b = b;

    }
    public  void printValues(){
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }
    public static void multiply()
    {
        System.out.println("area"+a);
    }

}
