package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class Votacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> votacion  = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Coloca al usuario que quieres votar");
			String votoString = sc.nextLine();
			if(votacion.containsKey(votoString)) {
				votacion.put(votoString, votacion.get(votoString)+1);
			} else {
				votacion.put(votoString, 1);
			}
		}
		
		
		mostrarhashmap(votacion);
		
		
	}
	public static void mostrarhashmap(HashMap<String, Integer> generador) {
		int aux = 0;
		String candidato = "";
		for(String clave: generador.keySet()) {
			if(aux < generador.get(clave)) {
				aux = generador.get(clave);
				candidato = clave;
			}
		}
		System.out.println("El ganador de la votacion es: "+candidato+" con un total de "+aux+" votos");
	}

}
