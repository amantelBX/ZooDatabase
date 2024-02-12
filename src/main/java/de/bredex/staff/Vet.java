package de.bredex.staff;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "vet_id")
public class Vet extends Staff {

	public Vet() {
	}

}
