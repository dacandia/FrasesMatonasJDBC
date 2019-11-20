package com.barbaro.fmmvc.model;

import java.util.Date;

public class Person {
	private int idPerson;
	private String name;
	private byte age;
	private String career;
	private Date date;

	Person(int idPerson, String name, byte age, String career, Date date) {
		this.idPerson = idPerson;
		this.name = name;
		this.age = age;
		this.career = career;
		this.date = date;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public int getIdPerson() {
		return this.idPerson;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getAge() {
		return this.age;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCareer() {
		return this.career;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}
}
