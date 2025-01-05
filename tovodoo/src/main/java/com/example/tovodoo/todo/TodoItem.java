package com.example.tovodoo.todo;

import java.util.List;

import com.example.tovodoo.vokabel.Vokabel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoItem {

	@Id
	@GeneratedValue
	private Long id;

	private List<Vokabel> vokabeln;

	public List<Vokabel> getVokabeln() {
		return vokabeln;
	}

	public void setVokabeln(List<Vokabel> vokabeln) {
		this.vokabeln = vokabeln;
	}
}
