package de.bredex.staff;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "zookeeper_id")
public class Zookeeper extends Staff {

	String compoundName;

	public Zookeeper() {
	}

}
