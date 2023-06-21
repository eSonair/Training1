package vol2;

import java.util.Scanner;

public class Offertenvergleich {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double preisA; // Preis Lieferant A
        double preisB; // Preis Lieferant B
        int lZeitA; // Lieferzeit Lieferant A
        int lZeitB; // Lieferzeit Lieferant B
        String bestellen ="";

        //b
        System.out.print("Preis A: ");
        preisA=sc.nextDouble();
        sc.nextLine();

        System.out.print("Preis B: ");
        preisB=sc.nextDouble();
        sc.nextLine();

        System.out.print("Lieferzeit A: ");
        lZeitA=sc.nextInt();
        sc.nextLine();

        System.out.print("Lieferzeit B: ");
        lZeitB=sc.nextInt();
        sc.nextLine();

        sc.close(); //Scanner schließen.

        System.out.println("A: " + preisA + "CHF, " + lZeitA + " Tage");
        System.out.println("B: " + preisB + "CHF, " + lZeitB+ " Tage");


        if (preisA<preisB ){
            if (lZeitA<15){
                bestellen="bei PreisA bestellen";
            } else if(lZeitB<15) {
                bestellen="bei PreisB bestellen";
            } else
                bestellen ="nichts bestellen";
        }
        else if (preisB<preisA){
            if (lZeitB<15){
                bestellen="bei PreisB bestellen";
            } else if(lZeitA<15) {
                bestellen="bei PreisA bestellen";
            } else
                bestellen ="nichts bestellen";
        } else if (lZeitA>=15 && lZeitB>=15){
            bestellen = "nichts bestellen";
        } else if (preisA==preisB){
            if (lZeitA<15 & lZeitB<15){
                bestellen = "freie Wahl";
            } else if (lZeitA<15 & lZeitB>14){
                bestellen= "bei PreisA bestellen";
            } else if (lZeitB<15 & lZeitA>14){
                bestellen= "bei PreisB bestellen";
            }
        }

        System.out.println("Bitte:  " + bestellen);


    }//Ende Main
}//Ende Class
