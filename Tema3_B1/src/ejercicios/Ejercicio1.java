package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	//Declaramos variables
		
	int num;
	int suma=0;
		
	/*Creamos un escáner para poder leer los datos que introduzca el usuario por
	la consola. */
					
	Scanner sc= new Scanner (System.in); 
		
	//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
	System.out.print("Introduzca un número (cuando quiera parar, introduzca un número negativo)  y pulse Intro: ");
	num=sc.nextInt();
			
	/*Instrucciones, primero establecemos el bucle, estableciendo como condición inicial que el número introducido por el
	 * usuario sea mayor o igual que 0. Dentro del bucle, iremos sumando cada número que se añada.*/
			
	while (num>=0) {
				
		suma+=num;
		
								
		System.out.print("Introduzca otro número y pulse Intro: ");
		num=sc.nextInt();
					
	}
				
	System.out.println("La suma de los números introducidos es: "+suma);
			
	//Por último, cerramos el escáner.
			
	sc.close();

	}

}
