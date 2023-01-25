package com.velocity;

//POJO CLASS
public class StudentDetails {

	
	//Student Details 
	
	
	private String name;
	private String city;
	private String username;
	private String password;
	
	
	//default constructor
	
	StudentDetails(){
		
	}
	
	//Parameterized Constructor
	public StudentDetails(String name, String city, String username, String password) {
		super();
		this.name = name;
		this.city = city;
		this.username = username;
		this.password = password;
	}
	
	//Getter & Setter Methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//TO STRING
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", city=" + city + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
	
	
}
