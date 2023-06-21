import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        HashSet<Auto> autoSet = new HashSet<>();
        ArrayList <String> autoArray = new ArrayList<>();

        FileReader datei = new FileReader("D:\\Programmieren\\Java\\2023\\Code\\Pruefung_Simulation\\src\\Auto.txt");
        BufferedReader br = new BufferedReader(datei);

        try
        {
            String line = br.readLine();
            while (line!=null){
                String [] tmp = line.split(";"); //Es muss nicht nur ein Leerzeichen sein.
                for (String s: tmp)
                {
                    autoArray.add(s.trim());
                }
                line = br.readLine();
            }//Ende While
        }//Ende try
        catch (IOException e){
            e.printStackTrace();
        }

        //String modell, int baujahr, int preis, int kilometerAnzahl

        for(int i = 0; i < autoArray.size(); i+=3) {
            String bj =autoArray.get(i+1);
            String kmAnzahl=autoArray.get(i+2);
            String modell=autoArray.get(i);

            int baujahr=Integer.parseInt(bj) ;
            int kilometerAnzahl =Integer.parseInt(kmAnzahl);

            autoSet.add(new Auto(modell,baujahr,kilometerAnzahl));
        }

        for (Auto a: autoSet){
            System.out.println("Modell: " + a.getModell() + " Baujahr: " + a.getBaujahr() + " Preis: " + a.getPreis()
            + " Kilometerstand: " + a.getKilometerAnzahl());
        }

        create("Lexus", 2023, 0);
    }//Ende Main


    //Neue Autos bauen
    public static void create (String modell, int baujahr, int kilometerAnzahl){
        //Neuer Pfad um hier alles neu zu überschreiben.
        Path p = Path.of("D:\\Programmieren\\Java\\2023\\Code\\Pruefung_Simulation\\src\\Auto.txt");

        Auto a1 = new Auto(modell,baujahr,kilometerAnzahl);

        try {
            PrintWriter w = new PrintWriter(new FileWriter(p.toString(),true));
            w.println("\n"+ a1.getModell() +"; " + a1.getBaujahr() + "; " + a1.getKilometerAnzahl() + ";");
            w.flush();
            w.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }




}//Ende Klasse