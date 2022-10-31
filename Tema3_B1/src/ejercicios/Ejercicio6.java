package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		//Declaramos variables
		
		int numEdad; //Variable introducida por el usuario, la edad del alumnado.
		int contadorAlumnos=0;//Variable contador de los números introducidos por el usuario, total de alumnos.
		int sumaEdad=0;//Variable suma de los números positivos, variable necesaria para la media de edad.
		double mediaEdad=0;//Variable media de las edades.
		int contadorMayoresEdad=0;//Variable contador de los y las alumnas mayores de edad.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
							
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca la edad de un/a alumno/a y pulse Intro: ");
		numEdad=sc.nextInt();
				
		//Instrucciones. Primero, establecemos la condición inicial. En este caso será, que los números introducidos deben ser mayor que 0.
		
		while (numEdad>0) {
			
			sumaEdad+=numEdad;		//Establecemos que las edades introducidas se vayan sumando.
			contadorAlumnos++;			//Establecemos que se sume una unidad al contador cada vez que se repita el bucle.
			
			if (numEdad>=18) {		//Declaramos la condición para la variable de los mayores de edad.
			
				contadorMayoresEdad++;		//Hacemos que se añada una unidad a la variable contador.
				
			}
			
			System.out.print("Introduzca la edad de un/a alumno/a y pulse Intro: ");
			numEdad=sc.nextInt();

		}
			
		mediaEdad= (double) sumaEdad/ (double) contadorAlumnos;	//Hacemos la media una vez terminado el bucle.
		
		//Imprimos los resultados.
		
		System.out.println("La suma de las edades introducidas es: "+ sumaEdad+" años.");
		
		System.out.println("La media de la edad del alumnado es de: "+mediaEdad+" años.");
		
		System.out.println("En el centro hay: "+contadorAlumnos+" alumnos/as.");
		
		System.out.println("En el centro hay: "+contadorMayoresEdad+" alumnos/as mayores de edad.");

	}

}
