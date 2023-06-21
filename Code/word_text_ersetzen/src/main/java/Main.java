
import com.spire.doc.Document;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import java.io.*;

public class Main {

    public static void deleteParagraph(XWPFParagraph p){
        XWPFDocument doc = p.getDocument();
        int pPos = doc.getPosOfParagraph(p);
        doc.removeBodyElement(pPos);
    }


    public static void main(String[] args) throws IOException {

        //Erstellen eines Documents
        Document document = new Document(); //kommt v. Spire, d. Formatierungen bleiben.

        document.loadFromFile("Selbststudium.docx");

        document.replace("Welt", "", false,true);
        document.replace("Laktat", "LAKTAT", false, false);

        document.saveToFile("Bearbeitet.docx");


        XWPFDocument doc = new XWPFDocument(new FileInputStream("Bearbeitet.docx"));


        int pNumber = doc.getParagraphs().size()-1;
        while (pNumber>=0){
            //ArrayList wird durch "getParagraphs" hier erstellt.
            XWPFParagraph p = doc.getParagraphs().get(pNumber); //get(pNumber) d. Größe d. Arrays übergeben.
            if(p.getParagraphText().contains("Evaluation")){
                deleteParagraph(p);
            }//Ende if
            pNumber--;
        }//Ende While

        FileOutputStream out  = new FileOutputStream("Bearbeitet_ohne_Warning.docx");
        doc.write(out);
        out.close();
        //doc.close();


        try{
            InputStream docFile = new FileInputStream(new File("Bearbeitet_ohne_Warning.docx"));
            XWPFDocument docx = new XWPFDocument(docFile);
            PdfOptions pdfopt = PdfOptions.create();
            OutputStream outX = new FileOutputStream(new File ("Bearbeitet_ohne_Warning.pdf"));
            PdfConverter.getInstance().convert(docx, outX, pdfopt);
            docFile.close();
            outX.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }//Ende Main
}//Ende Klasse
