package Lambda_expressions;

interface StringFunction {
    String run(String str);
}

interface StringFunction2 {
    String run();
}

interface AdditionFunction {
    int operation(int a, int b);
}


public class Lambda3  {

    public static void printFormatted(String str, StringFunction format)
    {
        String result = format.run(str);
        System.out.println(result);
    }

    public static void printFormatted2(String str, StringFunction2 format)
    {
        String result = format.run();
        System.out.println(result);
    }
    public static int operate(int a, int b, AdditionFunction fb)
    {
        return fb.operation(a, b);
    }

    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s + "!";
        /*
           public static String run (String s){
            String a=s+"!";
            return a;
        }
         */
        StringFunction ask = (s) -> s + "?";
        StringFunction2 leer = () -> "Test" ;
        printFormatted("Hallo", exclaim);
        printFormatted("Hallo", ask);
        printFormatted2("Hallo", leer);

        AdditionFunction add = (x, y) -> x+y;

        AdditionFunction multi = (x, y) -> x*y;

        System.out.println(operate(6,3, add));
        System.out.println(operate(6,3,multi));
    }//Ende Main
}//Ende Klasse


