package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class FiltroPalabrasMalsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> palabrasMalsonantes = new HashMap<String, Integer>();
		
		rellenarPalabras(palabrasMalsonantes);
		System.out.println(palabrasMalsonantes);
		
		hablarUsuario(palabrasMalsonantes);
	}
	
	public static void rellenarPalabras(HashMap<String, Integer> palabrasMalsonantes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rellena con palabras malsonantes separando con espacios por favor:");
		
		String[] usuario = sc.nextLine().toLowerCase().split(" ");
		for(String palabra: usuario) {
			palabrasMalsonantes.put(palabra, palabra.length());
		}
	}
	
	public static void hablarUsuario(HashMap<String, Integer> palabrasMalsonantes) {
		Scanner sc = new Scanner(System.in);
		boolean baneado= false;
		
		while(!baneado) {
			System.out.println("Introduzca una frase sin ser muy grosero por favor:");
			String[] usuario = sc.nextLine().toLowerCase().split(" ");
			int groserias=0;
			
			for(String palabra: usuario) {
				if(palabrasMalsonantes.containsKey(palabra)) {
					for(int i=palabrasMalsonantes.get(palabra);i>0;i--) {
						System.out.print("*");
					}
					System.out.print(" ");
					groserias++;
				} else {
					System.out.print(palabra+" ");
				}
			}
			System.out.println();
			
			if(groserias>=5) {
				baneado = true;
				System.out.println("GROSERO!");
			}
		}
	}
}
