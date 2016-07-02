package edu.document.service;

import org.testng.annotations.Test;

import edu.document.model.Type;

public class MySearchEngineTest {


	private SearchEngine engine = new MySearchEngine();
  @Test
  public void findByType() {
	  Type docType = new Type();
	  docType.setName("PDF");
       engine.findByType(docType);
  }

  @Test
  public void listAll() {
    throw new RuntimeException("Test not implemented");
  }
}
