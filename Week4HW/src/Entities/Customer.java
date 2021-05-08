package Entities;

import Abstract.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private int dateofbirth;
	private String NationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateofbirth, String nationalityId) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofbirth = dateofbirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	
	
}
