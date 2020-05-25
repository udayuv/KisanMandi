package com.uv.KM.service;

import java.util.List;

import com.uv.KM.model.Category;
import com.uv.KM.model.Product;


public interface ProductService {
	
	public void addProduct(Product p);
	public List<Product> showProducts();
	public Product findProductById(int id);
	public Product findProductByName(String search);
	public void updateProduct(Product p);
    public void deleteProduct(int id);
    
    /** methods for category*/
    public void addCategory(Category c);
    public List<Product> showCategory();
	public Product findCategoryById(int id);
	public Product findCategoryByName(String search);
	public void updateCategory(Category p);
    public void deleteCategory(int id);
}
