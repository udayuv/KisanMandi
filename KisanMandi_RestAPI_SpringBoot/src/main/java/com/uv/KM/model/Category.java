package com.uv.KM.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@JsonIgnore
	@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
	private List<Product> product;
	
	private String cat_name;

	
	public Category() {
		super();
	}


	public Category(int id, List<Product> product, String cat_name) {
		super();
		this.id = id;
		this.product = product;
		this.cat_name = cat_name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public String getCat_name() {
		return cat_name;
	}


	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	
}
