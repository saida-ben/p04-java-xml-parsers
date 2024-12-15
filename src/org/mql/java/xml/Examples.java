package org.mql.java.xml;

import java.util.List;

import org.mql.java.xml.models.Author;

/*
	 * - DOM charge tous dans un arbre
	 * - SAX(programmation evenementiel)
	 * - STAX  swapping ch
*/
public class Examples {
	

	
	public Examples() {
		exp01();
	}
	
	private void exp01() {
		AuthorsParser parser = new AuthorsParser();
		List<Author> authors = parser.parse("ressources/authors.xml");
		for(Author author : authors) {
			System.out.println(author);
		}
	}
	
	public static void main(String[] args) {
		new Examples();

	}

}
