public class Person {

    private String lastname;
    private String prename;
    private int personalNr;



    public Person (String lastname, String prename, int personalNr){
        setLastname(lastname);
        setPrename(prename);
        setPersonalNr(personalNr);
    }



    public int hashCode(){
        return getLastname().hashCode() + getPrename().hashCode() + getPersonalNr();
    }
    /*
    */


    // Equals neu überschreiben
    public boolean equals (Object o){
        if ((o==null) || (o.getClass()!= this.getClass()))
            return false;
        else {
            Person obj = (Person) o;
            return (obj.getLastname().equals(getLastname())&&
                    obj.getPrename().equals(getPrename())&&
                    obj.getPersonalNr()==(getPersonalNr()));
        }
    }//Ende equals.



    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getPrename() {
        return prename;
    }
    public void setPrename(String prename) {
        this.prename = prename;
    }
    public int getPersonalNr() {
        return personalNr;
    }
    public void setPersonalNr(int personalNr) {
        this.personalNr = personalNr;
    }
}
