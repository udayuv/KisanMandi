package com.uv.KM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uv.KM.dto.ProductDetailDto;
import com.uv.KM.model.Product;

@Repository("prd_rep")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	/**
	 * CREATE OR REPLACE VIEW productDetailView as
			SELECT p.p_id,
			       p.p_name,
			       p.p_desc,
			       c.c_name,
			       p.p_quantity,
			       p.p_price,
			       p.p_inStock,
			       s.sup_name,
			       p.p_image
			FROM product p
		         JOIN category c on p.p_id = c.p_id
		         JOIN supplier s on p.sup_id = s.p_id;
	 * */
	//finding all the product list from view productDetailView
	//@Query("FROM productDetailView")
	//public List<ProductDetailDto> getProductsList();
	
	//finding the product by product name
			@Query(value = "FROM Product p")
			public List<Product> getProducts();
	
	//finding the product by product name
	@Query(value = "FROM Product p WHERE p.p_name = :name")
	public Product findProductByName(@Param("name") String name);
	
	//finding the product by product name
		@Query(value = "FROM Category cat WHERE cat.id = :id")
		public Product findCategoryById(@Param("id") int id);
}
