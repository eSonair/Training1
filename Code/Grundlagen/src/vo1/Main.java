package vo1;

public class Main {
    public static void main(String[] args) {

        double fzA = 5; // Länge von deinem Auto (Meter)
        double fzB = 5; // Länge des anderen Autos (Meter)
        double vA = 120; // Deine Geschwindigkeit (km/h)
        double vB = 80; // Geschwindigkeit des anderen Autos(km/h)
        double s1, s2;
        double relativeStrecke;
        double relativeGeschwindigkeit;
        double zeit;
        final double CONS=3.6;
        double ueberholweg;

        System.out.println("Geschwindigkeit A: "+vA);
        System.out.println("Geschwindigkeit B: "+vB);
        System.out.println("Länge A: "+fzA);
        System.out.println("Länge B: "+fzB);


        //d
            s1=vA/2;
            s2=vB/2;

            s1 = vA / 2;
            s2 = vB / 2;
            relativeStrecke = fzA + s1 + fzB + s2;

        //e

            relativeGeschwindigkeit=vA-vB;

        // f
        zeit= (relativeStrecke*CONS)/relativeGeschwindigkeit;

        //g
        ueberholweg=zeit*vA/CONS;

        System.out.println("Sicherheitsabstand 1:  " + s1);
        System.out.println("Sicherheitsabstand 2:  " + s2);
        System.out.println("Strecke relativ: " + relativeStrecke + " Meter");
        System.out.println("Relative Geschwindigkeit: " + relativeGeschwindigkeit + "km/h");
        System.out.println("Benötigte Zeit: " + zeit + " Sekunden");
        System.out.println("Überholweg:" + ueberholweg + " Meter");

        System.out.println("Blubb");
    }//Ende Main








}//Ende Classe
