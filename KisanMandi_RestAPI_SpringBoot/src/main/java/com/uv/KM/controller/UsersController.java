package com.uv.KM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uv.KM.model.Category;
import com.uv.KM.model.Product;
import com.uv.KM.model.User;
import com.uv.KM.service.ProductService;
import com.uv.KM.service.UserService;


@RestController
@RequestMapping
//@CrossOrigin(origins="http://localhost:3000")
public class UsersController {
	
	@Autowired
	private UserService usr;
	
	@Autowired
	private ProductService prd_service;
	
	@CrossOrigin
	//@RequestMapping(value="/create", method=RequestMethod.POST)
	@RequestMapping(value="/create",method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
	public String createUser(@RequestBody User u){
		
		System.out.println("in usr ctrl");
		usr.addUser(u);
		System.out.println("hello");
		return "user added successfully";
	}
	 
	@CrossOrigin
	//@RequestMapping(value="/create", method=RequestMethod.POST)
	@RequestMapping(value="/cat/create",method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
	public String createCategory(@RequestBody Category c){
		
		System.out.println("in cat ctrl");
		prd_service.addCategory(c);
		System.out.println("cat added");
		return "cat added successfully";
	}

	@CrossOrigin
	//@RequestMapping(value="/create", method=RequestMethod.POST)
	@RequestMapping(value="/addproduct",method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
	public String createProduct(@RequestBody Product p){
		
		System.out.println("in prod ctrl");
		prd_service.addProduct(p);
		System.out.println("prod added");
		return "product added successfully";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Hello";
	}
	
	@CrossOrigin
	@RequestMapping(value="/usr/{id}",produces="application/json",
            method=RequestMethod.GET)
    public User getUserId(@PathVariable("id") int id)
    {
        User u = usr.findUser(id);
        return u;
    }
	
	 @RequestMapping(value="/usrs",produces="application/json",
	            method=RequestMethod.GET)
	    public List<User> getAllUsers()
	    {
	        List<User> usrList = usr.showUser();
	        return usrList;
	    }
	 
	 @RequestMapping(value="/products",produces="application/json",
	            method=RequestMethod.GET)
	    public List<Product> getAllProducts()
	    {
	        List<Product> prdList = prd_service.showProducts();
	        return prdList;
	    }
	 
	 @RequestMapping(value="/update", method=RequestMethod.PUT, 
	            produces="application/json", consumes="application/json")
	    public String updateUser(@RequestBody User u)
	    {
	        usr.updateUser(u);
	        return " user details updated successfully";
	    }
	    
	    /*** Delete a user***/
	    @RequestMapping(value="/delete/{id}",method=RequestMethod.GET
	    		,produces="application/json")
	    public String deleteUser(@PathVariable("id") int id)
	    {
	        usr.deleteUser(id);
	        return " user deleted successfully"+id;
	    }
	
	    
	   
}
