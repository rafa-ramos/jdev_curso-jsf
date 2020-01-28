package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("jdev_jsf");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
