package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public static Connection conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pass = "";
		
		try {
			con = DriverManager.getConnection(url, user, pass);
			if(con != null) {
				System.out.println("Conectado a la BBDD");
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		return con;
	}
}
