package com.coderhouse;

public class Clase01 {
	public static void main(String[] args) {
		int capitalSolicitado = 12000;
		int interes = 5;
		int periodoEnMeses = 3;
		
		
		int interesAPagar = capitalSolicitado * interes * periodoEnMeses;
		
		
		
		int montoTotal = capitalSolicitado + interesAPagar;
		
		System.out.println("El monto total a pagar es: " + montoTotal);
	}
}
