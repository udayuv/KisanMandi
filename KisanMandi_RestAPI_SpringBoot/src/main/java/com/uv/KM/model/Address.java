package com.uv.KM.model;



import javax.persistence.*;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Supplier add_supp;
	private String address;
	private String City;
	private String state;
	private String country;
	private int pincode;
	
	public Address(){
		System.out.println("Address constructed..");
	}

	public Address(Integer id, User user, Supplier add_supp, String address, String city, String state, String country,
			int pincode) {
		super();
		this.id = id;
		this.user = user;
		this.add_supp = add_supp;
		this.address = address;
		City = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Supplier getAdd_supp() {
		return add_supp;
	}

	public void setAdd_supp(Supplier add_supp) {
		this.add_supp = add_supp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}