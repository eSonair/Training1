

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;


public class PDF_erstellen {

    public static void main(String[] args) throws IOException {
        //Erstellen eines neuen PDFs
        PDDocument doc =  new PDDocument();

        //Neue Seite erstellen
        PDPage page = new PDPage();
        doc.addPage(page); //Neue Seite erstellen

        //Content Stream f. d. page
        PDPageContentStream contentStream = new PDPageContentStream(doc, page);

        //Schriftart und Größe
        contentStream.setFont(PDType1Font.TIMES_ROMAN,15);//oder null,0

        //Text schreiben
        contentStream.beginText();
        contentStream.newLineAtOffset(200, 700); // sonst beginnt d. System ganz links oben zu schreiben, alles in Pixel
        contentStream.showText("Hallo Welt");
        contentStream.endText();

        //Content Stream schließen
        contentStream.close();

        doc.save(new File ("Test.pdf"));
        doc.close();
    }//Ende Main
}//Ende
