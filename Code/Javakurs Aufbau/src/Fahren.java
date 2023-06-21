public class Fahren {
    public static void main(String[] args) {

        Auto a1 = new Auto (30000,2008 , 40, 20);
        Auto a2 = new Auto (2500,2021 );

        Motorrad m1 = new Motorrad(10000, 2015, 10, 0);
        Motorrad m2 = new Motorrad(50, 2021, 100, 23);


        a1.volltanken();;
        System.out.println("Aktuelle Füllmenge: " + a1.getFuellmenge());
        System.out.println("Verkaufspreis:" + a1.verkaufspreis());

        m2.volltanken();
        System.out.println("Aktuelle Füllmenge: " + m2.getFuellmenge());
        System.out.println("Verkaufspreis:" + m2.verkaufspreis());



    }//Ende Main
}//Ende Klasse