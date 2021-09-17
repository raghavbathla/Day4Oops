package constructor;

public class ConstructMain {
    public static void main(String[] args) {

        //Parameterized Constructor
        ParamConstruct paramConstruct = new ParamConstruct(5,8);
        paramConstruct.print();
        // Non ParamConstructor
        NonParamConstruct nonParamConstruct = new NonParamConstruct();
        nonParamConstruct.print();
    }




}
