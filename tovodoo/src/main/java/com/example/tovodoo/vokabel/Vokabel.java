package com.example.tovodoo.vokabel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vokabel {

	@Id
	@GeneratedValue
	private Long id;

	private String sprache;

	public String getSprache() {
		return sprache;
	}

	public void setSprache(String sprache) {
		this.sprache = sprache;
	}

	protected Vokabel() {
	}

	public Vokabel(String sprache) {
		this.sprache = sprache;
	}

	@Override
	public String toString() {
		return String.format("Vokabel[id=%d, sprache='%s']", id, sprache);
	}
}
