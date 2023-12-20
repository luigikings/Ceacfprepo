package clases;

public class EjerciciosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer una funcion que reciba una array de tipo numerico, esa funcion tiene que recorrer
		 * todas las posiciones del array asignando a cada posicion el valor de la posicionç
		 * 
		 * Fuera de esta funcion hacer un bucle que imprima por pantalla posicion y el numero dentro de esta
		 */
		System.out.println("EJERCICIO 1:");
		System.out.println();

		//Declaramos la array vacia de 3 contenedores
		int[] arrayEjercicio1= new int [3];
		//Llamamos la funcion para que rellene la array
		Ejercicio1 (arrayEjercicio1);
		//Creamos un bucle para mostrar en cada posicion de la array su respectivo valor
		for(int i=0; i<arrayEjercicio1.length;i++) {
	
			System.out.println("El numero en la posicion: "+i+" es: "+arrayEjercicio1[i]);
		}
				
		// Declarar una array de 10 posiciones con numeros aleatorios dime cual es el valor MAX de ese array
		System.out.println("---------------------");
		System.out.println("EJERCICIO 2:");
		System.out.println();
				
		//Declaramos una variables rellena de 10 numeros aleatorios
		int[] arrayEjercicio2= {1,22,7,7,33,6,15,10,29,6};
		//Mostramos en pantalla el numero mas grande utilizando la funcion para sacarla
		System.out.println("El numero mas grande de la array es: "+Ejercicio2(arrayEjercicio2));
		
		
		//Declarar un array de 10 posiciones con numerosm aleatorios dime cual es la suma total de todos sus valores
		System.out.println("---------------------");
		System.out.println("EJERCICIO 3:");
		System.out.println();
		
		
		//Declaramos una variables rellena de 10 numeros aleatorios
		int[] arrayEjercicio3= {6,2,7,7,3,6,5,1,9,6};
		//Mostramos en pantalla la suma total sacada de la funcion
		System.out.println("La suma total de la array es: "+Ejercicio3(arrayEjercicio3));

	}
	
	//Funcion para rellenar una array con el valor segun su posicion: Posicion 0 = valor 1, posicion 1 = valor 2,posicion 2 = valor 3
	public static  void Ejercicio1 (int[] arrayEjercicio1) {
		for (int i=0;i<arrayEjercicio1.length;i++) {
				arrayEjercicio1[i]=i+1;
		}
	}
	
	//Funcion para guardar el numero mas grande dentro de la array, comparando posicion por posicion.
	public static int Ejercicio2 (int[] arrayEjercicio2) {
		//variable para guardar el numero de la posicion 0 de la array 
		int variable0 = arrayEjercicio2[0];
		for(int i=0;i<arrayEjercicio2.length;i++) {
			if (arrayEjercicio2[i]>variable0) {
				variable0=arrayEjercicio2[i];
			}
		}
		//Devuelve un int que es el numero mas grande
		return variable0;
	}
	
	//funcion para ir sumando posicion por posicion la array completa
	public static int Ejercicio3 (int[] arrayEjercicio3) {
		int suma1 = 0;
		for(int i=0;i<arrayEjercicio3.length;i++) {
			suma1 = suma1 + arrayEjercicio3[i];
		}
		//Devuelve un int que es la suma total
		return suma1;
	}

}
