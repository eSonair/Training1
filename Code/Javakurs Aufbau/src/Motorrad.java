public class Motorrad extends Auto implements Fahrzeug {

    public Motorrad(){
        super();
    }


    public Motorrad(int kilometerstand, double fuellmenge){
        super(kilometerstand, 0, 0, fuellmenge);
    }

    public Motorrad(int kilometerstand, int baujahr, double tankvolumen, double fuellmenge){
        super(kilometerstand, baujahr, tankvolumen, fuellmenge);
    }


    public void volltanken(){
        this.setFuellmenge(this.getTankvolumen());
    }

    public int verkaufspreis(){
        int verkaufspreis;

        verkaufspreis=this.getBaujahr()*10-this.getKilometerstand();

        return verkaufspreis;
    }
}
