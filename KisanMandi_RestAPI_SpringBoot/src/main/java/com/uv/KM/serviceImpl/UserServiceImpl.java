package com.uv.KM.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.uv.KM.model.User;
import com.uv.KM.repository.UserRepository;
import com.uv.KM.service.UserService;
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

	@PersistenceContext
    private EntityManager ur;
	
	@Autowired
	private UserRepository user_rep;
//	private ExcelQuestionRepository questionRepository;

	public void addUser(User u) {
		
		ur.persist(u);
	}

	@SuppressWarnings("unchecked")
	public List<User> showUser() {
	
		return ur.createQuery("select usr from User usr").getResultList();
	}
	
	public User findUser(int id) {
		
		return ur.find(User.class,id);
	}

	public void updateUser(User u) {
		
			ur.merge(u);
	}

	public void deleteUser(int id) {
		
		User u=ur.find(User.class, id);
		ur.remove(u);
	}

	public String  authenticateUser(String email,String password) {
		
		try
		{
	Object q= ur.createQuery("select usr from Users usr where usr.email=:email and usr.password=:password ")
				.setParameter("email",email)
				.setParameter("password", password)
				.getSingleResult();
		
			
			if(q!=null){
				System.out.println("logged in successfully");
			}
			else {
				System.out.println("invalid credentials");
			}
	}
	catch(Exception e){
		e.printStackTrace();
	}
		return "login successfully";
		
	}

	
}
