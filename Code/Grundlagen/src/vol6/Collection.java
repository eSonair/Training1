package vol6;


import vol7.Person;

public class Collection {

   public static Person collection [] = new Person[11];


    public void init(int i, Person p1 ) {
        collection[i]=p1;
    }

    public void print(){
        String name="";
        String haarfarbe="";
        String haarlaenge="";
        String augenfarbe="";

        for (int i=0; i<collection.length;i++){
            name=collection[i].getName();
            haarfarbe=collection[i].getHaarfarbe();
            haarlaenge=collection[i].getHaarlaenge();
            augenfarbe=collection[i].getAugenfarbe();
            System.out.println(name + " hat " + haarlaenge + ", " + haarfarbe + " Haare " +  " und " + augenfarbe +" Augen." );
        }
    }//Ende read

    public static void printNamen(){
        String name="";
        for (int i=0;i<collection.length;i++){
            name+=collection[i].getName() +" ";
        }
        System.out.println(name);
    }

    public static Person collectionPerson(int i){
        return collection[i];
    }

    public int collectionLenght(){
        int lenght=0;
        lenght=collection.length;
        return lenght;
    }




    }//Ende Klasse

