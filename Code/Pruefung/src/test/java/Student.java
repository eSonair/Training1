import java.util.Random;

public class Student {
    //Nr. 2
    private String name, wohnort, anmerkung;
    private  int  ects=0;
    private static int matrikelnummer=10000000;
    private final int LIMIT =180;


    //CTOR Nr. 5 + Nr. 3
    public Student() {
       setName("Max Mustermann");
        this.matrikelnummer++;
        setWohnort("Wien");
       setEcts(0);
       setAnmerkung("");
    }


    public Student(String name, String wohnort) {
        setName(name);
        this.matrikelnummer++;
        setWohnort(wohnort);
        setEcts(0);
        setAnmerkung("");
    }
    public Student(String name, String wohnort, int ects) {
        this.name = name;
        this.matrikelnummer++;
        this.wohnort = wohnort;
        this.ects = ects;
        this.anmerkung = "";
    }


    //Nr. 7
    public Student(String name, String wohnort, int ects, String anmerkung) {
        this.name = name;
        this.matrikelnummer++;
        this.wohnort = wohnort;
        this.ects = ects;
        this.anmerkung = anmerkung;
    }


    //Nr.5
    public void pruefung(int ects){
        int rndNo, min=1, max=ects;
        Random random = new Random();
        if(getEcts()+ects>LIMIT || this.anmerkung.equals("Studium abgeschlossen")){
            System.out.println("Prüfung nicht möglich");
        }//Ende if

        rndNo =  random.nextInt(max + min) + min;
        if(rndNo==1){
            setEcts(+ects);
        }

        if(getEcts()==180){
            setAnmerkung("Studium abgeschlossen");
        }
    }//Ende Methode pruefung


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", wohnort='" + wohnort + '\'' +
                ", anmerkung='" + anmerkung + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                ", ects=" + ects +
                '}';
    }


    //Getter & Setter Nr. 2
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public String getAnmerkung() {
        return anmerkung;
    }

    public void setAnmerkung(String anmerkung) {
        this.anmerkung = anmerkung;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }
}//Ende Klasse

