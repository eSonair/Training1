import java.util.*;

public class HashTabelle {

    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<Person>();
        Person personA = new Person ("Huber", "Hein", 33);
        Person personB = new Person ("Schuster", "Franz", 12);
        Person personC = new Person ("Baumann", "Jens", 13);
        Person personD = new Person ("Mondl", "Manuel", 33);
        Person personE = new Person ("Baumann", "Jens", 13);

        personSet.add(personA);
        personSet.add(personB);
        personSet.add(personC);
        personSet.add(personD);
        personSet.add(personE);

        System.out.println("Existiert E bereits? " + personSet.contains(personE));

        if (personSet.add(personE)){
            System.out.println("E angefügt");
        }
        else
            System.out.println("E nicht angefügt");

        Iterator it = personSet.iterator();

        while (it. hasNext())
            System.out.println("HashCode: " + it.next().hashCode());


        System.out.println("Vorname: " + "Nachname Personalnr ");
        for (Person a: personSet){
            System.out.println(a.getPrename() + " " + a.getLastname() + " " + a.getPersonalNr());
        }

    }//Ende Main
}//Ende Klasse
