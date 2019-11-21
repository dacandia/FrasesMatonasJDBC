package com.barbaro.fmmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.barbaro.fmmvc.DataBaseUtil;
import com.barbaro.fmmvc.db.DataBaseManager;
import com.barbaro.fmmvc.model.Person;

import java.sql.Connection;
import java.util.List;

@WebServlet("/persons")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		DataBaseManager dbManager = null;
		List<Person> persons = null;
		RequestDispatcher dispatcher = null;

		connection = DataBaseUtil.getConnection();
		dbManager = new DataBaseManager(connection);
		
		persons = dbManager.consultPersons();
		
		//Prepare data to sent to the view (MVC)
		req.setAttribute("listPersons", persons);
		//Charge the View
		req.getRequestDispatcher("persons.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		DataBaseManager dbManager = null;
		Person person = new Person();

		// Get data
		//
		String txtName = req.getParameter("txtName");
		String txtAge = req.getParameter("txtAge");
		String txtCareer = req.getParameter("txtCareer");

		// Validate data

		// Model data
		person.setName(txtName);
		person.setAge(Byte.parseByte(txtAge));
		person.setCareer(txtCareer);

		// Save Data
		connection = DataBaseUtil.getConnection();
		dbManager = new DataBaseManager(connection);
		
		dbManager.createPerson(person);
		DataBaseUtil.closeConnection(connection);
		doGet(req,resp);
	}
}
