package com.elvisjacob.DAO;

import java.util.List;

import com.elvisjacob.model.User;

public interface AppDAO {

	public List<User> listUsers();
	
	void addUser(User user);
}
