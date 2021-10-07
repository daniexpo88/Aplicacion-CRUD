package com.funciones.insertar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Scanner;

import com.conexion.Conexion;
import com.persona.Persona;

public class Insertar {
	public static void insertar() {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		System.out.println("Introduce el id: ");
		int id = sc.nextInt();
		System.out.println("Introduce el nombre: ");
		String nombre = sc.next();
		System.out.println("Introduce el año de nacimiento: ");
		int agno = sc.nextInt();
		System.out.println("Introduce el mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el día de nacimiento: ");
		int dia = sc.nextInt();
	
		
		Persona p = new Persona(id, nombre, LocalDate.of(agno, mes, dia));
		String sql = "INSERT INTO `persona`(`id`, `nombre`, `fechaNac`) VALUES ("+
		p.getId()+",'"+p.getNombre()+"','"+p.getFechaNac()+"');";
		
		try {
			con = Conexion.conexion();
			ps = con.prepareStatement(sql);
			ps.execute();
			System.out.println("Inserción realizada");
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
