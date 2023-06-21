package XML;

public class TestWrite {
    public static void main(String[] args) {

        StaXWriter configFile = new StaXWriter();
        configFile.setFile("config2.xml"); //Alternativ Pfad angeben
        try{
            configFile.saveConfig();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//Ende Methode main
}//Ende Klasse
