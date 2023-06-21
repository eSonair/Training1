public class Spielen {
    public static void main(String[] args) {
        Spielfeld a = new Spielfeld();

        //a.setzeWaagrechtesSchiff();
        a.setzeSenkrechtestesSchiff(2,5,2);
        a.schiesse(3,3);
        a.schiesse(5,2);

        a.pruefeObGewonnen();
        a.gibSpielfeldAufKonsoleAus();
    }
}
