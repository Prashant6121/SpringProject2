package in.pd.beans;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Student ID :"+id);
		System.out.println("Student Name :"+name);
		System.out.println("Student Address :"+address);
	}

}
