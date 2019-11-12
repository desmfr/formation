package monpdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DeuxiemePdf {
	
	public static void main(String[] args) throws Exception {
		var document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("deuxieme-pdf.pdf"));
		document.open();
		document.addTitle("Mon deuxieme PDF");
		document.addAuthor("FDE");
		document.add(new Paragraph("Hello the world en PDF deuxieme"));
		
		for (int i = 0; i < 10; i++) {
			if (i==3) {
				document.newPage();
				document.add(new Paragraph(i));
			}
			else document.add(new Paragraph("Memento mori "+ i));
		}
		
		document.close();
	}
}