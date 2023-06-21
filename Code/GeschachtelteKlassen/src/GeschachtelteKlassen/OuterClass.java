package GeschachtelteKlassen;

public class OuterClass {

    private static String s1= "Variable static OuterClasse.s1 called";
    static String s2 = "Variable OuterClass.s2 called";

    //Weil innerClass static ist, kann d. Outerclasse immer leicht auf d. Innerklasse zugreifen und umgekehrt.
    public static class InnerClass{
        static final String s3 = "static and final";
        public void print (){
            System.out.println("InnerClasse#print() called");
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}//Ende Klasse
