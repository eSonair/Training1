package XML;

import javax.xml.stream.*; //javax= wird auch als Javabean bezeichnet
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.*;

//StaXParser = XML Lesen u. Erstellt ein Item, zwingt es in eine Liste u. d. Liste wird dann returned.
public class StaXParser {

    static final String DATE ="date";
    static final String ITEM  ="item";
    static final String MODE ="mode";
    static final String UNIT ="unit";
    static final String  CURRENT ="current";
    static final String INTERACTIVE  ="interactive";


    @SuppressWarnings({"unchecked", "null"})
    public List <Item> readConfig(String configFile){ //das hier ist eine List-Methode, wir geben am Ende eine Liste erstellt/zurück gegeben.
        List <Item> items = new ArrayList<Item>();
        try{
            //XMLInpute Factory create
            XMLInputFactory inputFactory=XMLInputFactory.newInstance(); //Ist f. d. Lesen wichtig.
            //Setup v. eventReader
            InputStream in = new FileInputStream(configFile); //Du bist auf meiner configFile
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in); //D. Eventreader soll nun dieses File lesen.
            //read XML document
            Item item = null;

            while(eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent(); //nextEvent ="D. (Ein)leser f. XML Stream

                if (event.isStartElement()) { //isSTartElement = geht es nur darum ob es ein OpenTag gibt.
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();//getLocalPart = nur d. Name v. diesem Tagname p
                    //ohne den Zusatz. Während .getName() den ganzen "OpenTag.


                    switch (elementName) {
                        case ITEM:
                            item = new Item();
                            Iterator<Attribute> attributes = startElement.getAttributes(); //"January 2009" wäre hier d. Inhalt, welches geholt wird
                            while (attributes.hasNext()) {
                                Attribute attribute = attributes.next();
                                if (attribute.getName().toString().equals(DATE)) { //es ist egal wie d. Datum dargestellt wird. Es prüft nur auf d. Wort "date".
                                    item.setDate(attribute.getValue()); //holt sich den Inhalt v. einem Attribut.
                                }
                            }//Ende While
                            break;
                        case MODE:
                            event = eventReader.nextEvent();
                            item.setMode(event.asCharacters().getData());//asCharacters holt sich alles aus den Tags in einem raus.
                            break;
                        case UNIT:
                            event = eventReader.nextEvent();
                            item.setUnit(event.asCharacters().getData());
                            break;
                        case CURRENT:
                            event = eventReader.nextEvent();
                            item.setCurent(event.asCharacters().getData());
                            break;
                        case INTERACTIVE:
                            event = eventReader.nextEvent();
                            item.setInteractive(event.asCharacters().getData());
                            break;
                    }//Ende switch
                }//Ende if
                //Prüfen ob Item Element Ende
                if(event.isEndElement()){
                    EndElement endElement=event.asEndElement();
                    if(endElement.getName().getLocalPart().equals(ITEM)){
                        items.add(item);
                    }
                }
            }//Ende While
        }catch(FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return items;
    }//Ende Public List.
}//Ende Klasse
