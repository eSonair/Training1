package GeschachtelteKlassen;

public class Test {

    //Innere u. äußere Klasse sind ähnlich wie Vererbung.
    public static void main(String[] args) {

        OuterClass.InnerClass ai = new OuterClass.InnerClass();
        ai.print();

        OuterClass oc = new OuterClass();
        //OuterClass.InnerClass ic = oc.new InnerClass();
        //Zeile drüber. Man darf keiner inneren Klasse keine Outerklasse zuweisen. Umgekehrt hingegen schon.

        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        oc= (OuterClass)ic;

    }//Ende Main
}//Ende Klasse
