package com.uv.KM.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String p_name;
	private String p_desc;
	@ManyToOne
	private Category category;

	private int p_quantity;
	private float p_price;
	private boolean p_inStock;
	private String picture;
	
	@ManyToOne
	private Supplier pr_supp;
	
	@JsonIgnore
	@OneToMany(mappedBy="cart_prd" ,cascade= CascadeType.ALL)
	private List<Cart> cart;
	
	
	public Product() {
		super();
	}


	public Product(int id, String p_name, String p_desc, Category category, int p_quantity, float p_price,
			boolean p_inStock, String picture, Supplier pr_supp, List<Cart> cart) {
		super();
		this.id = id;
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.category = category;
		this.p_quantity = p_quantity;
		this.p_price = p_price;
		this.p_inStock = p_inStock;
		this.picture = picture;
		this.pr_supp = pr_supp;
		this.cart = cart;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public String getP_desc() {
		return p_desc;
	}


	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public int getP_quantity() {
		return p_quantity;
	}


	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}


	public float getP_price() {
		return p_price;
	}


	public void setP_price(float p_price) {
		this.p_price = p_price;
	}


	public boolean isP_inStock() {
		return p_inStock;
	}


	public void setP_inStock(boolean p_inStock) {
		this.p_inStock = p_inStock;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public Supplier getPr_supp() {
		return pr_supp;
	}


	public void setPr_supp(Supplier pr_supp) {
		this.pr_supp = pr_supp;
	}


	public List<Cart> getCart() {
		return cart;
	}


	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	
}
