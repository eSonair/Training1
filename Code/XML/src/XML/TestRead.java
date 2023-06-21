package XML;

import java.util.List;

public class TestRead {

    public static void main(String[] args) {

        //String path="D:\\Programmieren\\Java\\2023\\Code\\XML\\src\\XML\\Test.xml";

        StaXParser read = new StaXParser();
        List<Item> readConfig = read.readConfig("D:\\Programmieren\\Java\\2023\\Code\\XML\\src\\XML\\Test.xml");

        //System.out.println(readConfig.size());
        for (Item item : readConfig){
            System.out.println(item);
        }
    }//Ende Main
}//Ende Klasse
