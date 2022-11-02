package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		//Declaramos variables
		
		double altura; //Variable introducida por el usuario, la altura de los árboles en cm.
		double maxAltura=0;//Variable media de las edades.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
							
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca la altura en cm de un árbol e introduzca -1 cuando desee parar: ");
		altura=sc.nextInt();
		
		//Instrucciones
		
		while (altura!=-1) {
			
			if(altura>maxAltura) {
				
				maxAltura=altura;
			}
			
			System.out.print("Introduzca la altura en cm de un árbol e introduzca -1 cuando desee parar: ");
			altura=sc.nextInt();
		}
		
		System.out.println("Ha cerrado el programa.");
		System.out.println("El árbol más alto mide "+maxAltura+" cm" );

	}

}
