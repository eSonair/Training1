public class Spielfeld {

    private Gebiet [][] feld;
    final int boundaries=10;

    public Spielfeld(){
        feld = new Gebiet[boundaries][boundaries];

        for (int i=0; i<boundaries; i++){
            for (int j=0; j<boundaries; j++){
                feld [i][j] = new Gebiet();
            }// Ende for 2
        }//Ende For 1


        feld [1][2].setzeSchiff();
        feld [1][2].setzeSchiff();
        feld [1][2].setzeSchiff();


    }//Ende Konstruktor


    public void setzeWaagrechtesSchiff (int x, int y, int laenge){
        boolean besetzt=false;

        if ((laenge+x)>boundaries){
            System.out.println("Setzen nicht möglich. ");
        }
        else {
                if (feld [x][y].schiffIstAufFeld=true){
                    besetzt=true;
                }
                if (besetzt=false){
                    if ((laenge+x)>boundaries){
                        System.out.println("Setzen nicht möglich. ");
                    }else
                     for (int j=x;j<laenge+x;j++ ){
                        feld [j][y].setzeSchiff();
                     }
                }
            }
        }


    public void setzeSenkrechtestesSchiff (int x, int y, int laenge){
       boolean besetzt=false;
        if ((laenge+y)>boundaries){
            System.out.println("Setzen nicht möglich. ");
        }
        else {
                if (feld [x][y].schiffIstAufFeld=true){
                    besetzt=true;
                }
                else
                {
                    besetzt=false;
                }
                if(besetzt=false){
                    if ((laenge+x)>boundaries){
                        System.out.println("Setzen nicht möglich");
                    }
                    else {
                        for (int j=y;j<laenge+y;j++ ){
                            feld [x][j].setzeSchiff();
                        }
                    }
                }
            }
        }

    public void schiesse(int x, int y){
        if (feld[x][y].beschiesseFeld()) {
            System.out.println("Treffer");
        }
        else
            System.out.println("Daneben");
    }

    public void pruefeObGewonnen(){
        String ausgabe="";
        boolean truth=true;

        for (int x=0; x< feld.length; x++){
            for (int y=0; y<feld[x].length; y++){
                if (feld [x][y].schiffIstAufFeld=true){
                    truth=true;
                    break;
                }
                else {
                    truth=false;
                }
            }
            break;
        }
        if(truth=true){
            ausgabe="Spiel noch nicht gewonnen.";
        }
        else {
            ausgabe="Spiel gewonnen!";
        }
        System.out.println(ausgabe);
    }

    public void gibSpielfeldAufKonsoleAus(){
        for (int i=0; i<feld.length; i++){
            for (int j=0; j<feld[i].length; j++){
                if(feld[i][j].schiffIstAufFeld=false){
                    System.out.print("-");
                }
                else if (feld[i][j].schiffIstAufFeld=true){
                    System.out.print("X");
                }
                else if (feld[i][j].feldGetroffen=true){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }


}//Ende Klasse
