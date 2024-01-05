package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class SiriSimulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> palabrasClaves = new HashMap<>();
		
		rellenarPalabrasClaves(palabrasClaves);
		
		chatSiri(palabrasClaves);
		
	}
	public static void chatSiri(HashMap<String,String> palabrasClaves) {
		Scanner sc = new Scanner(System.in);
		boolean salir = true;
		
		System.out.println("Hola bienvenido dime en que puedo ayudarte!");
		while(salir) {
			String[] usuario = sc.nextLine().toLowerCase().split(" ");
			boolean hayClave = false;
			for(String palabra: usuario) {
				if(palabrasClaves.containsKey(palabra)) {
					System.out.println(palabrasClaves.get(palabra));
					if(palabra.equals("salir")) {
						salir=false;
					}
					hayClave = true;
					break;
				}
			}
			if(!hayClave) {
				System.err.println("No te entiendo");
			}
		}
	}
	
	public static void rellenarPalabrasClaves(HashMap<String,String> palabrasClaves) {
		palabrasClaves.put("cansado", "Estoy cansado jefe...");
		palabrasClaves.put("marico", "Marico el que lo lea");
		palabrasClaves.put("navidad", "Feliz Navidad a todos ustedes Jingle bell Jingle bell madafakar");
		palabrasClaves.put("lluvia", "lluvia, lluvia tus besos frios como la lluvia que poco a poco fueron enfriando...");
		palabrasClaves.put("pez", "Quisiera ser un peeez para tocar mi nariz con tu pecera y hacer burbujas de amor...");
		palabrasClaves.put("mañana", "Yo no se mañana si estaremos juntos o si se acaba el mundo");
		palabrasClaves.put("compa", "compae, venga un abrazo que esta noche el año termina...");
		palabrasClaves.put("salir", "Adios!");

	}

}
