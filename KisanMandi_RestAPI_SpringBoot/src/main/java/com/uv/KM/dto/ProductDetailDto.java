package com.uv.KM.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "productDetailView")
public class ProductDetailDto {
	@Id
	private int p_id;
    private String p_name;
    private String p_desc;
    private String c_name;
    private int p_quantity;
    private float p_price;
    private int p_inStock;
    private String sup_name;
    private String p_image;
    
    
	public ProductDetailDto() {
		super();
	}


	public ProductDetailDto(int p_id, String p_name, String p_desc, String c_name, int p_quantity, float p_price,
			int p_inStock, String sup_name, String p_image) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.c_name = c_name;
		this.p_quantity = p_quantity;
		this.p_price = p_price;
		this.p_inStock = p_inStock;
		this.sup_name = sup_name;
		this.p_image = p_image;
	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
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


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
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


	public int getP_inStock() {
		return p_inStock;
	}


	public void setP_inStock(int p_inStock) {
		this.p_inStock = p_inStock;
	}


	public String getSup_name() {
		return sup_name;
	}


	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}


	public String getP_image() {
		return p_image;
	}


	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

    
}
