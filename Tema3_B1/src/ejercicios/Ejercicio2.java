package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	int num;
	int contador=0;
	
	/*Creamos un escáner para poder leer los datos que introduzca el usuario por
	la consola. */
				
	Scanner sc= new Scanner (System.in); 
	
	//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
	
		System.out.print("Introduzca un número (cuando quiera parar, introduzca un número negativo)  y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones
		
		while (num>=0) {
			
			contador++;
			
			System.out.print("Introduzca otro número y pulse Intro: ");
			num=sc.nextInt();
			
		}
		
		System.out.println("La cantidad de veces que ha introducido un número es: "+contador);
		
		//Por último, cerramos el escáner.
		
		sc.close();
			
		
	}

}
