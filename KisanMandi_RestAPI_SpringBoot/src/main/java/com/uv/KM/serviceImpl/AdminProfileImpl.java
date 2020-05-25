package com.uv.KM.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.uv.KM.model.Product;
import com.uv.KM.service.AdminProfileService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AdminProfileImpl implements AdminProfileService {

	
	@PersistenceContext
    private EntityManager er;
	
	
	@Override
	public void approve(Product p) {
		er.persist(p);
		
	}

	@Override
	public List<Product> showPrpducts() {
		return er.createQuery("select p from Product p").getResultList();
	}

	@Override
	public Product findProduct(int id) {
		return er.find(Product.class,id);
	}

	@Override
	public void updateProduct(Product p) {
		er.merge(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		Product p=er.find(Product.class, id);
		er.remove(p);
		
	}

}
