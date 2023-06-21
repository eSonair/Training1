


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;



public class PDF_aendern {
    public static void main(String[] args) throws IOException {
        //PDF laden
        PDDocument doc = PDDocument.load(new File("Test.pdf"));

        //erste Seite laden
        PDPage page =doc.getPage(0);

        //Contentstream neu
        PDPageContentStream contentStream =
                new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true);

        //Schriftart u Größe
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);

        contentStream.beginText();
        contentStream.newLineAtOffset(220,750);
        contentStream.showText("Neuer Text zu PDF hinzugefügt");
        contentStream.endText();

        contentStream.close();
        doc.save (new File ("neuesDoc.pdf")); //Überschreiben wäre ohne new File
        doc.close();

    }//Ende Main
}//Ende Klasse
