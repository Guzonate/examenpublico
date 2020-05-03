package ufv.dis.Prebaexamen.guzoexamen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneradorPDF {
	
	public static void generadorPDF(Usuario u) throws FileNotFoundException, DocumentException {
		
		String filename="pdfs/"+u.getName()+u.getLastname()+".pdf";
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(filename));
		document.open();
		document.add(new Paragraph("Nombre:"+ u.getName()));
		document.add(new Paragraph("Apellido:"+u.getLastname()));
		document.add(new Paragraph("Email:"+u.getEmail()));
		document.add(new Paragraph("DNI:"+u.getDni()));
		document.add(new Paragraph("Fecha de Nacimiento:"+u.getFechanac()));
		
		document.add(new Paragraph("Fecha creacion:"+new Date()));
		
		document.add(new Paragraph("Adulto:"+u.adulto()));
		document.close();
	}

}
