package com.uv.KM.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy="add_supp", cascade= CascadeType.ALL)
	private List<Address> s_address;
	private String sp_name;
	private String sp_fname;
	private String sp_lname; 
	
	@OneToMany(mappedBy="pr_supp", cascade=CascadeType.ALL)
	private List<Product> sp_product;

	public Supplier() {
		super();
	}

	public Supplier(int id, List<Address> s_address, String sp_name, String sp_fname, String sp_lname,
			List<Product> sp_product) {
		super();
		this.id = id;
		this.s_address = s_address;
		this.sp_name = sp_name;
		this.sp_fname = sp_fname;
		this.sp_lname = sp_lname;
		this.sp_product = sp_product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Address> getS_address() {
		return s_address;
	}

	public void setS_address(List<Address> s_address) {
		this.s_address = s_address;
	}

	public String getSp_name() {
		return sp_name;
	}

	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}

	public String getSp_fname() {
		return sp_fname;
	}

	public void setSp_fname(String sp_fname) {
		this.sp_fname = sp_fname;
	}

	public String getSp_lname() {
		return sp_lname;
	}

	public void setSp_lname(String sp_lname) {
		this.sp_lname = sp_lname;
	}

	public List<Product> getSp_product() {
		return sp_product;
	}

	public void setSp_product(List<Product> sp_product) {
		this.sp_product = sp_product;
	}


	
}
