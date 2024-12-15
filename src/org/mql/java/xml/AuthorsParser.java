package org.mql.java.xml;
import java.util.List;
import java.util.Vector;
import org.mql.java.xml.models.Author;




import org.mql.java.xml.models.Author;
import org.mql.java.xml.models.Date;
public class AuthorsParser {

	public AuthorsParser() {
		// TODO Auto-generated constructor stub
	}
	//MAPPING XML/Object

	public List<Author> parse(String source){
		List<Author> authors = new Vector<Author>();

		XMLNode root = new XMLNode(source);
		XMLNode t[] = root.children();
		System.out.println(t.length);
		
		for(XMLNode node : t) {
			Author a = new Author();
			authors.add(a);
			a.setId(node.intAttribute("id"));
			a.setName(node.child("name").getValue());
			a.setCountry(node.child("country").getValue());
			a.setTechnology(node.child("technology").getValue());

			XMLNode date =node.child("birthday");
			a.setBirthday(new Date(
					date.intAttribute("day"),
					date.intAttribute("month"),
					date.intAttribute("year")
					));

			
		}
		
		
		return authors;
	}
}
