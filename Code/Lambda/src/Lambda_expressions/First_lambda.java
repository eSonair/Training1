package Lambda_expressions;
import  java.util.ArrayList;
import java.util.function.Consumer; //Hier sind ein Haufen verkürzten Methoden, wo wir Lambda Expressions verwenden können.
//Interfaces kann man auch importieren anstatt zu importieren, dafür muss d. Klasse jedoch nicht alle Methoden zur Verfügung stellen, welches d. Interface selber verlangt.


public class First_lambda {

    public static void main(String[] args) {
        //Lambda = Code verkürzen, man kann auch eine Methode mit Lambda expressions befüllen u. dann auch aufrufen.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(8);

        //Methode
        //D. "forEach" Methode ist eine Methode, welche eine Lambda Expression verlangt. Somit kann man den Code verkürzen.
        numbers.forEach(n->{System.out.println(n);}); //"n" = Variable u. ist in diesem Fall ist "->" d. Lambda Expressions.

        System.out.println("-----------------------------------------------------------------");
        //Es gibt auch ein Interface bei Java es heißt "Consumer".
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        numbers.forEach(method);


    }//Ende Main
}//Ende Klasse
