package application;

import entity.*;
import dao.*;
import java.util.List;

public class KassaApp {

	
	public static void initDB(Dao dao) {
		final int NUM_REGISTERS = 5;
		final int NUM_EVENTS = 10;
		// initialize registers
		for (int i = 1; i<=NUM_REGISTERS; i++) {
			Register reg = new Register(i, "Kassapiste_" + i);
			dao.addRegister(reg);
		}
		// initialize events
		for (int i = 1; i<=NUM_EVENTS; i++) {
			int regnum = (int)(Math.random()*NUM_REGISTERS)+1;
			// amount between 1.00 - 99.99
			double amount = (int)(100+Math.random()*9900)/100.0;
			dao.addEvent(i, regnum, amount);			
		}
	}
	
    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
    	initDB(dao);
 
    	//  exercise 1a
    	
    	List<SalesEvent> result = dao.retrieveSmallSales(50.0);
    	if (result!=null) {
    		for (SalesEvent s : result) {
    			System.out.println("Event: " + s.getEventId() + ", Amount: " + s.getAmount() + " at register " + s.getRegister().getRegisterId() + ", Name: " + s.getRegister().getName());
    		}
    	}
    	
    	
    	// exercise 1b
    	
    	dao.addServiceFeed(23.50);
    	
    	// exercise 1c
    	dao.removeSalesEvent();
    	
    	// exercise 2
    	List<SalesEvent> result = dao.retrieveSmallSales2(50.0);
    	if (result!=null) {
    		for (SalesEvent s : result) {
    			System.out.println("Event: " + s.getEventId() + ", Amount: " + s.getAmount() + " at register " + s.getRegister().getRegisterId() + ", Name: " + s.getRegister().getName());
    
    
    		}
    	
    	
    	}
    	//dao.addServiceFeed2(24.50);
    	dao.removeSalesEvent2();
    }
}

