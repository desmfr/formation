package fr.maif.formation.fichesocietaire;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class WriteFiche {
	
	private Societaire soc;
	
	public WriteFiche(Societaire soc) {
		this.soc = soc;
	}
	
	public void save() throws Exception {
		var document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("fiche_" + soc.getId()  + ".pdf"));
		document.open();
		//document.addTitle("Fiche " + soc.getName() + " " + soc.getPrenom() );
		document.addAuthor("MAIF");
		Paragraph p = new Paragraph();
		//p.add("je soussigné " + soc.getName() + " " + soc.getPrenom() + " dit oui oui oui");
		document.add(p);
		
		p.add("je soussigné " + soc.getDenomination() + " dit oui oui oui");
		document.add(p);
		
		document.add(new Paragraph("societaire numero " + soc.getId()/* + ", " + soc.getAge() + " ans."*/));
		
		//if (Math.sqrt(soc.getAge()) == 6) {
		//	document.newPage();
		//	document.add(new Paragraph("Memento mori"));
		//}
		document.close();
	}
}
