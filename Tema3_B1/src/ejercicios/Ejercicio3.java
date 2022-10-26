package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
		int num;
		int suma=0;
		int contador=0;
		double media;
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número (cuando quiera parar, introduzca un número negativo)  y pulse Intro: ");
		num=sc.nextInt();
			
		//Instrucciones
			
		while (num>=0) {
				
			suma+=num;
			contador++;
								
			System.out.print("Introduzca otro número y pulse Intro: ");
			num=sc.nextInt();
					
		}
			
		media= (double)suma/ (double) contador;
			
		System.out.println("La suma de los números introducidos es: "+suma);
			
		System.out.println("La cantidad de veces que ha introducido un número es: "+contador);
			
		System.out.println("Por lo tanto, la media es: "+media);
			
		//Por último, cerramos el escáner.
			
		sc.close();
	}

}
