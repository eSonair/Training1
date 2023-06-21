package Florian;

import java.io.IOError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.*;
import static java.nio.file.StandardOpenOption.*;

public class Einlesen2 {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("D:\\Programmieren\\Java\\2023\\Code\\Java_Textdatei\\src\\Florian\\test2.txt");
        String s = ".Zeile! \r\n"; //r=Einrückung
        //Wir wollen nicht auf d. ganze Datei zugreifen sondern nur auf eine bestimmte Datei.
        byte data [];
        ByteBuffer out;

        if(Files.exists(file)){
            System.out.println("File existiert.");
        }
        else {
            Files.createDirectories(file.getParent());
            Files.createFile(file);
            //Read u. Write ist nur in diesem Channel drinnen; read/write verlangen import static java.nio.file.StandardOpenOption.*;
            try(FileChannel fc = FileChannel.open(file, READ, WRITE)){
                //Ein Filechannel dient zum Lesen und Schreiben
                fc.position(0);
                for (int i=0; i<5; i++){
                    //Byte Array
                    data=((i+1)+s).getBytes(); //.getBytes() ist ähnlich wie ein Splitter f. String, nur halt f. Chars
                    out = ByteBuffer.wrap(data); // wird in ein ByteBuffer abgespeichert
                    while (out.hasRemaining()){
                        //System.out.println(out);
                        fc.write(out);
                    }
                    out.rewind(); //Buffer wird hier geleert
                }
            }
            catch (IOException x){
                System.out.println("I/O Exception: " + x);
            }
        }


    }//Ende Main
}//Ende Klasse
