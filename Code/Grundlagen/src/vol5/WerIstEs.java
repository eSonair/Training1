package vol5;

public class WerIstEs {

    public static void main(String[] args) {

        Person p1 = new Person ("Alex", "schwarz", "kurz", "braun");
        Person p2 = new Person ("Alfred", "rot", "lang", "blau");
        Person p3 = new Person ("Anita", "blond", "lang", "blau");
        Person p4 = new Person ("Anne", "schwarz", "kurz", "braun");
        Person p5 = new Person ("Maria", "braun", "lang", "braun");
        Person p6 = new Person ("Robert", "braun", "kurz", "blau");


        System.out.println(p4.printPerson(p6));
        System.out.println(p1.stimmtHaarfarbe(p2,"schwarz"));
        schneideHaare(p5);

    }//Ende Main


    public static void schneideHaare(Person p1){
        if(p1.getHaarlaenge().equals("lang")){
            p1.setHaarlaenge("kurz");
            System.out.println(p1.getName() + "s Haare wurden " + p1.getHaarlaenge() + " geschnitten.");
        }
        else {
            System.out.println(p1.getName() + "s Haare sind bereits " + p1.getHaarlaenge() + ".");
        }
    }
}//Ende Klasse
