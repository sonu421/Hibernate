package com.jspiders.theatre.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.theatre.dto.TheatreDTO;

public class TheatreDAO {

	public void saveTheatre(TheatreDTO theatreDTO) {
		//Component - 1 
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// Component - 2
		SessionFactory factory = cfg.buildSessionFactory();
		
		// Component - 3
		Session session = factory.openSession();
		
		// Subcomponent - 1 of Session
		Transaction transaction = session.beginTransaction();
		
		session.save(theatreDTO);
		
		transaction.commit();
	}
}
