package Florian.hue;

public class Mitarbeiter {

    private String vorname,nachname, abteilung;
    private int alter;
    private int gehalt;


    public Mitarbeiter(String vorname, String nachname, int alter, String abteilung, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
    }


    public int compareTo (Mitarbeiter m1) {
        if ((m1 == null || (m1.getClass() != getClass())))
            return -1;
        int i = getVorname().compareTo(m1.getVorname());
        if (i != 0){
            return i;
        }
        /*
        i = getNachname().compareTo(m1.getNachname());
        i = getAlter() - m1.getAlter();
        i = getAbteilung().compareTo(m1.getAbteilung());
        i = getGehalt() - m1.getGehalt();
         */
        return i;
    }//Ende compareTo.







    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getAbteilung() {
        return abteilung;
    }
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getGehalt() {
        return gehalt;
    }
    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
}//Ende Klasse
