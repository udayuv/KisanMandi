package com.uv.KM.model;



import javax.persistence.*;

@Entity
public class Shipper {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String sh_name;
	@OneToOne
	private Address address;
	
	public Shipper(){
		
	}
	
	public Shipper(Integer id, String sh_name, Address address) {
		super();
		this.id = id;
		this.sh_name = sh_name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSh_name() {
		return sh_name;
	}

	public void setSh_name(String sh_name) {
		this.sh_name = sh_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}