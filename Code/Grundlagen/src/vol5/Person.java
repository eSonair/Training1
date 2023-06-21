package vol5;

public class Person {

   public String name, haarfarbe, haarlaenge, augenfarbe;

   //CTOR
   Person(){
   }

   Person(String name, String haarfarbe, String haarlaenge, String augenfarbe){
       this.name=name;
       this.haarfarbe=haarfarbe;
       this.haarlaenge=haarlaenge;
       this.augenfarbe=augenfarbe;
   }


   public String printPerson(Person p1){
       String ausgabe;
       ausgabe = p1.getName()+ " hat " + p1.getHaarlaenge() + " " + p1.getHaarfarbe()
               + " Haare und " + p1.getAugenfarbe() + " Augen.";
      // System.out.println(p1.getName()+ " hat " + p1.getHaarlaenge() + " " + p1.getHaarfarbe() + " Haare und " + p1.getAugenfarbe() + " Augen.");
       return ausgabe;
   }

   public boolean stimmtHaarfarbe(Person p1, String haarfarbe){
       return haarfarbe.equals(p1.getHaarfarbe());
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





}//Ende Klasse
