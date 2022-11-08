
package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
	//Declaramos las variables
		
	int random;//Variable 
	int respuesta;
		
	//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola.
									
	Scanner sc= new Scanner (System.in); 
	
	//Instrucciones. Primero generamos un número aleatorio.
	
	random= (int) Math.random()*100;
	
	//Pedimos la usuario que introduzca un número. Guardamos ese dato.
	
	System.out.println("Intente adivinar aleatorio entre 1 y 100. Introduzca -1 si quiere cerrar el juego: ");
	respuesta= sc.nextInt();
	
	while (respuesta!=-1) {			//Expresamos la condición en la que la respuesta debe estar entre 1 y 100 para ser válida.
	
		if (respuesta==random) {
			
			System.out.println("Muy bien, ha ganado.");
		
		} else if (respuesta<random) {
		
			System.out.print("El número secreto es mayor que "+respuesta+". Pruebe otra vez: ");
			respuesta=sc.nextInt();
		
		} else {
			
			System.out.print("El número secreto es menor que "+respuesta+". Pruebe otra vez: ");
			respuesta=sc.nextInt();
		
		}
	
	//System.out.println("");
	
		
	}
	
	}

}
