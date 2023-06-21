
public class Auto implements Fahrzeug {

    private int kilometerstand=0;
    private int baujahr;
    private double tankvolumen=100;
    private double fuellmenge;


    public Auto(){

    }

    public Auto(int kilometerstand, int baujahr){
        setKilometerstand(kilometerstand);
        setBaujahr(baujahr);
    }

    public Auto (double tankvolumen, double fuellmenge){
        this(40, 2008, tankvolumen,fuellmenge);
    }


    public Auto(int kilometerstand, int baujahr, double tankvolumen, double fuellmenge){
        setKilometerstand(kilometerstand);
        setBaujahr(baujahr);
        setTankvolumen(tankvolumen);
        setFuellmenge(fuellmenge);
    }


    public void volltanken(){
        fuellmenge=tankvolumen;
    }


    @Override
    public int verkaufspreis(){
        int verkaufspreis;

        verkaufspreis=(baujahr*2)-kilometerstand;

        return verkaufspreis;
    }



    //Setter
    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    public void setTankvolumen(double tankvolumen) {
        this.tankvolumen = tankvolumen;
    }
    public void setFuellmenge(double fuellmenge) {
        this.fuellmenge = fuellmenge;
    }

    //Getter
    public int getKilometerstand() {
        return kilometerstand;
    }
    public int getBaujahr() {
        return baujahr;
    }
    public double getTankvolumen() {
        return tankvolumen;
    }
    public double getFuellmenge() {
        return fuellmenge;
    }
}
