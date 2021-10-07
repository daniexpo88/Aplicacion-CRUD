package com.menu;

import java.util.Scanner;

import com.funciones.actualizar.Actualizar;
import com.funciones.eliminar.Eliminar;
import com.funciones.insertar.Insertar;
import com.funciones.listar.Listar;

public class Menu {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		System.out.println("SELECCIONA UNA OPCIÓN");
		System.out.println("1. Insertar");
		System.out.println("2. Actualizar");
		System.out.println("3. Eliminar");
		System.out.println("4. Listar");
		System.out.println("5. Salir");
		eleccion = sc.nextInt();
		
		if(eleccion<=5) {
			switch(eleccion) {
			case 1:
				System.out.println("Has elegido insertar");
				Insertar.insertar();
				break;
			case 2:
				System.out.println("Has elegido actualizar");
				Actualizar.actualizar();
				break;
			case 3:
				System.out.println("Has elegido eliminar");
				Eliminar.eliminar();
				break;
			case 4:
				System.out.println("Has elegido listar");
				Listar.listar();
				break;
			case 5:
				System.out.println("Has salido");
				break;
			}
			
		}
		else {
			System.out.println("HAS INTRODUCIDO UNA OPCION NO VÁLIDA");
			menu();
		}
		sc.close();
		
	}
	
}
