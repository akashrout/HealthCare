package com.hospital.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernetConnectionProvider {
	
	public static Session getsession() {
Configuration conf = new Configuration().configure().addAnnotatedClass(null);
		
		ServiceRegistry reg  = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		
		
		SessionFactory factory = conf.buildSessionFactory(reg);
		Session session = factory.openSession(); 
		return session;
		
	}

}
