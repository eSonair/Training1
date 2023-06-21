
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        TreeSet <Person2> personTreeSet = new TreeSet<Person2>();

        Person2 personA = new Person2 ("Huber", "Hein", 33);
        Person2 personB = new Person2 ("Schuster", "Franz", 12);
        Person2 personC = new Person2 ("Baumann", "Jens", 13);
        Person2 personD = new Person2 ("Mondl", "Manuel", 33);
        Person2 personE = new Person2 ("Baumann", "Jens", 44);

        personTreeSet.add(personA);
        personTreeSet.add(personB);
        personTreeSet.add(personC);
        personTreeSet.add(personD);
        personTreeSet.add(personE);

        Iterator it = personTreeSet.iterator();

        while (it.hasNext()){
            Person2 a= (Person2) it.next();
            System.out.println(a.getLastname() + ", " + a.getPrename() +  ", " + a.getPersonalNr());
        }//Ende while

        personTreeSet.add(new Person2 ("Gans", "Gustav", 55));
        System.out.println("-----------------------------------------------------------");

        for (Person2 a:personTreeSet){
            System.out.println(a.getLastname() + ", " + a.getPrename() +  ", " + a.getPersonalNr());
        }

        //Hashmap
        HashMap <String, Person2> h1 = new HashMap<>(11); // Man kann d. HashMap auch dynamisch definieren, indem man d. 11er auslässt.

        String keyA = "00001";
        String keyB = "000021";
        String keyC = "00031";
        String keyD = "00041";
        String keyE = "00051";
        String keyF = "00061";

        h1.put(keyA, personA);
        h1.put(keyB, personB);
        h1.put(keyC, personC);
        h1.put(keyD, personD);
        h1.put(keyE, personE);
        h1.put(keyF, new Person2 ("Gans", "Gustav", 55));

        System.out.println("Liste durchlaufen:" );
        for (Map.Entry<String, Person2> e:h1.entrySet()){
            //System.out.println(e); so gibt er lediglich nur d. Speicheradresse aus, wo alles gespeichert ist.
            String key = e.getKey();
            Person2 a = e.getValue();
            System.out.println("Key: "+ key + "   Nachname: " + a.getLastname() + "   Vorname: "  + a.getPrename() + "   PersonalNr.:" + a.getPersonalNr());
        }


        System.out.println("-----------------------------------------------------------------");
        System.out.println("Blubb");


        //TreeMap
        TreeMap <String, Person2> t1 = new TreeMap<>(h1); //Achtung tiefe Kopie!
        for (Map.Entry<String, Person2> e: t1.entrySet()){
            String key = e.getKey();
            Person2 a = e.getValue();
            System.out.println("Key: "+ key + "   Nachname: " + a.getLastname() + "   Vorname: "  + a.getPrename() + "   PersonalNr.:" + a.getPersonalNr());
        }



    }//Ende Main
}//Ende Klasse
