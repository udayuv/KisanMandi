package com.uv.KM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uv.KM.model.User;


@Repository("user_rep")
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
