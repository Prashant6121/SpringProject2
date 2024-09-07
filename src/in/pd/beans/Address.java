package in.pd.beans;

public class Address {
	private int houseno1;
	private String City;
	private int pincode;
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "H/N " + houseno + " ," + City + " - " + pincode;
	}
	

}
