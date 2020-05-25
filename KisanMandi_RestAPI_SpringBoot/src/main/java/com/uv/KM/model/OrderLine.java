package com.uv.KM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderLine {
	
	private int id;
	
	private Product product;
	private int productCount;
	private float total; 
}
