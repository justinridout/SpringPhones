package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Phones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String model;
	private double screenSize;
	@Autowired
	private Company company;
	
	public Phones() {
		super();
		this.model = "IPhone 11";
	}
	
	public Phones(String name) {
		this.name = name;
	}
	
	public Phones(String name, String model, double screenSize) {
		this.name = name;
		this.model = model;
		this.screenSize = screenSize;
	}
	
	public Phones(int id, String name, String model, double screenSize) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.screenSize = screenSize;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Phones [id=" + id + ", name=" + name + ", model=" + model + ", screenSize=" + screenSize + ", company="
				+ company + "]";
	}	
	

}
