package com.barbaro.fmmvc.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PhraseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String txtContent = req.getParameter("txtContent");
		String txtQuantity = req.getParameter("txtQuantity");
		String txtSinceDate = req.getParameter("txtSinceDate");

		Connection connection = null;
	}
}
