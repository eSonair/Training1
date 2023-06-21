import java.util.Objects;

public class Auto {

    private int baujahr, preis, kilometerAnzahl;
    String modell;


    public Auto(String modell, int baujahr, int kilometerAnzahl) {
        this.baujahr = baujahr;
        //this.preis = preis;
        this.kilometerAnzahl = kilometerAnzahl;
        this.modell = modell;
        if (!modell.equals("Mercedes")){
            this.preis =  35000-kilometerAnzahl*10;
        }
        else{
            this.preis = 80000 - kilometerAnzahl*10;
        }
    }

    public Auto(String modell, int baujahr, int kilometerAnzahl, int preis) {
        this.baujahr = baujahr;
        this.preis = preis;
        this.kilometerAnzahl = kilometerAnzahl;
        this.modell = modell;
    }

    public void fahren(int km){
        this.kilometerAnzahl+=km;
        this.preis=preis();
    }


    public int preis( ){
       int result=0;

        if (this.modell.contains("Mercedes")){
            result = 80000 - this.getKilometerAnzahl()*10;
        }
        else{
            result =  35000-this.getKilometerAnzahl()*10;
        }
        return result;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return getBaujahr() == auto.getBaujahr() &&
                getPreis() == auto.getPreis() &&
                getKilometerAnzahl() == auto.getKilometerAnzahl() &&
                Objects.equals(getModell(), auto.getModell());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModell(), getBaujahr(), getPreis(), getKilometerAnzahl() );
    }



    public int getBaujahr() {
        return baujahr;
    }
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getKilometerAnzahl() {
        return kilometerAnzahl;
    }
    public void setKilometerAnzahl(int kilometerAnzahl) {
        this.kilometerAnzahl = kilometerAnzahl;
    }

    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }
}//Ende Klasse
