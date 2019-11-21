package com.barbaro.fmmvc.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import com.barbaro.fmmvc.model.Person;
import com.barbaro.fmmvc.model.Phrase;

public class DataBaseManager {
	private Connection connection;

	public DataBaseManager() {

	}

	public DataBaseManager(Connection connection) {
		this.connection = connection;
	}

	public void createPerson(Person person) {
		String query = "INSERT INTO PERSON(NAME, AGE, CAREER) VALUES("+person.toString()+");";
		executeStatement(query);
	}

	public void createPhrase(Phrase phrase) {
		//String query = "INSERT INTO PHRASE VALUES("+phrase.toString()+");";
		//executeStatement(query);
		String query = "INSERT INTO PHRASE(CONTENT,QUANTITY,SINCEDATE) VALUES(?,?,?)";
		PreparedStatement stmnt = null;
		try {
			stmnt = connection.prepareStatement(query);
			stmnt.setString(1,phrase.getContent());
			stmnt.setInt(2, phrase.getQuantity());
			stmnt.setDate(3, (Date) phrase.getSinceDate());
			
			stmnt.executeUpdate();
		}catch(SQLException e) {
			e.getCause();
		}
		
	}

	public void createPhrasePerson(int idPerson, int idPhrase) {
		String query = "INSERT INTO PHRASE_PERSON VALUES("+idPerson+","+idPhrase+")";
		executeStatement(query);
	}

	public List<Person> consultPersons() {
		String query = "SELECT * FROM PERSON";
		Statement stmnt = null;
		ResultSet resultSet = null;
		List<Person> listPersons = null;
		
		try {
			stmnt = connection.createStatement();
			resultSet = stmnt.executeQuery(query);
			listPersons = new ArrayList<>();
			while(resultSet.next()) {
				//Creating Model
				Person person = new Person();
				
				//Adding values to model
				person.setIdPerson(resultSet.getInt("idPerson"));
				person.setName(resultSet.getString("name"));
				person.setAge(resultSet.getByte("age"));
				person.setCareer(resultSet.getString("career"));
				person.setDate(resultSet.getDate("date"));
				
				//Adding model to List
				listPersons.add(person);
			}
		}catch(SQLException e) {
			e.getCause();
		}
		return listPersons;
	}

	public List<Phrase> consultPhrases() {
		String query = "SELECT * FROM PHRASE";
		Statement stmnt = null;
		ResultSet resultSet = null;
		List<Phrase> listPhrases = null;
		try {
			stmnt = connection.createStatement();
			resultSet = stmnt.executeQuery(query);
			listPhrases = new ArrayList<>();
			while(resultSet.next()) {
				Phrase phrase = new Phrase();
				
				phrase.setId(resultSet.getInt("idPhrase"));
				phrase.setContent(resultSet.getString("content"));
				phrase.setQuantity(resultSet.getInt("quantity"));
				phrase.setSinceDate(resultSet.getDate("sinceDate"));
				phrase.setDate(resultSet.getDate("date"));
				
				listPhrases.add(phrase);
			}
		}catch(SQLException e) {
			e.getCause();
		}
		return listPhrases;
	}

	public List<Phrase> consultPhrasesPerson(int idPerson) {
		String query = "SELECT * FROM PERSON_PHRASE WHERE idPerson="+idPerson;
		Statement stmnt = null;
		ResultSet resultSet = null;
		List<Phrase> listPhrasesPerson = null;
		try {
			stmnt = connection.createStatement();
			resultSet = stmnt.executeQuery(query);
			listPhrasesPerson = new ArrayList<>();
			while(resultSet.next()) {
				Phrase phrase = new Phrase();
				
				phrase.setId(resultSet.getInt("idPhrase"));
				phrase.setContent(resultSet.getString("content"));
				phrase.setQuantity(resultSet.getInt("quantity"));
				phrase.setSinceDate(resultSet.getDate("sinceDate"));
				phrase.setDate(resultSet.getDate("date"));
				
				listPhrasesPerson.add(phrase);
			}
		}catch(SQLException e) {
			e.getCause();
		}
		return listPhrasesPerson;
	}
	
	private void executeStatement(String query) {
		Statement stmnt = null;
		try {
			stmnt = connection.createStatement();
			stmnt.executeUpdate(query);
		}catch(SQLException e) {
			e.getCause();
		}
	}
	//Consult Phrase, Phrase-Person
}
