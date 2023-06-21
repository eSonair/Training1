package Florian;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
    public static void main(String[] args) {


        //Alternative zum Path
        //File file1 = new File ();

        Path file = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\Test.txt");
        Path pfad_new = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\new_ordner\\Florian\\Test.txt");

        if (Files.exists(pfad_new)){
            System.out.println(pfad_new.toString() + "existiert bereits");
        }
        else{
            try
            {
                Files.createDirectories(pfad_new.getParent());
                //Man muss nicht sofort zusätzlich einen Pfad anlegen u. dann es kopieren, weil kopieren, kopiert den gleichen Pfad inkl.
                //Files.createFile(file);
                Files.copy(file, pfad_new);
                //Files.delete(file); --> Datei löschen.
            }
            catch (IOException ex){
                System.err.println(ex);
            }
        }

    }//Ende Main

}//Ende Klasse

