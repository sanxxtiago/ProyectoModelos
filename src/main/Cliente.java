package main;

import dataInput.Input;
import modulos.ProxyModulo;

public class Cliente {

	public static void main(String[] args) {
		
		ProxyModulo modulo = new ProxyModulo();
		Input in = new Input();
		System.out.println("Bienvenido al banco de artículos para personas damnificadas");
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Registrar artículos.");
		System.out.println("2. Distribuir mercados.");
		System.out.println("Ingresa una opción: ");
		int opc = in.getInt();
		
		modulo.UsarModulo(opc);
	}
	
}
