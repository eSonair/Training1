import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.*;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.ExplicitTypePermission;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;


public class XStreamUse {
    public static void main(String[] args) {

        // Die selbst geschriebene Klasse "Person", dessen Klassenvariablen entspricht der Struktur, wie es im XML
        //angezeigt werden soll.

       XStream xStream = new XStream(new StaxDriver());
       Person joe = new Person("joe", "test");
       String xml=xStream.toXML(joe);
       System.out.println(xml);

        //IdR glaubt d. System, dass X-Stream eine "gefährliche Klasse" deswegen müssen wir es extra genehmigen
        //Sonst könnte man auch gleich den Klassennamen im Parameter angeben. Hier werden gleich alle Klassen erlaubt.
       xStream.addPermission(AnyTypePermission.ANY);

        //Explizite Klasse bzw. nur eine einzige Klasse erlauben.
        //xStream.addPermission(new ExplicitTypePermission(new Class[]{Person.class}));

        Person newjoe = (Person)xStream.fromXML(xml);
        System.out.println(newjoe);

        //Item wird hier absichtlich groß geschrieben, weil wir hier auf d. Klasse u. nicht Textdatei referenzieren.
        String xml2 = " <Item> <date>January 2009</date>"
                + "        <mode>1</mode>\n"
                + "        <unit>900</unit>\n"
                + "        <current>1</current>\n"
                + "        <interactive>1</interactive>\n"
                + "    </Item>\n"
                ;

        Item it = (Item)xStream.fromXML(xml2);
        System.out.println(it);

        //Mehr Personen in ein Objekt speichern.
        Person p2 = new Person("Wilfried", "Feuerstein");

        //xml= xStream.toXML(p2);  //toXML = erstellt in d. XML Textdatei immer den Header mit d. Version.


        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(p2);
        persons.add(new Person ("Bob", "Feuer"));
        persons.add(newjoe);

        xml= xStream.toXML(persons);


        //Schreiben in einer XML-Datei
        File file = new File ("D:\\Programmieren\\Java\\2023\\Code\\XStream\\src\\main\\java\\Test.xml");
        FileWriter writer;
        try{
            writer = new FileWriter(file);
            //File ändern und mit writer anhängen:
            //writer = new FileWriter(file,true); //FileWriter(file, true)= true heißt wir hängen nur noch etwas an. nicht um etwas neu machen.
            writer.write(xml);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //Lesen aus der XML-Datei
        FileInputStream fis = null;
        try{
           fis = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Datei nicht gefunden");
        }



        /*
         Object obj = xStream.fromXML(fis); //fromXML macht automatisch ein ArrayList draus.
        if (obj instanceof ArrayList) { //Wenn man hier "[]" angibt, dann kann es optional ein Array sein.
            ArrayList <Person> personArray = (ArrayList<Person>) obj;
            for (Person p:personArray){
                System.out.println(p.toString());
            }
        }
        else {
            System.out.println("Unerwartetes Objekt.");
        }
         */

        System.out.println("-------------------------------");
        ArrayList<Person> obj = (ArrayList<Person>)xStream.fromXML(fis);
        for(Person p : obj)
        {
            System.out.println(p);
        }




    }//Ende Methode Main
}//Ende Klasse
