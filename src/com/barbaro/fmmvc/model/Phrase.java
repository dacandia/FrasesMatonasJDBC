package com.barbaro.fmmvc.model;

import java.util.Date;

public class Phrase {
	private int idPhrase;
	private String content;
	private int quantity;
	private Date sinceDate;
	private Date date;

	Phrase(int idPhrase, String content, int quantity, Date sinceDate, Date date) {
		this.idPhrase = idPhrase;
		this.content = content;
		this.quantity = quantity;
		this.sinceDate = sinceDate;
		this.date = date;
	}

	public void setId(int idPhrase) {
		this.idPhrase = idPhrase;
	}

	public int getId() {
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

	public void setSinceDate(Date sinceDate) {
		this.sinceDate = sinceDate;
	}

	public Date getSinceDate() {
		return this.sinceDate;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

}
