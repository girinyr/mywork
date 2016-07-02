package edu.document.model;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	
	public static List<Document> get(){
		List<Document> result = new ArrayList<Document>();
		
		Type type = new Type();
		type.setName("PDF");
		type.setDesc("Portable Document Format");
		type.setExtension(".pdf");
		Document document = new Document();
		document.setName("Book Template");
		document.setType(type);
		document.setLocation("/Documents/Book Template.pdf");
				
		Type type1 = new Type();
		type1.setName("PDF");
		type1.setDesc("Portable Document Format");
		type1.setExtension(".pdf");
		Document document1 = new Document();
		document1.setName("spring");
		document1.setType(type1);
		document1.setLocation("/Documents/spring.pdf");
		
		Type type2 = new Type();
		type2.setName("PDF");
		type2.setDesc("Portable Document Format");
		type2.setExtension(".pdf");
		Document document2 = new Document();
		document2.setName("Scala School");
		document2.setType(type2);
		document2.setLocation("/Documents/Scala School.pdf");
		
		Type type3 = new Type();
		type3.setName("DOC");
		type3.setDesc("Word");
		type3.setExtension(".doc");
		Document document3 = new Document();
		document3.setName("My_Resume");
		document3.setType(type3);
		document3.setLocation("/Documents/My_Resume.doc");
		
		Type type4 = new Type();
		type4.setName("XML");
		type4.setDesc("Extensible markup language");
		type4.setExtension(".xml");
		Document document4 = new Document();
		document4.setName("Purchase Order");
		document4.setType(type4);
		document4.setLocation("/Documents/Purchase Order.xml");
		
		Type type5 = new Type();
		type3.setName("DOC");
		type3.setDesc("Word");
		type3.setExtension(".doc");
		Document document5 = new Document();
		document5.setName("Resume2");
		document5.setType(type5);
		document5.setLocation("/Documents/Resume2.pdf");
		
		result.add(document);
		result.add(document1);
		result.add(document2);
		result.add(document3);
		result.add(document4);
		result.add(document5);
		
		return result;
		}

}
