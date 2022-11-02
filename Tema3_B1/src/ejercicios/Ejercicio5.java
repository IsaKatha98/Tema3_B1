package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
		int num; //Variable introducida por el usuario.
		int contadorTotal=0;//Variable contador de los números introducidos por el usuario.
		int sumaPositivos=0;//Variable suma de los números positivos.
		int sumaNegativos=0;//Varibale suma de los números negativos, utilizada para hacer la media.
		int contadorNegativos=0;//Variable contador de los números negativos introducidos, utilizada para la media.
		double mediaNegativos=0;//Variable media de los números negativos.
		int contadorCeros=0;//Variable contador de los ceros introducidos.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
		
		//Instrucciones
			
		while (contadorTotal<10) {	//Aquí el bucle empezará contando la cantidad de veces que puede introducirse un número.
			
			
			System.out.print("Introduzca otro número y pulse Intro: "); //Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			num=sc.nextInt();
			
			if (num>0) {				//En esta condicional solo se aceptarán los números positivos.
				
				sumaPositivos+=num;		//En esta operación se van sumando los números introducidos.
				
			} else if (num==0) {		//En esta candicional solo aceptamos los ceros.
				
				contadorCeros++;		//Se contarán la cantidad de ceros introducidos
			
			} else if (num<0) {			//En esta condición solo se aceptan los números negativos.
				
				sumaNegativos+=num;		//Se suman los números negativos introducidos.
				contadorNegativos++;	//Se cuentan la cantidad de números negativos introducidos.
			}	
			
			contadorTotal++;
		}
		
			
		System.out.println("La suma de los números positivos introducidos es: "+sumaPositivos);
			
		mediaNegativos= (double) sumaNegativos/(double) contadorNegativos; 	//Se hace la media de los números negativos.
		
		System.out.println("La media de los números negativos es: "+mediaNegativos);
			
		System.out.println("La cantidad de 0 introducidos es: "+contadorCeros);
			
		//Por último, cerramos el escáner.
			
		sc.close();

	}

}
