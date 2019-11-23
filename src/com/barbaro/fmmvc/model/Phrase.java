package com.barbaro.fmmvc.model;

import java.util.Date;

public class Phrase {
	private int idPhrase;
	private String content;
	private int quantity;
	private java.sql.Date sinceDate;
	private Date date;

	public Phrase() {

	}

	public Phrase(int idPhrase, String content, int quantity, java.sql.Date sinceDate, Date date) {
		this.idPhrase = idPhrase;
		this.content = content;
		this.quantity = quantity;
		this.sinceDate = sinceDate;
		this.date = date;
	}

	public void setIdPhrase(int idPhrase) {
		this.idPhrase = idPhrase;
	}

	public int getIdPhrase() {
		return this.idPhrase;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setSinceDate(java.sql.Date sinceDate) {
		this.sinceDate = sinceDate;
	}

	public java.util.Date getSinceDate() {
		return this.sinceDate;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("'%s',%d,'%s'", this.content, this.quantity, this.sinceDate);
	}

}
