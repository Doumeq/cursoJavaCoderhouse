package com.coderhouse;

public class Clase2 {

	public static void main(String[] args) {

		// Condicional IF
		/*
		 * int numeroA = 1; int numeroB = 2;
		 * 
		 * 
		 * if(numeroA > numeroB){ //si se ejectura esta condicion, entra al bloque de
		 * abajo System.out.println("el numeroA es mayor que numeroB"); } else { //si no
		 * se cumple la condicion anterior, entra al siguiente bloque
		 * System.out.println("el numeroA es menor que numeroB"); }
		 */

		// Calculadora
		/*
		 * int numero1 = 1; int numero2 = 2; float resultado = numero1 + numero2;
		 * 
		 * if(numero2 != 0) { System.out.println("El resultado es: " + resultado); }
		 * else { System.out.println("No se puede dividir por 0"); }
		 */

		// condicionales con else if
		/*
		 * int ingreseNumero = 0;
		 * 
		 * if(ingreseNumero > 0) {
		 * System.out.println("el numero ingresado es positivo"); } else
		 * if(ingreseNumero < 0) {
		 * System.out.println("el numero ingresado es negativo"); } else
		 * if(ingreseNumero == 0){ System.out.println("el numero ingresado es cero"); }
		 * else { System.out.println("el dato ingresado no es un numero"); }
		 */

		// dias de la semana por el numero con if y else
		/*
		 * int diaDeLaSemana = 1;
		 * 
		 * if(diaDeLaSemana == 1) { System.out.println("el dia de la semana es Lunes");
		 * } else if(diaDeLaSemana == 2) {
		 * System.out.println("el dia de la semana es Martes"); } else if(diaDeLaSemana
		 * == 3){ System.out.println("el dia de la semana es Miercoles"); } else
		 * if(diaDeLaSemana == 4){ System.out.println("el dia de la semana es Jueves");
		 * } else if(diaDeLaSemana == 5){
		 * System.out.println("el dia de la semana es Viernes"); } else if(diaDeLaSemana
		 * == 6){ System.out.println("el dia de la semana es Sabado"); } else
		 * if(diaDeLaSemana == 7){ System.out.println("el dia de la semana es Domingo");
		 * } else { System.out.println("el valor no es correcto"); }
		 */

		// dias de la semana por el numero con switch
		/*
		 * int diaDeLaSemana = 1; String nombreDelDia; // almacena el nombre del dia
		 * dependiendo del numero que coloques
		 * 
		 * switch (diaDeLaSemana) { case 1: nombreDelDia = "Lunes"; break; case 2:
		 * nombreDelDia = "Martes"; break; case 3: nombreDelDia = "Miercoles"; break;
		 * case 4: nombreDelDia = "Jueves"; break; case 5: nombreDelDia = "Viernes";
		 * break; case 6: nombreDelDia = "Sabado"; break; case 7: nombreDelDia =
		 * "Domingo"; break; default: nombreDelDia = "Dia Invalido"; break; }
		 */

		// dias de la semana por nombre con switch
		/*
		String dia = "Lunes";

		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
		default:
			System.out.println("Dia invalido o no lo escribio bien, puso: " + dia);
			break;
		}
		*/
		
		//operador ternario "?"
		/*
		int numeroA = 10;
		int numeroB = 2;
		
		boolean condicion = numeroA < numeroB; //o true o false
		boolean resultado = condicion ? true : false;
		System.out.println("la condicion es " + resultado);
		
		String mensaje = (numeroA < numeroB)? "mensaje true" : "mensaje false";
		System.out.println(mensaje);
		*/
		
		//Numero Aleatorios
		/*
		double random = 0.0d;
		
		random = Math.random();
		
		System.out.println("El numero generado es: " + random);
		*/
		
		int minimo = 1;
		int maximo = 100;
		
		int rango = maximo - minimo + 1;
		
		int random = 0;
		
		random = (int) (Math.random() * rango) + minimo;
		System.out.println("El numero generado es: " + random);
		}

}
