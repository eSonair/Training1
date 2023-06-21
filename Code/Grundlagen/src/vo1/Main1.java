package vo1;

public class Main1 {
    public static void main(String[] args) {//psvm
        int euro, cent;
        int preis, bezahlt,zwSum;
        int rückgeld;
        final int CONS=100;
        int hundertEuro, fünfzigEuro, zwanzigEuro, zehnEuro, fünfEuro, zweiEuro, einEuro, fünfzigCent, zwanzigCent, zehnCent, fünfCent;
        int einCent;

        //100€, 50€, 20€, 10€, 5€,2€, 1€, 50 Cent, 20 Cent, 10 Cent, 5 Cent, 1 Cent
        bezahlt =200000;
        preis=105;

        zwSum=bezahlt-preis;
        euro=zwSum/10000;

        hundertEuro=euro/100;
        euro=euro-hundertEuro*100;


        fünfzigEuro=euro/50;
        euro=euro-fünfzigEuro*50;


        zwanzigEuro=euro/20;
        euro=euro-zwanzigEuro*20;

        zehnEuro=euro/10;
        euro=euro-zehnEuro*10;

        fünfEuro=euro/5;
        euro=euro-fünfEuro*5;

        zweiEuro=euro/2;
        euro=euro-zweiEuro*2;

        einEuro=euro/1;
        euro=euro-einEuro*2;


        euro=euro*100;//Euro in Cent umwandeln

        fünfzigCent=euro/50;
        euro=euro-fünfzigCent*50;

        zwanzigCent=euro/20;
        euro=euro-zwanzigCent*20;

        zehnCent=euro/10;
        euro=euro-zehnCent*10;

        fünfCent=euro/5;
        euro=euro-fünfCent*5;

        einCent=euro/1;
        euro=euro-einCent*1;


        //100€
        System.out.println("100 €:" + hundertEuro);
        //50
        System.out.println("50 €:" + fünfzigEuro);
        //20€
        System.out.println("20 €:" + zwanzigEuro);
        //10€
        System.out.println("10 €:" + zehnEuro);
        //5€
        System.out.println("5 €:" + fünfEuro);
        //2€
        System.out.println("2 €:" + zweiEuro);
        //1€
        System.out.println("1 €:" + einEuro);
        //50 Cent
        System.out.println("50 Cent:" + fünfzigCent);
        //20 Cent
        System.out.println("20 Cent:" + zwanzigCent);
        //10 Cent
        System.out.println("10 Cent:" + zehnCent);
        //5 Cent
        System.out.println("5 Cent:" + fünfCent);
        //1 Cent
        System.out.println("1 Cent:" + einCent);



    }
}
