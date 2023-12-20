package clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordleDavid {

	public static void main(String[] args) {
		//Lamamos a una funcion que genera la palabra a adivinar
		String palabraAAdivinar = generarPalabra();
		//Variable condicional que nos indica cuando debemos dejar de jugar, comienza en false porque queremos jugar.
		boolean finalizaJuego = false;
		//generamos el tablero de juego que corrresponde a una matriz con
		//numero de filas [i] = los 6 intentos que se le permiten a un jugador
		//numero de columnas [j] = numero de letras que tenga la palabra que debemos averiguar, por eso no es un numero fijo.
		char matriz[][] = new char[6][palabraAAdivinar.length()];
		
		System.out.println("Vamos a jugar al WORDLE, preparate para adivinar la palabra");
		
		//Funcion que toma el tablero de juego y lo devuelve con _ para saber el numero de l etras que tiene la palabra a adivinar
		matriz = iniciaPantalla(matriz);
		//Funcionn generica que solamente muestra por pantalla el estado actual de nuestro tablero
		muestraPantalla(matriz);
		//iniciamos el numero de intento de 0 a 6
		int intentos = 0;
		//Bucle que se repite tantas veces como intentos tengamos o adivinemos la palabra
		while (finalizaJuego == false) {
			//enviamos el tablero la palabra a adivinarf y el intento por el que vamos, la funcion nos pedirá una palabra
			//y rellena el tablero con las letras acertadas
			matriz = jugar(matriz, palabraAAdivinar, intentos);
			//una vez jugado y rellenado el tablero se muestra para ver los aciertos
			muestraPantalla(matriz);
			//tras haber jugado sumamos el intento gastado
			intentos++;
			
			System.out.println(matriz[intentos - 1]);
			System.out.println(palabraAAdivinar.toCharArray());
			//Para ver si hemos terminado de jugar comprobamos si hemos gastado los 6 intentos
			if (intentos == 6) {
				finalizaJuego = true;
			}
			//Para ver si hemos terminado de jugar comprobamos si hemos acertado la palabra

			if (pruebaSiEsIgual(palabraAAdivinar, matriz, intentos - 1)) {
				System.out.println("Has ganado en: "+intentos+" intentos" );
				finalizaJuego = true;
			}
		}
	}
	
	private static boolean pruebaSiEsIgual(String palabraAAdivinar, char[][] matriz, int intentos) {
		//esta función recorre letra por letra el tablero de la fila en la que estemos y comprueba si corresponde cada una de las letras con la palabra adivinar.
		//variable condicional que iondica si alguna letra no ha sido acertada
		boolean esIgual = true;
		for (int j = 0; j < matriz[intentos].length; j++) {
			//Al comprobar letra por letra en cuanto encontramos que una letra del tablero no corresponde con la de adivinar entendemos que la palabra no es igual.
			if (matriz[intentos][j] != palabraAAdivinar.charAt(j)) {
				esIgual = false;
			}
		}
		return esIgual;
	}


	private static char[][] jugar(char[][] matriz, String palabraAAdivinar, int intentos) {
		Scanner sc = new Scanner(System.in);
		String palabraPropuesta = sc.nextLine();
		for (int j = 0; j < matriz[intentos].length; j++) {
			if (palabraPropuesta.charAt(j) == palabraAAdivinar.charAt(j)) {
				matriz[intentos][j] = palabraAAdivinar.charAt(j);
			}
		}

		return matriz;
	}

	private static void muestraPantalla(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

		}
	}

	private static char[][] iniciaPantalla(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = '_';
			}

		}
		return matriz;
	}

	private static String generarPalabra() {
		ArrayList<String> palabras = new ArrayList<String>();
		Random rand = new Random();

		palabras.add("amor");
		palabras.add("luz");
		palabras.add("esperanza");
		palabras.add("alegria");
		palabras.add("paz");
		palabras.add("amistad");
		palabras.add("libertad");
		palabras.add("felicidad");
		palabras.add("sueño");
		palabras.add("vida");
		palabras.add("corazón");
		palabras.add("estrella");
		palabras.add("cielo");
		palabras.add("mar");
		palabras.add("sol");
		palabras.add("luna");
		palabras.add("tierra");
		palabras.add("fuego");
		palabras.add("agua");
		palabras.add("viento");

		int numeroAleatorio = rand.nextInt(0, 19);

		return palabras.get(numeroAleatorio);
	}

}