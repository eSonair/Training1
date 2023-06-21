package vol4;

import java.util.Scanner;
public class Quiz {

    static String [] frage;
    static int [] antwort;
    static Scanner sc = new Scanner(System.in);
    static int eingabe,correct=0;

    static long zeit, zeit1, timeResult;

    public static void main(String[] args) {

        init();

        for (int i=0; i<frage.length; i++) {

            askQuestion(i);
        }

        printSummary(correct);
    }//Ende Main


    //Methods
    //b
    static void init() {
        antwort = new int[4]; //initialisiert einmal d. Objekt Array "Antwort".
        frage = new String[4]; //initialisiert einmal d.Objekt Array  Frage.

        frage[0] = "Wie viel gibt 2*6?";
        frage[1] = "Wie viele Stunden hat ein Tag?";
        frage[2] = "Wie hoch ist der Eiffelturm?";
        frage[3] = "Wie viele Wochen hat das Semester?";

        antwort[0] = 12;
        antwort[1]=24;
        antwort[2]=324;
        antwort[3]=24;
        /*
        */

    }

    //c; d
    static boolean askQuestion(int nr) {

        zeit=System.currentTimeMillis();
        System.out.println("Frage "+(nr+1)+": "+frage[nr]);

        eingabe = sc.nextInt();
        sc.nextLine();
        zeit1=System.currentTimeMillis();
        timeResult=zeit1-zeit;


        boolean truth=false;


        if (antwort[nr]==eingabe){
            truth=true;
            correct++;
            System.out.println("Richtig");
            System.out.println("Aktuelle Zeit: " + timeResult);
        }
        else{
            truth=false;
            System.out.println("Falsch");
            System.out.println("Aktuelle Zeit: " + timeResult);
        }

        return truth;
    }

    //e
    static void printSummary(int richtig) {

        if(antwort.length==richtig){
            System.out.println("Super, gratuliere!");
        }
        else if(richtig>=antwort.length/2){
            System.out.println("Nicht schlecht!");
        }
        else if (richtig<antwort.length/2){
            System.out.println("Du hast noch Potential!");
        }

        System.out.println("\nRichtig: "+richtig+" von "+frage.length);
    }
}//Ende Class
