package com.uv.KM.service;

import java.util.List;

import com.uv.KM.model.User;


public interface UserService {
	
	public	void addUser(User u);
	public List<User> showUser();
	public User findUser(int id);
	public void updateUser(User u);
    public void deleteUser(int id);
    public String authenticateUser(String email,String passwd);
}
