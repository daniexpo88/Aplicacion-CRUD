package com.funciones.eliminar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.conexion.Conexion;

public class Eliminar {
	public static void eliminar() {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		System.out.println("Introduce el id de la Persona que quieres eliminar: ");
		int id = sc.nextInt();
		String sql = "DELETE from persona where id="+id;
		
		try {
			con = Conexion.conexion();
			ps = con.prepareStatement(sql);
			ps.execute(sql);
			System.out.println("Se ha eliminado correctamente");
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
