package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
	int num;
	String mensaje;
	
	/*Creamos un escáner para poder leer los datos que introduzca el usuario por
	la consola. */
					
	Scanner sc= new Scanner (System.in); 
		
	//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
	System.out.print("Introduzca un número (cuando quiera parar, introduzca un número negativo)  y pulse Intro: ");
	num=sc.nextInt();
			
	//Instrucciones
			
	while (num!=0) {
				
		mensaje= num%2==0?"Es par.": "Es impar.";
				
		System.out.println(mensaje);
				
		System.out.print("Introduzca otro número y pulse Intro: ");
		num=sc.nextInt();
				
	}
			
	System.out.println("Chao, pescao.");
			
	//Por último, cerramos el escáner.
			
	sc.close();


	}

}
