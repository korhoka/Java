package entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends BasicProfile{
	
	//@Id 
	//private  custId;
	private String firstName;
	private String lastName;
	
	
	
	public Customer(String firstName, String lastName){
       // this.custId = custId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String lname) {
		this.lastName = lname;
	}

    public Customer() {
    }   

    @Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
    } 
}