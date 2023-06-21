package vol6;

import vol7.Person;

public class WerIstEs2_original {

    //public static Person arrayX [] = new Person[11];

    public static void main(String[] args) {

        Collection c1= new Collection();

        Person p1 = new Person("Alex", "schwarze", "kurze", "braune");
        Person p2 = new Person("Alfred", "rote", "lange", "blaue");
        Person p3 = new Person("Anita", "blonde", "lange", "blaue");;
        Person p4 = new Person("Maria", "braune", "lange", "braune");
        Person p5 = new Person("Robert", "braune", "kurze", "blaue");
        Person p6 = new Person("Bernhard", "braune", "kurze", "braune");
        Person p7 = new Person("Bill", "orange", "kurze", "blaue");
        Person p8 = new Person("Charles", "blonde", "lange", "braune");
        Person p9 = new Person("David", "blonde", "lange", "blaue");
        Person p10 = new Person("Frans", "orange", "kurze", "blaue");
        Person p11 = new Person("Tom", "schwarze", "kurze", "blaue");

        //flache/shallow Kopie
        //p1=p2;

        //Deep Copy
        /*
        Person p12 = new Person("Alex", "schwarze", "kurze", "braune");
        Person p13 = new Person (p12.getName(), p12.getHaarfarbe(), p12.getHaarlaenge(), p12.getAugenfarbe());
         */


        //String x1 = findePerson ("schwarz", "kurz", "braun");
        c1.init(0,p1);
        c1.init(1,p2);
        c1.init(2,p3);
        c1.init(3,p4);
        c1.init(4,p5);
        c1.init(5,p6);
        c1.init(6,p7);
        c1.init(7,p8);
        c1.init(8,p9);
        c1.init(9,p10);
        c1.init(10,p11);

        c1.printNamen();
        //System.out.println("------------------------------------------------------");
        c1.print();
        //e WO ist hier d. Unterschied zwischen printPerson u. printNamen in d. Aufgabenstellung?
        //System.out.println("------------------------------------------------------");
        System.out.println(p1.printPerson(p1));
        //System.out.println("--------------------hier----------------------------------");
        System.out.println(findePerson("schwarz", "kurz", "braun"));
    }//Ende Main

    public static String findePerson (String haarfarbe, String haarlaenge, String augenfarbe) {
        String result="";
        String haarfarbeLocal="", haarlaengeLocal="", augenfarbeLocal="", nameLocal="";
        Collection c1 = new Collection();
        for (int i=0; i<c1.collectionLenght();i++){
            //if (haarfarbe.equals(c1.collectionPerson(i).getHaarfarbe()))
            haarfarbeLocal=c1.collectionPerson(i).getHaarfarbe();
            haarlaengeLocal=c1.collectionPerson(i).getHaarlaenge();
            augenfarbeLocal=c1.collectionPerson(i).getAugenfarbe();
            nameLocal=c1.collectionPerson(i).getName();

            //result = ""+i;

            //result =i + ":" + "Name: " + nameLocal + " || " + haarfarbeLocal + " ||  " + haarlaengeLocal + " ||  " + augenfarbeLocal;

            if(haarfarbe.equals(haarfarbeLocal) && haarlaenge.equals(haarfarbeLocal)  && augenfarbe.equals(augenfarbeLocal)){
                result += c1.collectionPerson(i).getName() +", ";
            }else {
                //result+=nameLocal+"  " + " ,";
                result ="unbekannt";
            }
            /*
            */
        }
        return result;
    }



}//Ende Klasse
