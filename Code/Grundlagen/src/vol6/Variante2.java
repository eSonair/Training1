package vol6;

public class Variante2 {

    /* Möglichkeiten

        array[0]=new Person("Alex", "schwarz", "kurz", "braun");
        array[1]=new Person("Alfred", "rot", "lang", "blau");
        array[2]=new Person("Anita", "blond", "lang", "blau");;
        array[3]=new Person("Anne", "schwarz", "kurz", "braun");
        array[4]=new Person("Maria", "braun", "lang", "braun");
        array[5]=new Person("Robert", "braun", "kurz", "blau");
        array[6]=new Person("Bernhard", "braun", "kurz", "braun");
        array[7]=new Person("Bill", "orange", "kurz", "blau");
        array[8]=new Person("Charles", "blond", "lang", "braun");
        array[9]=new Person("David", "blond", "lang", "blau");
        array[10]=new Person("Frans", "orange", "kurz", "blau");
        array[11]=new Person("Tom", "schwarz", "kurz", "blau");

        ------------------------------------------------
        Person p1 = new Person("Alex", "schwarz", "kurz", "braun");
        Person p2 = new Person("Alfred", "rot", "lang", "blau");
        Person p3 = new Person("Anita", "blond", "lang", "blau");;
        Person p4 = new Person("Maria", "braun", "lang", "braun");
        Person p5 = new Person("Robert", "braun", "kurz", "blau");
        Person p6 = new Person("Bernhard", "braun", "kurz", "braun");
        Person p7 = new Person("Bill", "orange", "kurz", "blau");
        Person p8 = new Person("Charles", "blond", "lang", "braun");
        Person p9 = new Person("David", "blond", "lang", "blau");
        Person p10 = new Person("Frans", "orange", "kurz", "blau");
        Person p11 = new Person("Tom", "schwarz", "kurz", "blau");

        //Person p4 =new Person("Anne", "schwarz", "kurz", "braun"); scheiß bsp. lassen heimlich 1 Pers. aus u. ersetzen es durch eine neue Hure


        init(0, p1);
        init(1, p2);
        init(2, p3);
        init(3, p4);
        init(4, p5);
        init(5, p6);
        init(6, p7);
        init(7, p8);
        init(8, p9);
        init(9, p10);
        init(10, p11);


        //Ausgabe d. 7ten Pers. Anmerkung dieses **** Bsp. baut Datentechnisch absolut nicht auf d. vorige Bsp. auf!
        System.out.println(arrayX[6].getName());
        System.out.println(arrayX[6].getHaarfarbe());
        System.out.println(arrayX[6].getHaarlaenge());
        System.out.println(arrayX[6].getAugenfarbe());


    //System.out.println("Es sind: " + c1. + " Personen verfügbar");
        System.out.println(p4.printPerson(p6));
        System.out.println(p1.stimmtHaarfarbe(p2,"schwarz"));
    schneideHaare(p5);


        c1.add(0,p1);
    // c1[1].read();
    Person p6 =new Person(c1[1]) ;
        System.out.println();
         */


     /*
    public static void init(int i, Person p1){
        arrayX[i] =p1;
    }




    public static void schneideHaare(Person p1){
        if(p1.getHaarlaenge().equals("lang")){
            p1.setHaarlaenge("kurz");
            System.out.println(p1.getName() + "s Haare wurden " + p1.getHaarlaenge() + " geschnitten.");
        }
        else {
            System.out.println(p1.getName() + "s Haare sind bereits " + p1.getHaarlaenge() + ".");
        }
    }

     */

}
