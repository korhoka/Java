package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-eclipselink2");
	
	public void saveCustomer(Customer customer) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
	}
	
	public void saveBasicProfile(BasicProfile basicprofile) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(basicprofile);
        em.getTransaction().commit();
        em.close();
	}
	
	public void saveProfAndCust( BasicProfile basicprofile, Customer customer) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        em.persist(basicprofile);
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
	}
}