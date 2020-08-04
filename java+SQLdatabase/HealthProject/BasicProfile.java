package entity;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public abstract class BasicProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int profileId;
	private int birthyear;
	private double weight;
	private double height;
	/*@JoinColumn
	@OneToOne(optional=false)
	@MapsId
	private Customer customer;*/
	
	/*public BasicProfile(int birthyear, double weight, double height) {
        //this.profileId = profileId;
        this.birthyear = birthyear;
        this.weight = weight;
        this.height = height;
        //this.customer = customer;
    }*/
	public int getProfileId() {
		return profileId;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setBirthYear(int year) {
		this.birthyear = year;
	}

    public BasicProfile() {
    }   

    @Override
	public String toString() {
		return "BasicProfile [profileId=" + profileId + ", birthyear=" + birthyear + ", weight=" + weight + ", height=" + height +  "]";
    } 
}