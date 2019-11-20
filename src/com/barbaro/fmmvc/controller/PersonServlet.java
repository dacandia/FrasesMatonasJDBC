package com.barbaro.fmmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;

public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String txtName = req.getParameter("txtName");
		String txtAge = req.getParameter("txtAge");
		String txtCareer = req.getParameter("txtCareer");

		Connection connection = null;
	}
}
