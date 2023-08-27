package module02.objectclassestopics;

import java.util.Date;

/**
 * This class represents a Person with various attributes.
 */
public class Person {
	
	// Attributes of the Person class.
	// Unique identification for the person.
	private Long id;             
	// First name of the person.
	private String fname;        
	// Last name of the person.
	private String lname;        
	// Street number of the person's address.
	private Short streetNo;    
    // Street name of the person's address.
	private String streetName; 
	// City of the person's address.
	private String city; 
    // State of the person's address.
	private String state;
    // ZIP code of the person's address.
	private Integer zip;
    // Phone number of the person.
	private Long phone;
    // Salary of the person.
	private Float salary;
	
	public static int count;
	
	java.util.Date creationDate;
	
	public Boolean isMember;
	
	private String defaultPassword;
	
	// Default constructor for the Person class.
	public Person() {
		super();  // Call the superclass constructor. 
		count++;
		id=(long)MyRandomPersonData.randomNumber(14370001,14379999);              
		fname=MyRandomPersonData.randomFname();          
		lname=MyRandomPersonData.randomLname(); 
		streetNo=MyRandomPersonData.randomNumber(1,23_002); 
		streetName=MyRandomPersonData.randomStreet(); 
		city=MyRandomPersonData.randomCity(); 
		state=MyRandomPersonData.randomState(); 
		zip=Math.abs((int)MyRandomPersonData.randomNumber(23000L,89000L)); 
		phone=MyRandomPersonData.randomBigNumber(222_222_0099L, 999_888_9988L); 
		salary=Math.abs((float)MyRandomPersonData.randomNumber(55_000, 175_000)); 
		creationDate=new java.util.Date();
		creationDate.setTime(System.currentTimeMillis());
		defaultPassword=password();
	} 
	// Copy constructor for the Person class.
	public Person(Person p) { 
		id=p.getId();
		fname=p.getFname();
		lname=p.getLname();
		streetNo=p.getStreetNo();
		streetName=p.getStreetName();
		city=p.getCity();
		state=p.getState();
		zip=p.getZip();
		phone=p.getPhone();
		salary=p.getSalary();
		creationDate=p.getCreationDate();
	}
	
	

    /**
     * Parameterized constructor for the Person class.
     */
	public Person(Long id, String fname, String lname, Short streetNo, String streetName, String city, String state,
			Integer zip, Long phone, Float salary, Date creationDate, Boolean isMember, String defaultPassword) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.salary = salary;
		this.creationDate = creationDate;
		this.isMember = isMember;
		this.defaultPassword = defaultPassword;
	}

    /**
     * Generates a password based on various attributes.
     */
	private String password() {
		String x = (""+id).substring(1,3)+"";
		x+=(""+fname).substring(1,3)+"";
		x+=(""+phone).substring(1,3)+"";
		x+=(""+creationDate).substring(1,3)+"";
		x+=(""+streetName).substring(1,3)+"";
		return x.trim().toLowerCase();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Short getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(Short streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public Boolean getIsMember() {
		return isMember;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

    /**
     * Displays the details of the Person.
     */
	public void display() {
		System.out.println("row: ["+count+"]");
		System.out.println("id = ["+id+"]");
		System.out.println("fname = ["+fname+"]");
		System.out.println("lname = ["+lname+"]");
		System.out.println("address = ["+streetNo+" "+streetName+"]");
		System.out.println("city = ["+city+"]");
		System.out.println("state = ["+state+"]");
		System.out.println("zip = ["+zip+"]");
		System.out.printf("phone = [%s]\n",(phone+"")
				.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3"));
		System.out.printf("salary = [$%,.2f]\n",salary);
		System.out.printf("Person Created = [%s]\n",
				creationDate.getTime()+"\n or "+creationDate.toString());
	System.out.println("Default Password = "+getCurrentPassword());
	
	}
	public String getCurrentPassword() {
		return defaultPassword;
	}
	public void setDefaultPassword(String password) {
		defaultPassword=password;
	}
 
	public String printPerson() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", streetNo=" + streetNo + ", streetName="
				+ streetName + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", salary="
				+ salary + ", creationDate=" + creationDate + ", isMember=" + isMember + ", defaultPassword="
				+ defaultPassword + "]";
	}
    // Return a formatted string representation of the Person.
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", streetNo=" + streetNo + ", streetName="
				+ streetName + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", salary="
				+ salary + ", creationDate=" + creationDate + ", isMember=" + isMember + ", defaultPassword="
				+ defaultPassword + "]";
	}
	
	

}





