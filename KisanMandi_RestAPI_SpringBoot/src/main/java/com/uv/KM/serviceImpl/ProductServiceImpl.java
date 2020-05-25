package com.uv.KM.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.uv.KM.model.Category;
import com.uv.KM.model.Product;
import com.uv.KM.repository.ProductRepository;
import com.uv.KM.service.ProductService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService{

	@PersistenceContext
	private EntityManager prd_mgr;
	@Autowired
	private ProductRepository prd_rep;
	
	@Override
	public void addProduct(Product product) {
		//for (Product product : products) {
			prd_rep.save(product);
		}
		
	//}
	@Override
	public List<Product> showProducts() {
		List<Product> products = prd_rep.getProducts(); 
				//prd_mgr.createQuery("Select p From Product p",Product.class).getResultList();
		return products;
	}

	@Override
	public Product findProductByName(String search) {
		Product p = prd_rep.findProductByName(search);
		return p;
	}

	@Override
	public void updateProduct(Product p) {
		prd_mgr.getTransaction().begin();
		prd_mgr.merge(p);
		prd_mgr.getTransaction().commit();
		
	}

	@Override
	public void deleteProduct(int id) {
		Product p =findProductById(id);
		prd_mgr.getTransaction().begin();
		prd_mgr.merge(p);
		prd_mgr.getTransaction().commit();
		
	}
	@Override
	public Product findProductById(int id) {
		Product p = prd_mgr.find(Product.class, id);
		return p;
	}
	
	
	/*
	 * Implementing the methods for category
	 * */
	@Override
	public void addCategory(Category c) {
		prd_mgr.persist(c);
		
	}
	@Override
	public List<Product> showCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product findCategoryById(int id) {
		return prd_rep.findCategoryById(id);
	}
	@Override
	public Product findCategoryByName(String search) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateCategory(Category p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		
	}


}
