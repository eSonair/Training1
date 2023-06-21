
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;


public class PDF_lesen {
    public static void main(String[] args) throws Exception {

        PDDocument doc = PDDocument.load(new File("D:\\Programmieren\\Java\\2023\\Code\\PDFbox\\src\\test\\java\\TitanFall.pdf"));

        //PDFTextStripper erstellen (Objekt) u. liest alles aus dem PDF
        PDFTextStripper pdfStripper = new PDFTextStripper();

        //Alles in ein String speichern
        String text = pdfStripper.getText(doc);
        text.trim();
        System.out.println(text);

        String wichtig = text.substring(text.indexOf("nahkampf"),text.lastIndexOf("Titan")); // er nimmt immer den substring, den er als erstes findet

        doc.close();

    }//Ende Main
}//Ende Klasse
