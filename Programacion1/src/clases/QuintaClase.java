package clases;

public class QuintaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esto de aca se llama paso por valor
		int x1 = 5;
		x1 = pasoPorValor(x1);
		System.out.println(x1); // Como podemos observar, si le ponemos la funcion return, y utlizamos el valor
										// dado, nos dara la variable modificada

		System.out.println("---------------------");

		//Esto de aca se llama paso por referencia

		String txt1 = "El numero es:";
		pasoPorReferencia(txt1);
		System.out.println("El valor de txt1: " + txt1);

		System.out.println("---------------------");

		// Un Array es un objeto nuevo, que sirve para almacenar datos, mas no
		// combinaciones de tipos de datos
		// Tiene un tamaño definido, pero se puede declarar su tamaño, en los Array se
		// utilizan los corchetes []
		// Se pueden contar las posiciones del Array, como el String
		// Para declarar uno, se pone primero el tipo de dato, despues los corchetes, y
		// despues el nombre con su respectiva variable indicando los espacios que
		// nesesitaremos

		int[] arrayInt = new int[5]; // Para saber la posicion de un objeto se utiliza la funcion arrayInt[3]
		int[] arrayInt1 = { 5, 6, 7, 8 }; // Esto es para declarar un variable ya rellenada

		int[] arrayEnteros = new int[5];
		int[] arrayEnteros1 = { 1, 2, 3, 4 };
		System.out.println(arrayEnteros[1]); // Aqui pedimos que se nos imprima un objeto dentro del array
		System.out.println(arrayEnteros1[3]);// Aqui pdimos un valor del array ya rellenado

		arrayEnteros1[3] = 1; // Esta funcio se pone para cambiar un valor con su posicion, de 4 a 1
		System.out.println(arrayEnteros1[3]);// Como se puede observar el valo cambia
				
		System.out.println("---------------------");

		System.out.println(arrayEnteros.length);// Se utiliza para saber el numero de espacios que tiene nuestro array
		System.out.println(arrayEnteros1.length);

		System.out.println("---------------------");

		System.out.println(arrayEnteros[1]);// Array con posicion original
		pasoPorReferenciaArray(arrayEnteros);
		System.out.println(arrayEnteros[1]);// Array con posicion actualizada despues de utilizar la funcion

		System.out.println("---------------------");
		System.out.println("EJERCICIO 1:");
		System.out.println();

		int[] arrayEjercicio1= new int [3];
		Ejercicio1 (arrayEjercicio1);
		for(int i=0; i<arrayEjercicio1.length;i++) {
	
			System.out.println("El numero en la posicion: "+i+" es: "+arrayEjercicio1[i]);
		}
				
		System.out.println("---------------------");
		System.out.println("EJERCICIO 2:");
		System.out.println();
				
		int[] arrayEjercicio2= {1,22,7,7,33,6,15,10,29,6};
		System.out.println("El numero mas grande de la array es: "+Ejercicio2(arrayEjercicio2));
		
		System.out.println("---------------------");
		System.out.println("EJERCICIO 3:");
		System.out.println();
		
		int[] arrayEjercicio3= {6,2,7,7,3,6,5,1,9,6};
		System.out.println("La suma total de la array es: "+Ejercicio3(arrayEjercicio3));
				
	}

	public static int pasoPorValor(int x) {// Es una nueva version de la variable
		System.out.println("El valor de x: " + x);
		x++; // Una forma de ordenar la obtencion de nuevos valores modificados, habria que
						// seguir esta estructura
		System.out.println("El valor de x: " + x);
		return x;

	}

	// El String es el unico objeto que se pasa por Valor, no por referencia
	public static void pasoPorReferencia(String txt) {
		System.out.println("El valor de txt: El numero es: " + txt);
		txt += "5";
		System.out.println("El valor de txt: El numero es: " + txt);
	}

	public static void pasoPorReferenciaArray(int[] aux) { // Esta funcion es utilizada para cambiar el valor interno de un Array													
		aux[1] = 1000; //Como se puede observar, a diferencia del Srting, con el Array utilizamos el paso por referencia
	}

	//Hacer un funcion que reciba un array de tipo numerico
	//Esa funcion tiene que recorrer todas las posiciones del array
	//asignado a cada posicion el valor de la posicion
	//
	//Fuera de esa funcion hacer un bucle para imprimir los datos 
	//-> en la posicion X esta el valor Y 
			
	public static  void Ejercicio1 (int[] arrayEjercicio1) {
		for (int i=0;i<arrayEjercicio1.length;i++) {
				arrayEjercicio1[i]=i+1;
		}
	}
			
	//Declara un array de 10 posiciones con numeros aleatorios 
	//Dime cual es el valor max de ese array 
			
	public static int Ejercicio2 (int[] arrayEjercicio2) {
		int variable0 = arrayEjercicio2[0];
		for(int i=0;i<arrayEjercicio2.length;i++) {
			if (arrayEjercicio2[i]>variable0) {
				variable0=arrayEjercicio2[i];
			}
		}
		return variable0;
	}
	
	public static int Ejercicio3 (int[] arrayEjercicio3) {
		int suma1 = 0;
		for(int i=0;i<arrayEjercicio3.length;i++) {
			suma1 = suma1 + arrayEjercicio3[i];
		}
		return suma1;
	}
}

