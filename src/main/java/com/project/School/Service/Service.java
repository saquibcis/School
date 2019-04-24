package com.project.School.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.project.School.DAO.Repository;
import com.project.School.Model.User;

@org.springframework.stereotype.Service
public class Service {

	@Autowired Repository repos;

	@Transactional
	public boolean addUser(User user) {
		
		return repos.addUser(user);
	}
}