package entity;

import javax.persistence.metamodel.*;

@StaticMetamodel(SalesEvent.class)

public class SalesEvent_{
	
	public static volatile SingularAttribute<SalesEvent, Integer> eventId;
	public static volatile SingularAttribute<SalesEvent, Double> amount;
	public static volatile SetAttribute<SalesEvent, Register> register;
}