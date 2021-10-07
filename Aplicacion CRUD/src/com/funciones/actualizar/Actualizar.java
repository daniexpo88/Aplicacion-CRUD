package com.funciones.actualizar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Scanner;

import com.conexion.Conexion;
import com.persona.Persona;

public class Actualizar {
	public static void actualizar() {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		System.out.println("Introduce el id de la Persona que quieres actualizar: ");
		int id = sc.nextInt();
		System.out.println("Introduce el nuevo nombre: ");
		String nombre = sc.next();
		System.out.println("Introduce el nuevo año de nacimiento: ");
		int agno = sc.nextInt();
		System.out.println("Introduce el nuevo mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el nuevo día de nacimiento: ");
		int dia = sc.nextInt();
	
		
		Persona p = new Persona(id, nombre, LocalDate.of(agno, mes, dia));
		String sql = "UPDATE `persona` SET `nombre`='"+p.getNombre()+"',`fechaNac`='"+p.getFechaNac()+"' WHERE `id`= "+p.getId()+";";
		
		try {
			con = Conexion.conexion();
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Actualización realizada");
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
