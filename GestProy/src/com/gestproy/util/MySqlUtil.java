package com.gestproy.util;

import java.sql.*;

/**
 * Utilitario para crear conexión a base de datos MySQL
 * @author pc
 *
 */
public class MySqlUtil {
	/**
	 * Carga en Memoria el Driver de MySQL
	 */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//URL de conexión a schema de MySQL
	static final String URL_BD_MYSQL=
		"jdbc:mysql://localhost:3306/bd_daw1?user=root&password=mysql";
	

	/**
	 * Retorna una conexión de la Base de Datos MySQL
	 */
	public static Connection getConnection(){

		Connection connection=null;
		try {
			connection = DriverManager.getConnection(URL_BD_MYSQL);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
