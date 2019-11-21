package com.barbaro.fmmvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.barbaro.fmmvc.DataBaseUtil;
import com.barbaro.fmmvc.db.DataBaseManager;
import com.barbaro.fmmvc.model.Phrase;

@WebServlet("/phrase")
public class PhraseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		DataBaseManager dbManager = null;
		List<Phrase> phrase = null;
		RequestDispatcher dispatpcher = null;
		
		connection = DataBaseUtil.getConnection();
		dbManager = new DataBaseManager(connection);
		
		phrase = dbManager.consultPhrases();
		
		// Sent to thw view (MVC)
		req.setAttribute("listPhrases", phrase);
		req.getRequestDispatcher("phrases.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		DataBaseManager dbManager = null;
		Phrase phrase = new Phrase();
		
		//Get Data
		String txtContent = req.getParameter("txtContent");
		String txtQuantity = req.getParameter("txtQuantity");
		String txtSinceDate = req.getParameter("txtSinceDate");
		
		//Model Data
		phrase.setContent(txtContent);
		phrase.setQuantity(Integer.parseInt(txtQuantity));
		phrase.setSinceDate(java.sql.Date.valueOf(txtSinceDate));
		//Save Data
		connection = DataBaseUtil.getConnection();
		dbManager = new DataBaseManager(connection);
		
		dbManager.createPhrase(phrase);
		DataBaseUtil.closeConnection(connection);
		doGet(req,resp);
	}
	
}
