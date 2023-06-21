package Florian.hue;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.TreeSet;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int index=2, index1=4;//f. Zahlen kriegen
        int pos=0, pos1=1, pos2=3; //f. Strings bekommen.
        final int CONS=5;
        int gesamtausgaben=0;
        String p1, p2;
        //Mitarbeiter m3 = new Mitarbeiter("Hannes", "Emrich", 43, "PM", 5000);


        p1="Hannes; Weipert; 22; IT; 1800";
        p2="Alexia; Neumann; 18; Buchhaltung; 1500";

        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList <String> name = new ArrayList<>();
        ArrayList<Mitarbeiter> m1 = new ArrayList<>();
        //TreeSet<Mitarbeiter> t1 = new TreeSet<>();

        //Mitarbeiter m4= new Mitarbeiter(name.get(0), name.get(1), numbers.get(0),name.get(2),numbers.get(1));


        Path p = Path.of("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\hue\\Mitarbeiter.txt");
        FileReader datei = new FileReader(p.toString());
        BufferedReader br = new BufferedReader(datei);
        String s = ";\n";
        byte data [];
        ByteBuffer out;

        //alles einmal in ein ArrayList stopfen.
        try
        {
            String line = br.readLine();
            while (line!=null){
                String [] tmp = line.split(";");
                for (String a: tmp)
                {
                    a1.add(a);
                }
                line = br.readLine();
            }//Ende While
        }//Ende try
        catch (IOException e){
            e.printStackTrace();
            }//Ende Catch


        //Zahlen filetieren
        for (int i=0; i<(a1.size())/5;i++){
            if(i==0){
                numbers.add(Integer.parseInt(a1.get(index).replace(" ", "")));
                numbers.add(Integer.parseInt(a1.get(index1).replace(" ", "")));
            }
            else{
                index+=CONS;
                index1+=CONS;
                numbers.add(Integer.parseInt(a1.get(index).replace(" ", "")));
                numbers.add(Integer.parseInt(a1.get(index1).replace(" ", "")));
            }//Ende Else
        }//Ende For


        //Strings filetieren
        //pos=0, pos1=1, pos2=3;
        for (int i=0; i<(a1.size())/5;i++){
            if(i==0){
                name.add(a1.get(pos).replace(" ", ""));
                name.add(a1.get(pos1).replace(" ", ""));
                name.add(a1.get(pos2).replace(" ", ""));
            }
            else{
                pos+=CONS;
                pos1+=CONS;
                pos2+=CONS;
                name.add(a1.get(pos).replace(" ", ""));
                name.add(a1.get(pos1).replace(" ", ""));
                name.add(a1.get(pos2).replace(" ", ""));
            }//Ende Else
        }//Ende For



        //  Mitarbeiter m3 = new Mitarbeiter("Hannes", "Emrich", 43, "PM", 5000);
        /*
         for(String a: name) {
            System.out.println(a);
        }
        */


        //Mitarbeiter in m1 zusammenbauen
        for (int i=0; i<(a1.size())/5;i++){
            m1.add(new Mitarbeiter(name.get(i), name.get(i+1), numbers.get(i),name.get(i+2),numbers.get(i)));
        }

        for(Mitarbeiter m:m1){
            System.out.println("Name: " +m.getVorname()+ " Nachname: " + m.getNachname() + " Alter: "+ m.getAlter() + " Abteilung: " + m.getAbteilung() + " Gehalt:" + m.getGehalt());
        }

        //Gesamtausgaben f. Gehalt berechnen
        for (int i=1; i<numbers.size();i++){
            if(i%2!=0){
                gesamtausgaben+=numbers.get(i);
            }
        }//Ende for

        System.out.println(gesamtausgaben);

        //2 neue Leute hinzufügen
        try {
            PrintWriter w = new PrintWriter(new FileWriter(p.toString(),true));
            w.println("");
            w.println(p1);
            w.println(p2);
            w.flush();
            w.close();
        }catch (IOException e){
            e.printStackTrace();
        }



        /*
         for (Book a : hash1) {
            t1.add(a);
        }

        Iterator it = t1.iterator();
        while (it.hasNext()) {
            Book a = (Book) it.next();  //System.out.println(itr.next()); nur das ist falsch.
            System.out.println(a.getAuthor() + ": "+ a.getTitle()+ "    Auflage: " + a.getIssue());
        }
         */


    }//Ende Main
}//Ende Klasse
