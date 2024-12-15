package org.mql.java.xml.models;

public class Author {
	private int id;
	private String name;
	private Date birthday;
	private String country;
	private String technology;
	
	public Author() {

	}
	public Author(int id, String name, Date birthday, String country, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.country = country;
		this.technology = technology;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", birthday=" + birthday + ", country=" + country
				+ ", technology=" + technology + "]";
	}

	

}
