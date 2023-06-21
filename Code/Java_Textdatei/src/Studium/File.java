package Studium;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

    //resolve in ein neues Path Objekt, d.h. man hängt einen Ordner dran?
    //Path file = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Test.txt").resolve("new_ordner");

    //Zeile 13 ist nur ein File Objekt, dass via statitsche Methode gebaut wurde statt mit einem Konstruktor
    Path path = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Studium\\Studium.txt");
    Path path2 = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Studium\\Studium.txt").resolve("new_ordner");

}
