package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Company {

	private String companyName;
	private String city;
	private String state;

	public Company() {

	}

	public Company(String n, String c, String s) {
		this.companyName = n;
		this.city = c;
		this.state = s;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
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

	@Override
	public String toString() {
		return "Company [name=" + companyName + ", city=" + city + ", state=" + state + "]";
	}

	
	
	
}
