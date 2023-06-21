package Florian;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.*; //f. Files
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class Einlesen {

    public static void main(String[] args) throws FileNotFoundException {

        Path p = Path.of("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\neue_datei.txt");

        //Liest d. ganze Datei
        FileReader datei = new FileReader("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\Test.txt");
        //FileReader wird in ein BufferdReader umwandeln, damit man damit weiterverarbeiten kann
        BufferedReader br = new BufferedReader(datei);

        //wir lesen nun d. Datei Zeilenweise ein, danach speichern wir es in eine ArrayList
        ArrayList<String> list = new ArrayList<>();

        try
        {
            //Man ladet v. BufferedReader d. erste Zeile rein
            String line = br.readLine();
            while (line!=null){
                //Hier wird nach jedem Leerzeichen d. Wörter gesplittet. Jedes Wort = eigener String
                String [] tmp = line.split(" "); //Es muss nicht nur ein Leerzeichen sein.
                for (String s: tmp)
                {
                    list.add(s);
                }
                line = br.readLine();
            }//Ende While
        }//Ende try
        catch (IOException e){
            e.printStackTrace();//D. ganze Fehlermeldung wird hier ausgegeben.
        }

        for (String s: list){
            System.out.println(s);
        }


        try {
            //Man gibt an, was in d. neuen Txt.Datei angeschreibt werden sollte
            Path filePath = Files.writeString (p, "ABC");
            //Zeile 48 = Alternative zu Zeile 46, falls man den "filePath" nicht erneut benutzen wollen.
            //Files.writeString (p, "ABC");
            Files.writeString(p,"Test2\n");  //Erstellt d. Datei neu u. überschreibt d. alte Datei.


            //mit PrintWriter kann man etwas dazu anhängen
            PrintWriter w = new PrintWriter(new FileWriter(p.toString(),true));
            //w.println("");  --> für Zeilenumbruch
            w.println("Das wird d. Zeile 2");
            w.println("Testen vom Umbruch.");
            //Man muss den PrintWriter auch entleeren u. schließen
            w.flush();

            //Man kopiert hier v. einem bestimmten Abschnitt in d. neue Txtdatei.
            Iterator <String> it = list.listIterator(list.indexOf("bin"));
            while (it.hasNext()){
                String s = it.next();
                w.println(s);
                if (s.equals("Super,"))
                    break;
            }

            w.close();
            String s = Files.readString(filePath);
            System.out.println(s);

        }catch (IOException e){
            e.printStackTrace();
        }

    }//Ende Main
}//Ende Klasse
