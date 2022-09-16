package com.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	
	static {
		 try{
			StandardServiceRegistry serviceregistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metadata=new MetadataSources(serviceregistry).getMetadataBuilder().build();
			sessionFactory=metadata.getSessionFactoryBuilder().build();
		}catch(Throwable th) {
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
