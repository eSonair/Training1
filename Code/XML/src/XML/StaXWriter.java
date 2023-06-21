package XML;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;

public class StaXWriter {

    private String configFile;

    public void setFile (String configFile){
        this.configFile=configFile;
    }

    public void saveConfig() throws Exception{
        //Erstellen einer OutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        //Eventwriter erstellen
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(configFile));
        //Eventfactory erstellen
        XMLEventFactory eventFactory=XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        //Start Tag schreiebn und erstellen
        StartDocument startDocument= eventFactory.createStartDocument(); //d. ist d. allgemeine Start Tag eines XML Dokuments
        eventWriter.add(startDocument);

        //erstellen confic open tag
        StartElement configStartElement = eventFactory.createStartElement("", "", "config"); //Brauchen nur localName
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        //Verschiedene Attribute erstellen
        createNode(eventWriter, "mode", "1");
        createNode(eventWriter, "unit", "901");
        createNode(eventWriter, "current", "2");
        createNode(eventWriter, "interactive", "0");

        eventWriter.add(eventFactory.createEndElement("", "", "config"));
        eventWriter.add(end);//Zeilenumbruch
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }//Ende void saveConfig

    private void createNode (XMLEventWriter eventWriter, String name, String value) throws XMLStreamException{
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        //Erstellen der Tags "name"
        StartElement sElement = eventFactory.createStartElement("","", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        Characters characters = eventFactory.createCharacters(value); //d. ist d. Wert zwischen den Tags, value wird als Parameter übergeben
        eventWriter.add(characters);

        //Ende Tag "name"
        EndElement endElement= eventFactory.createEndElement("", "", name);
        eventWriter.add(sElement);
        eventWriter.add(end);
    }


}//Ende Klasse
