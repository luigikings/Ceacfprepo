package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> traductor = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		PalabrasTraductor(traductor);
		
		System.out.println("Introduce una frase a traducir");
		String[] frase = sc.nextLine().split(" ");

		traduccion(traductor, frase);
		
		
		
		
		
		
	}
	public static void PalabrasTraductor(HashMap<String, String> traductor) {
		traductor.put("hola", "hello");
		traductor.put("buenos", "good");
		traductor.put("dias", "days");
		traductor.put("si", "yes");
		traductor.put("no", "nope");
		traductor.put("comer", "eat");
	}

	public static void traduccion(HashMap<String, String> traductor,String[] frase) {
		
		for(String palabra: frase) {
			if(traductor.containsKey(palabra)) {
				System.out.print(traductor.get(palabra)+" ");
			} else {
				System.err.print(palabra+" ");
			}
		}
	}
}
