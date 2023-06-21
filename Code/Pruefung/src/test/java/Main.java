import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        HashSet<Student> studentSet = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        //Auslesen Nr. 8
        FileReader datei = new FileReader("D:\\Programmieren\\Java\\2023\\Code\\Pruefung\\src\\test\\Studenten.txt");
        BufferedReader br = new BufferedReader(datei);


        try
        {
            String line = br.readLine();
            while (line!=null){
                String [] tmp = line.split(";");

                for (String s: tmp)
                {
                    System.out.println("_____________________________________________________");
                    System.out.println(s);
                    list.add(s);
                }
                line = br.readLine();
            }//Ende While
        }//Ende try
        catch (IOException e){
            e.printStackTrace();
        }


        //Anhängen Nr. 9 + 10 + 13
        Student st= new Student("Franz","Laa an der Thaya", 170);
        Student st1= new Student("Hans","Gerasdorf", 100);
        Student st2= new Student("Albert","Mödling", 80);


        for(int i = 0; i < list.size(); i+=4) {
            String name =list.get(i);
            String wohnort=list.get(i+1);
            String zw_ects=list.get(i+2);
            System.out.println("ECTS: " +zw_ects);
            //int ects=Integer.parseInt(zw_ects) ;
            //studentSet.add(new Student(name, wohnort,ects));
        }

        studentSet.add(st);
        studentSet.add(st1);
        studentSet.add(st2);



        Path p = Path.of("D:\\Programmieren\\Java\\2023\\Code\\Pruefung\\src\\test\\Studenten.txt");
        PrintWriter w = new PrintWriter(new FileWriter(p.toString(),true));
        w.println("");  //--> für Zeilenumbruch
        w.println(st.getName() + "; " + st.getWohnort() +"; " + st.getEcts()  + "; " + st.getAnmerkung());
        w.println(st1.getName() + "; " + st1.getWohnort() +"; " + st1.getEcts()  + "; " + st1.getAnmerkung());
        w.println(st2.getName() + "; " + st2.getWohnort() +"; " + st2.getEcts()  + "; " + st2.getAnmerkung());
        w.flush();
        w.close();


        //Nr. 13
        System.out.println("------------------------------------------------------------------------------------------");
        for (Student s: studentSet){
            System.out.println("Name: " + s.getName() + " Wohnort: "+s.getWohnort() + " ECTS: " +s.getEcts() + " Anmerkung: " + s.getAnmerkung() + "Matrikel nummer: " + s.getMatrikelnummer());
        }


        //Nr. 15
        System.out.println("Anzahl d. Studierende: " + studentSet.size());

        //Nr. 16
        for (int i=0; i<studentSet.size(); i++){
            if()
        }

    }//Ende Main
}//Ende Klasse
