package vol3;

import java.util.Random;

public class Test {

    static double total=0;
    public static void main(String[] args) {

        String produkte = "";


        produkte=addVerkauf (89.9, "Hose", produkte);

        System.out.println("Produkt: "+produkte);
        System.out.println("Total: "+ total);

    }// Ende Main

    static String addVerkauf(double preis, String name, String prod){
        prod+=name+"\t"+preis+"\n";
        total+=preis;
        return prod;
    }

}//Ende Klasse
