package StaticQuest;

public class StaticMain {
    
    public static void main(String[] args)
    {

        StaticExample staticExample = new StaticExample(30);
        staticExample.printValues();
        StaticExample.multiply();
        StaticExample.a=500;
        staticExample.printValues();


    }
}
