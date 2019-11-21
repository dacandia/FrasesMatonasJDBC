package com.barbaro.fmmvc.test;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.barbaro.fmmvc.db.DataBaseManager;
import com.barbaro.fmmvc.DataBaseUtil;
import com.barbaro.fmmvc.model.Person;

public class TestReadPerson {
	@Test
	public void TestReadPerson() {
		Connection connection = DataBaseUtil.getConnection();
		DataBaseManager dbManager = new DataBaseManager(connection);
		List<Person> list = dbManager.consultPersons();
		assertNotNull("No se consultaron los datos",list);
		assertTrue("No hay Datos",list.size()>0);
		DataBaseUtil.closeConnection(connection);
		try {
			assertTrue("No se cerro la conexión",connection.isClosed());
		}catch(SQLException e) {
			e.getCause();
		}
	}
}
