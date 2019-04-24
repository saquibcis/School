package com.project.School.DAO;



import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.project.School.Model.User;

@org.springframework.stereotype.Repository
public class Repository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	
	private Session getSession() {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		return session;
	}
	
	public boolean addUser(User user) {
		try {
			System.out.println("in Repo");
		Session session= getSession();
		session.beginTransaction();
		System.out.println("before save");
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
		}catch(Exception exp) {
			System.out.println("something bad happened");
			return false;
		}

		System.out.println("in Repo");
		return true;
		
	}
	
}
