package com.barbaro.fmmvc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * protocolo: jdbc /Java
 * 
 * subprotocol: mysql
 * host: localhost
 * port: 3306
 * nombreBaseDatos: frase_matonas
 * 
 * url
 * ________________________________
 * jdbc:mysql://localhost:3306/frases_matonas
 */

public class DataBaseUtil {
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s?useUnicode=true" + 
			"&useJDBCCompliantTimezoneShift=true" + 
			"&useLegacyDatetimeCode=false" + 
			"&serverTimezone=UTC";
	public static Connection getConnection() {

		String dbms = "mysql";
		String host = "localhost";
		String port = "3306";
		String databaseName = "frases_matonas";

		String user = "root";
		String password = "root";
		String url = String.format(URL_FORMAT, dbms, host, port, databaseName);
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}
	
	public static void closeConnection(Connection conector) {
		try {
			conector.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
