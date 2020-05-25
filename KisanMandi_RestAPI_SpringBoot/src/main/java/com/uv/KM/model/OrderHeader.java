package com.uv.KM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderHeader {
	
	private int id;
	
	private User user;
	private int orderTotal;
	private OrderLine orders;
	private int orderCount;
	private int orderDate;
}
