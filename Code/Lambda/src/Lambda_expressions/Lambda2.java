package Lambda_expressions;

interface StringFunction{
    String run(String str); //das dient als "Lambda Variable" nur in Form von einer Methode
    //String run ();
}

interface AdditionFunction {
    int operation (int a, int b); //Diese Methode im Interface dient nur dazu, damit d. System weiß was überhaupt an Parameter erlaubt sind zu übergeben.
}

public class Lambda2 {

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        //String result = format.run();
        System.out.println(result);
    }

    public static int operate (int a, int b, AdditionFunction fb){
        return fb.operation(a, b); //D. Lambda Expression holt sich automatisch d. Rückholewerte v. Methoden z.B. operation, obwohl d. Methode keine Rückgabewerte definiert hat.
        //Definition void statt int
        /*
        System.out.println(fb.operation(a,b));
         */
    }

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s+"!"; // "s ->" = soll zum "s+.."werden.
        StringFunction ask = (s) -> s+"?";
        //StringFunction leer = (s) ->s;
        printFormatted("Hallo", exclaim);
        printFormatted("Hallo", ask);

        AdditionFunction add = (int x, int y) -> x+y;
        AdditionFunction multi = (int x, int y) -> x*y;
        System.out.println(operate(6,3, add));
        System.out.println(operate(6,3,multi));

    }//Ende Main
}//Ende Klasse
