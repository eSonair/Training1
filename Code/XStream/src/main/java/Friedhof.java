public class Friedhof {


       /*
          //Lesen aus XML - File
        String path = "D:\\Programmieren\\Java\2023\\Code\\XStream\\src\\ain\\java\\Test.xml";

        //XStream Objekt erstellen
        XStream xStream = new XStream((new StaxDriver()));

        Item it = (Item) xStream.fromXML(new File(path));
        System.out.println(it);

         */





      /*
        //Lesen aus XML - File
        String path = "/Users/florianfribert/eclipse-workspace/Java/XML/test.xml";
        String xml = " <item date=\"January 2009\">\n"
                + "        <mode>1</mode>\n"
                + "        <unit>900</unit>\n"
                + "        <current>1</current>\n"
                + "        <interactive>1</interactive>\n"
                + "    </item>\n"
                ;

        //XStream Objekt erstellen
        XStream xstream = new XStream(new StaxDriver());

        //Item objekt erstellen
        Item a = new Item("Feb 2020", "50", "900", "1", "7");
        //umwandeln in XML
        String xml2 = xstream.toXML(a);
        System.out.println(xml2);

        Item it = (Item)xstream.fromXML(xml2);
        //Item it = (Item)xstream.fromXML(new File(path));
        //Item it = (Item)xstream.fromXML(xml);

        System.out.println(it);

         */


}//Ende Klasse
