public class Gebiet {

    boolean feldGetroffen;
    boolean schiffIstAufFeld;


    public Gebiet (){
        feldGetroffen=false;
        schiffIstAufFeld=false;
    }


    //Methoden
    public boolean beschiesseFeld(){
        feldGetroffen=true;
        if (schiffIstAufFeld){
            versenkeSchiff();
            return true;
        }
        else
            return false;
    }


    public void setzeSchiff(){
        schiffIstAufFeld=true;
    }

    public void versenkeSchiff(){
         schiffIstAufFeld=false;
    }

    public boolean isFeldGetroffen(){
        return feldGetroffen;
    }

    public boolean isSchiff(){
        return schiffIstAufFeld;
    }

}
