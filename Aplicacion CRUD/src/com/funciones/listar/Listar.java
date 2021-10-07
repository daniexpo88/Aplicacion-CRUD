package com.funciones.listar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.conexion.Conexion;
import com.persona.Persona;

public class Listar {
	public static void listar() {
		Connection con = null;
		Statement s = null;
		ResultSet rs = null;
		List<Persona> lista = new ArrayList<Persona>();
		System.out.println("LISTA PERSONA");
		try {
			con = Conexion.conexion();
			s = con.createStatement();
			rs = s.executeQuery("Select * from persona");
			while(rs.next()) {
				Persona p = new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setFechaNac(rs.getDate(3).toLocalDate());
				lista.add(p);
			}
			s.close();
			rs.close();
			con.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(Persona p: lista) {
			System.out.println(p.toString());
		}
		
	}
}
