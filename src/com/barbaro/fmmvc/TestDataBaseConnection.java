package com.barbaro.fmmvc;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.sql.Connection;

public class TestDataBaseConnection {
	@Test
	public void testConnection() {
		Connection connection = DataBaseUtil.getConnection();
		assertNotNull("No se realizo la conexión",connection);
		try {
			connection.close();
			assertTrue(connection.isClosed());
		}catch(Exception e) {
			
		}

	}
}
