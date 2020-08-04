
package entity;

import javax.persistence.*;

@Entity
@Table(name="DEVICE")
public class Device {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="deviceId", nullable=false)
    private int deviceId;
	
	@Column(name="description")
    private String description;

    public Device(String description) {
      
        this.description = description;
    }

    public Device() {
    }   
    
	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", description=" + description + "]";
	} 
}

