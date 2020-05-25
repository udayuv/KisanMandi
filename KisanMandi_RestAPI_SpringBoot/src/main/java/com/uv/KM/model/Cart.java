package com.uv.KM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Product cart_prd;
	private int quantity;
	@ManyToOne
	private User cart_user;
		
	public Cart() {
		super();
	}

	public Cart(int id, Product cart_prd, int quantity, User cart_user) {
		super();
		this.id = id;
		this.cart_prd = cart_prd;
		this.quantity = quantity;
		this.cart_user = cart_user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getCart_prd() {
		return cart_prd;
	}

	public void setCart_prd(Product cart_prd) {
		this.cart_prd = cart_prd;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public User getCart_user() {
		return cart_user;
	}

	public void setCart_user(User cart_user) {
		this.cart_user = cart_user;
	}

	
	
	
}
