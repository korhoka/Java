package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import entity.*;
import java.util.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Harj1PU");

	
	public void addRegister(Register reg) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        em.persist(reg);
        
        em.getTransaction().commit();
        em.close();
	}
	
	public void addEvent(int eventNumber, int regNumber, double amount) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        Register reg = em.find(Register.class, regNumber);
        SalesEvent evt = new SalesEvent(eventNumber, reg, amount);
        
        em.persist(evt);
        
        em.getTransaction().commit();
        em.close();	
	}
	
	public List<SalesEvent> retrieveSmallSales(double limit) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<SalesEvent> result = null;
		// logic goes here
		String statement = "SELECT e FROM SalesEvent e WHERE amount<" + limit;
		Query query = em.createQuery(statement);
		result = query.getResultList();
		//
		em.getTransaction().commit();
		em.close();
		return result;
	}
	
	public void addServiceFeed(double feed) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String statement = "UPDATE SalesEvent SET amount = amount + :feed";
		Query query = em.createQuery(statement);
		
		query.setParameter("feed", feed);
		query.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
	
	public void removeSalesEvent() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String statement = "DELETE SalesEvent";
		Query query = em.createQuery(statement);
		
		query.executeUpdate();
		em.getTransaction().commit();
		em.close(); 
	}
	
	public List<SalesEvent> retrieveSmallSales2(double limit){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<SalesEvent> cq = cb.createQuery(SalesEvent.class);
		Root<SalesEvent> seroot = cq.from(SalesEvent.class);
		cq.select(seroot);
		cq.where(cb.lt(seroot.get(SalesEvent_.amount), limit));
		TypedQuery<SalesEvent> q = em.createQuery(cq);
		List<SalesEvent> result = q.getResultList();
		em.getTransaction().commit();
		em.close(); 
		return result;
	}
	
	public void addServiceFeed2(double feed) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<SalesEvent> cq = cb.createCriteriaUpdate(SalesEvent.class);
		Root<SalesEvent> seroot =  cq.from(SalesEvent.class);
		cq.set(SalesEvent_.amount, cb.sum(seroot.get(SalesEvent_.amount), feed));
		Query q = em.createQuery(cq);
		q.executeUpdate();
		em.getTransaction().commit();
		em.close(); 
	}
	
	public void removeSalesEvent2() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaDelete<SalesEvent> cq = cb.createCriteriaDelete(SalesEvent.class);
		Root<SalesEvent> seroot =  cq.from(SalesEvent.class);
		Query q = em.createQuery(cq);
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		
		
	}
}
