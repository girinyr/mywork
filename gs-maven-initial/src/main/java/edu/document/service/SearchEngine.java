package edu.document.service;

import java.util.List;

import edu.document.model.Document;
import edu.document.model.Type;

public interface SearchEngine {
	
	public List<Document> findByType(Type documentType);
	public List<Document> listAll();

}
