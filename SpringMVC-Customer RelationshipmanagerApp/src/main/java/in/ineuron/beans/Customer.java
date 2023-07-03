package in.ineuron.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="customer")
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;
	private String firstName;
	private String lastName;
	private String email;
	
	
}
