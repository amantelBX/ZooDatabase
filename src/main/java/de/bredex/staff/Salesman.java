package de.bredex.staff;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "salesman_id")
public class Salesman extends Staff {

	public Salesman() {
	}

}
