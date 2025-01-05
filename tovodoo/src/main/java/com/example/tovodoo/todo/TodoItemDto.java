package com.example.tovodoo.todo;

import java.util.List;

import com.example.tovodoo.vokabel.VokabelDto;

public class TodoItemDto {

	private List<VokabelDto> vokabeln;

	public List<VokabelDto> getVokabeln() {
		return vokabeln;
	}

	public void setVokabeln(List<VokabelDto> vokabeln) {
		this.vokabeln = vokabeln;
	}
}
