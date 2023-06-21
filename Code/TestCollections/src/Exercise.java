
import java.util.*;

public class Exercise {

   public static Book [] books = new Book[6];
   public static ArrayList<Book> a1 = new ArrayList<Book>();

    public Exercise(){

        books[0] = new Book("Goethe", "Faust I", 20000);
        books[1] = new Book("Goethe", "Faust I", 20000);
        //books[1] = new Book("Schiller", "Wilhelm Tell", 10000);
        books[2] = new Book("Mann", "Der Untertan", 15000);
        books[3] = new Book("Kant", "Die Aula", 50000);
        books[4] = new Book("Goethe", "Faust II", 20000);
        books[5] = new Book("Fontane", "Effi Briest", 10000);
        //books[5] = new Book("Goethe", "Faust I", 20000);
    }


    public static void main(String[] args) {
        Exercise z = new Exercise();
        z.part8();

    }//Ende Main


    public static void part6 (){

        for (int i=0; i< books.length; i++){
            a1.add(books[i]);
        }

        System.out.println("Unsortiert: ");

        Iterator it = a1.iterator();

        while (it.hasNext()){
            //System.out.print(it.next() +  "- ");
            Book a= (Book) it.next();
            System.out.println(a.getAuthor() + ": "+ a.getTitle()+ "    Auflage: " + a.getIssue());
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sortiert: ");

        Collections.sort(a1);

        ListIterator listIt = a1.listIterator();
        while (listIt.hasNext()){
            Book a= (Book) listIt.next();
            System.out.println(a.getAuthor() + ": "+ a.getTitle()+ "    Auflage: " + a.getIssue());
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Rückwärts: ");
        while (listIt.hasPrevious()){
            Book a= (Book) listIt.previous();
            System.out.println(a.getAuthor() + ": "+ a.getTitle()+ "    Auflage: " + a.getIssue());
        }


    }//Ende Part 6

    public static void part7 (){
        HashMap <String, Book> h1 = new HashMap<>(11);

        for (int i=0; i< books.length;i++){
            h1.put(""+i, books[i]);
        }

        for (Map.Entry<String, Book> e:h1.entrySet()){
            //String key = e.getKey();
            Book a = e.getValue();
            System.out.println("Author: " + a.getAuthor() + "   Titel: "  + a.getTitle() + "   Auflage.:" + a.getIssue());
        }


        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TreeMap");


        TreeMap <String, Book> t1 = new TreeMap<>();
        for (int i=0; i< books.length;i++){
            t1.put(""+i, books[i]);
        }

        for (Map.Entry<String, Book> e: t1.entrySet()){
            Book a = e.getValue();
            System.out.println("Author: " + a.getAuthor() + "   Titel: "  + a.getTitle() + "   Auflage.:" + a.getIssue());
        }
    }

    public static void part8 (){

        HashSet<Book> hash1 = new HashSet<Book>();

        for (int i=0; i< books.length;i++){
          /*
              if(!(hash1.add(books[i]))){
                System.out.println("Datensatz wird nicht gespeichert (doppelter Eintrag)");
            }
           */
            if (hash1.contains(books[i])){
                System.out.println("Datensatz wird nicht gespeichert (doppelter Eintrag)");
            }
            else
                hash1.add(books[i]);

        }

        System.out.println("Ausgabe HashSet:");
        for (Book a : hash1) {
            System.out.println("Author: " + a.getAuthor() + "   Titel: "  + a.getTitle() + "   Auflage.:" + a.getIssue());
        }

        /*
         while (it. hasNext())
            System.out.println("HashCode: " + it.next().hashCode());
         */

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("TreeSet");

        //TreeSet
        TreeSet <Book> t1 = new TreeSet<>();

        /*
          for (int i=0; i< books.length;i++){
            t1.add(books[i]);

            .printf (%-8s: = reserviert 8 Zeichen
            \ = f.d. Anführungszeichen. Wenn man Anführungs ausgeben möchte.
        }
         */

        for (Book a : hash1) {
            t1.add(a);
        }

        /*
        Alternativ t1.addAll(hash1);
         */

        Iterator it = t1.iterator();
        while (it.hasNext()) {
            Book a = (Book) it.next();  //System.out.println(itr.next()); nur das ist falsch.
            System.out.println(a.getAuthor() + ": "+ a.getTitle()+ "    Auflage: " + a.getIssue());
        }

    }//Ende Part8


}//Ende Klasse
