package com.uv.KM.service;

import java.util.List;

import com.uv.KM.model.Product;

public interface AdminProfileService {
	
	public	void approve(Product p);
	public List<Product> showPrpducts();
	public Product findProduct(int id);
	public void updateProduct(Product p);
    public void deleteProduct(int id);
}
