package Florian;

import java.nio.file.*;
public class Pfad {
    public static void main(String[] args) {

        Path pfad = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\Test.txt");
        //%s=string variable; %=sind Platzhalter f. Variablen; %n=Zeilenumbruch
        System.out.printf("getFileName: %s%ngetFileSystem: %s%n", pfad.getFileName(), pfad.getFileSystem());

        System.out.println("----------------------------------------------------");
        //Index Anzahl d. Ordner, Speichermedium zählt er nicht mit.
        System.out.println("getName(1): " + pfad.getName(1));

        //f. jeden Datentyp braucht man eine andere Variable nach dem %; f=gleitkommazahlen, d= ganzzahlige Zahlen,
        //Anzahl d. Ordner wird angezeigt
        System.out.printf("getnameCount: %d%n", pfad.getNameCount());


        //Speichermedium wird angezeigt
        System.out.println("getRoot: " + pfad.getRoot());
        //ganzer Dateipfad wird angezeigt
        System.out.println("getParent: " + pfad.getParent());
        //Ganzer Pfad wird als String zurück gegeben.
        System.out.println("toString: " + pfad.toString() );

    }//Ende Main
}//Ende Klasse
