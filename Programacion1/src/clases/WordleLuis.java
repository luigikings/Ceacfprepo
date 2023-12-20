package clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordleLuis {

	public static void main(String[] args) {
		ArrayList<Character> palabraAJugar = new ArrayList<Character>();
		palabraAJugar = generarPalabra();
		
		ArrayList<Character> palabraAdivinando = new ArrayList<Character>();
		palabraAdivinando = vaciarPalabra(palabraAJugar);
		
		mostrarPalabraAdivinando(palabraAdivinando);
		
		palabraAdivinando = jugarWordle(palabraAdivinando, palabraAJugar);

	}
	public static ArrayList<Character> generarPalabra() {
		ArrayList<String> palabras = new ArrayList<String>();
		ArrayList<Character> palabraAJugar = new ArrayList<Character>();
		
		Random rd = new Random();

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
		palabras.add("corazon");
		palabras.add("estrella");
		palabras.add("cielo");
		palabras.add("mar");
		palabras.add("sol");
		palabras.add("luna");
		palabras.add("tierra");
		palabras.add("fuego");
		palabras.add("agua");
		palabras.add("viento");

		int numeroAleatorio = rd.nextInt(0, palabras.size());
		
		for(int i=0;i<palabras.get(numeroAleatorio).length();i++) {
			palabraAJugar.add(palabras.get(numeroAleatorio).charAt(i));
		}
		System.out.println(palabraAJugar);

		return palabraAJugar;
	}
	
	public static ArrayList<Character> vaciarPalabra(ArrayList<Character> palabraAJugar) {
		ArrayList<Character> palabraAdivinando = new ArrayList<Character>();
		
		for(int i=0; i<palabraAJugar.size();i++) {
			palabraAdivinando.add('_');
		}
		System.out.println(palabraAdivinando);
		return palabraAdivinando;
	}
	
	public static void mostrarPalabraAdivinando(ArrayList<Character> palabraAdivinando) {
		System.out.println("PALABRA A ADIVINAR");
		for(int i = 0;i<palabraAdivinando.size();i++) {
			System.out.print(palabraAdivinando.get(i)+" ");
		}
	}
	
	public static ArrayList<Character> jugarWordle(ArrayList<Character> palabraAdivinando,ArrayList<Character> palabraAJugar){
		Scanner sc = new Scanner(System.in);
		String usuario = "";
		
		do {
			System.out.println("Introduce la palabra a jugar");
			usuario = sc.nextLine();
			if(usuario.length()==palabraAdivinando.size()) {
				break;
			}
			
			
			System.err.println("INTRODUCE EL MISMO NUMERO DE LETRAS QUE MUESTRAN MAMAGUEBO!");
		} while (true);
		
		
		ArrayList<Character> usuarioIntento = new ArrayList<Character>();
		for(int i = 0;i<usuario.length();i++) {
			usuarioIntento.add(usuario.charAt(i));
		}
		
		for(int i = 0;i<palabraAJugar.size();i++) {
			if(palabraAJugar.get(i).equals(usuarioIntento.get(i))) {
				palabraAdivinando.set(i, palabraAJugar.get(i));
			} else if(palabraAJugar.contains(usuarioIntento.get(i))) {

			} else {

			}
			
			System.out.print(palabraAdivinando.get(i)+" ");
		}
		System.out.println();
		
		for(int i = 0;i<palabraAJugar.size();i++) {
			if(palabraAJugar.get(i).equals(usuarioIntento.get(i))) {
			} else if(palabraAJugar.contains(usuarioIntento.get(i))) {
				System.out.print(usuarioIntento.get(i)+" Esta en la palabra pero no en la posicio ");
				System.out.println();
			} else {
				System.err.print(usuarioIntento.get(i)+" No esta en la palabra ");
				System.out.println();
			}
		}
		
		
		
		return palabraAJugar;
	}

}
