package clases;

public class Ejerciciosrrays {

	public static void main(String[] args) {
				/*
				 * Crea una funcion que pida un array y un String
				 * Devuelve el array que contenga SOLO los elementos del 1er array que sean diferentes al String del parámetro
				 */
				String[] arrayInicial = {"hola","hola123","Pedro","Juan","hola"};
				String textoComp = "hola123"; 
				arraystring(arrayInicial, textoComp);


				/*
				 * Crea una funcion que pida un aray del tipo que quieras y un 2do
				 * paramertro del mismo tipo no array
				 * Dime cuantos valores del 2do parametros hay en el array
				 */
				System.out.println("-----------------------");
				int[] arrayEntero = {1,7,3};
				int n1 = 7;
				arraycantidad(arrayEntero, n1);

				

				/*
				 * Crea una funcion que pida una array de numero decimales
				 * calcula la medio de esos valores
				 */
				System.out.println("-----------------------");
				double[] arrayDecimal = {10,6.5,7,9};
				System.out.println("La media de la array es: "+arraysmedia(arrayDecimal));
				
				
				
	}
	public static String[] arraystring (String[] arraystrings, String txt) {
		System.out.println("Esta es la array sin: ("+txt+"):");
		String[] arrayFinal = new String[arraystrings.length];
		//Contador para poder colocar siempre primero los textos distintos y despues los vacios (null)
		int cont=0;
		for (int i=0;i<=arraystrings.length-1;i++) {
			if (!arraystrings[i].equals(txt)) {
				arrayFinal[cont] = arraystrings[i];
				cont++;
			}
		}
		for (int i=0;i<=arrayFinal.length-1;i++) {
			System.out.println(arrayFinal[i]);
		}
		return arrayFinal;

	}
	
	public static int[] arraycantidad (int[] arrayn1,int b) {
		System.out.println("Esta es la array solo con los numeros: ("+b+"):");
		int[] arrayenterofinal = new int[arrayn1.length];
		//Contador para poder sacar todos los nyumeros iguales de la array y depues dejar lo demas vacios
		int cont=0;
		for (int i=0;i<=arrayn1.length-1;i++) {
			if (arrayn1[i] == (b)) {
				arrayenterofinal[cont] = arrayn1[i];
				cont++;
			}
		}
		for (int i=0;i<=arrayenterofinal.length-1;i++) {
			System.out.println(arrayenterofinal[i]);
		}
		return arrayenterofinal;
	}
	
	public static double arraysmedia (double[] doublearrays) {
		double suma = 0;
		for (int i = 0; i<doublearrays.length;i++) {
			suma = suma + doublearrays[i];
		}
		double media = suma / doublearrays.length;
		return media;
	}
}
