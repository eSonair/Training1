package vol7;

import java.util.ArrayList;
import java.util.Scanner;

public class WerIstEs2 {

    public static Person c1 [] = new Person[11];



    public static void main(String[] args) {
        //collection = new collection();
        Scanner sc = new Scanner(System.in);
        String name;
        String haarfarbe;
        String haarlaenge;
        String augenfarbe;



        Person p1 = new Person("Alex", "schwarze", "kurze", "braune");
        Person p2 = new Person("Alfred", "rote", "lange", "blaue");
        Person p3 = new Person("Anita", "blonde", "lange", "blaue");;
        Person p4 = new Person("Maria", "braune", "lange", "braune");
        Person p5 = new Person("Robert", "braune", "kurze", "blaue");
        Person p6 = new Person("Bernhard", "braune", "kurze", "braune");
        Person p7 = new Person("Bill", "orange", "kurze", "blaue");
        Person p8 = new Person("Charles", "blonde", "lange", "braune");
        Person p9 = new Person("David", "blonde", "lange", "blaue");
        Person p10 = new Person("Frans", "orange", "kurze", "blaue");
        Person p11 = new Person("Tom", "schwarze", "kurze", "blaue");

        //flache/shallow Kopie
        //p1=p2;

        //Deep Copy
        /*
        Person p12 = new Person("Alex", "schwarze", "kurze", "braune");
        Person p13 = new Person (p12.getName(), p12.getHaarfarbe(), p12.getHaarlaenge(), p12.getAugenfarbe());
         */


        //String x1 = findePerson ("schwarz", "kurz", "braun");
        init(0,p1);
        init(1,p2);
        init(2,p3);
        init(3,p4);
        init(4,p5);
        init(5,p6);
        init(6,p7);
        init(7,p8);
        init(8,p9);
        init(9,p10);
        init(10,p11);

        System.out.println("Es sind " + x.size()+ " Personen verfügbar.");
        printNamen();
        System.out.println("------------------------------------------------------");
        print();
        //e WO ist hier d. Unterschied zwischen printPerson u. printNamen in d. Aufgabenstellung?
        System.out.println("------------------------------------------------------");
        System.out.println(p1.printPerson(p1));
        System.out.println("------------------------------------------------------");


        //g
        System.out.println("\nMerke dir eine Person und drücke dann Enter.");
        name = sc.nextLine(); // wait for enter
        //System.out.println(name);

        System.out.println("Welche Haarfarbe hat deine Person (schwarze, braune, blonde, rote)?");
        haarfarbe=sc.nextLine();

        System.out.println("Welche Haarlänge hat deine Person (kurze, lange)?");
        haarlaenge = sc.nextLine();

        System.out.println("Welche Augenfarbe hat deine Person (braune, blaue)?");
        augenfarbe = sc.nextLine();

        System.out.println("Folgende Personen passen zu deinen Angaben: " + findePerson(haarfarbe, haarlaenge, augenfarbe));
    }//Ende Main

    public static void init(int i, Person p1) {
        c1[i]=p1;
    }

    public static void print(){
        String name="";
        String haarfarbe="";
        String haarlaenge="";
        String augenfarbe="";

        for (int i=0; i<x.size();i++){
            name=x.get(i).getName();
            haarfarbe=x.get(i).getHaarfarbe();
            haarlaenge=x.get(i).getHaarlaenge();
            augenfarbe=x.get(i).getAugenfarbe();
            System.out.println(name + " hat " + haarlaenge + ", " + haarfarbe + " Haare " +  " und " + augenfarbe +" Augen." );
        }
    }//Ende read

    public static void printNamen(){
        String name="";
        for (int i=0;i<c1.length;i++){
            name+=c1[i].getName() +" ";
        }
        System.out.println(name);
    }

    public static String findePerson (String haarfarbe, String haarlaenge, String augenfarbe) {
        boolean truth=false;
        String result="Es sind: ";
        String haarfarbeLocal="", haarlaengeLocal="", augenfarbeLocal="", nameLocal="";
        for (int i=0; i<c1.length; i++){
            //if (haarfarbe.equals(c1.collectionPerson(i).getHaarfarbe()))
            haarfarbeLocal=c1[i].getHaarfarbe();
            haarlaengeLocal=c1[i].getHaarlaenge();
            augenfarbeLocal=c1[i].getAugenfarbe();
            nameLocal=c1[i].getName();

            //result = ""+i;

            //result =i + ":" + "Name: " + nameLocal + " || " + haarfarbeLocal + " ||  " + haarlaengeLocal + " ||  " + augenfarbeLocal;


            if(haarfarbe.equals(haarfarbeLocal) && haarlaenge.equals(haarlaengeLocal)  && augenfarbe.equals(augenfarbeLocal)) {
                result += c1[i].getName() + ", ";
                truth = true;
            }

            if (truth=false){
                result="unbekannt";
            }

        }//Ende for int Schleife
        return result;
    }



}//Ende Klasse
