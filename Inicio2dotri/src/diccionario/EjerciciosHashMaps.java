package diccionario;

import java.util.HashMap;

public class EjerciciosHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * EJERCICIO 1:
		 * 
		 */
		
		//generamos el HashMap donde guardaremos la palabra y su valor sera el numero de veces que aparece
		HashMap<String, Integer> contadorPalabras= new HashMap<String, Integer>();
		//Creamos un String que sera nuestro parrafo 
		String txt = "HOLA HOLA HOLA HOLA HOLA HOLA HOLA QUE QUE TAL QUE TAL";
		//y creamos un array de string y utilizando el .split separaremos el texto en palabras
		String[] palabra = txt.split(" ");
		
		
		
		//en un bucle recorremos las palabras del array
		rellenarhashmap(palabra, contadorPalabras);
			
		
		//y finalmente mostramos el Mapeado mostrando su valor que significa la cantidad de veces que aparece
		mostrarhashmap(contadorPalabras);
		System.out.println(contadorPalabras);
		
	}
	public static void rellenarhashmap(String[] palabra,HashMap<String, Integer> contadorPalabras) {
		for(int i =0;i<palabra.length;i++) {
			//verificamos que si la palabra recorrida esta dentro del hash entonces cogemos su valor y le sumamos 1 y se lo guardamos
			if(contadorPalabras.containsKey(palabra[i])) {
				contadorPalabras.put(palabra[i], contadorPalabras.get(palabra[i])+1);
				//en caso contrario significa que es la primera vez que aparece entonces la iniciamos con valor 1
			}else {
				contadorPalabras.put(palabra[i], 1);
			}
		}
	}
	
	public static void mostrarhashmap (HashMap<String, Integer> contadorPalabras) {
		contadorPalabras.forEach((clave,valor)->{
			System.out.println("la palabra "+clave+" se encuentra un total de "+valor+ " veces");
		});
	}

}
