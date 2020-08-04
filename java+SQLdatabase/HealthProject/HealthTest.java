package application;

import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.*;

public class HealthTest {

    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-eclipselink2");
    	
    	Dao dao = new Dao();
    	EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Customer c1 = new Customer();
		c1.setBirthYear(1889);
		c1.setHeight(179.3);
		c1.setWeight(89.40);
		c1.setFirstName("Julia");
		c1.setLastName("Keisari");
		em.persist(c1);
		em.getTransaction().commit();
		em.close();
    	
    	
    	/*dao.saveBasicProfile(b1);
    	dao.saveBasicProfile(b2);
    	dao.saveBasicProfile(b3);*/
    	
    	/*BasicProfile b1 = new BasicProfile(1851, 100.00, 187.6);
     	BasicProfile b2 = new BasicProfile(1891, 80.00, 175.4);
     	BasicProfile b3 = new BasicProfile(1991, 70.00, 165.2);*/
     	
        
    	
    	
     
       
        
    	
    	
    	
    

    	
    }
}