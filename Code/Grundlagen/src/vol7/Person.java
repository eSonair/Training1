package vol7;

public class Person {

   private String name, haarfarbe, haarlaenge, augenfarbe;
   private int alter;

   //CTOR
   Person(){
   }

   Person(String name, String haarfarbe, String haarlaenge, String augenfarbe, int alter){
       setName(name);
       setHaarfarbe(haarfarbe);
       setHaarlaenge(haarlaenge);
       setAugenfarbe(augenfarbe);
   }


   public String printPerson(Person p1){
       String ausgabe;
       ausgabe = p1.getName()+ " hat " + p1.getHaarlaenge() + " " + p1.getHaarfarbe()
               + " Haare und " + p1.getAugenfarbe() + " Augen.";
      // System.out.println(p1.getName()+ " hat " + p1.getHaarlaenge() + " " + p1.getHaarfarbe() + " Haare und " + p1.getAugenfarbe() + " Augen.");
       return ausgabe;
   }

   public boolean stimmtHaarfarbe(Person p1, String haarfarbe){
       boolean truth=false;

       if (haarfarbe.equals(p1.getHaarfarbe())){ //p1.getHaarfarbe().equals(haarfarbe)
           truth=true;
       }else {
           truth=false;
       }
       return truth;
   }




   //Setter
   public void setName(String name){
       this.name=name;
   }
   public void setHaarfarbe(String haarfarbe){
       this.haarfarbe=haarfarbe;
   }
   public void setHaarlaenge(String haarlaenge){
       this.haarlaenge=haarlaenge;
   }
   public void setAugenfarbe(String augenfarbe){
       this.augenfarbe=augenfarbe;
   }
   public void setAlter(int alter) {
       this.alter=alter;
   }

   // Getter
    public String getName(){
       return this.name;
    }
    public String getHaarfarbe(){
        return this.haarfarbe;
    }

    public String getAugenfarbe(){
        return this.augenfarbe;
    }

    public String getHaarlaenge(){
        return this.haarlaenge;
    }
    public int getAlter(){
       return this.alter;
    }





}//Ende Klasse
