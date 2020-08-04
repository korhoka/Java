package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-eclipselink");

	public void saveDevice(Device device) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        em.persist(device);
        
        em.getTransaction().commit();
        em.close();
	}
	
	public Device loadDevice(int deviceId) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Device emp = em.find(Device.class, deviceId);
		em.getTransaction().commit();
		em.close();
		
		return emp;
	}
	
	public boolean updateDeviceDescription(int id,
			String newDescription) {
		boolean emv;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Device emp1 = em.find(Device.class, id);
		//emp1.setDescription(newDescription);
		em.getTransaction().commit();
		Device emp2 = em.find(Device.class, id);
		em.close();
		if(emp1==emp2) {
			emv = true;
		}else {
			emv = false;
		}
		return emv;
	}
	
	public void removeDevice(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Device emp = em.find(Device.class, id);
		em.remove(emp);
		em.getTransaction().commit();
		em.close(); 
	}
	
}
