package diccionario;

import java.util.HashMap;

public class Ejercicio2hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				/*
				 * EJERCICIO 1:
				 * 
				 */
				
				//generamos el HashMap donde guardaremos la palabra y su valor sera el numero de veces que aparece
				HashMap<String, Integer> contadorPalabras= new HashMap<String, Integer>();
				//Creamos un String que sera nuestro parrafo 
				String txt = "HOLA HOLA HOLA HOLA HOLA HOLA HOLA QUE QUE TAL QUE TAL ay ay ay ay ay ay ay ay ay";
				//y creamos un array de string y utilizando el .split separaremos el texto en palabras
				String[] palabra = txt.split(" ");
				
				masde3char(palabra);
				
				rellenarhashmap(palabra, contadorPalabras);
					
				mostrarhashmap(contadorPalabras);
				System.out.println(contadorPalabras);
				
				palabraMasRepetida(contadorPalabras);

	}
	//en esta funcion pasamos la array de palabras separadas y el map y mapeamos cada palabra su valor que sera la cantidad de veces que aparece
	public static void rellenarhashmap(String[] palabra,HashMap<String, Integer> contadorPalabras) {
		for(int i =0;i<palabra.length;i++) {
			//verificamos que si la palabra recorrida esta dentro del hash entonces cogemos su valor y le sumamos 1 y se lo guardamos
			if(palabra[i]==null) {
				
			}else {
				if(contadorPalabras.containsKey(palabra[i])) {
					contadorPalabras.put(palabra[i], contadorPalabras.get(palabra[i])+1);
					//en caso contrario significa que es la primera vez que aparece entonces la iniciamos con valor 1
				}else {
					contadorPalabras.put(palabra[i], 1);
				}
			}
			
		}
	}
	//funcion para mostrar el mapeado y su valor
	public static void mostrarhashmap (HashMap<String, Integer> contadorPalabras) {
		contadorPalabras.forEach((clave,valor)->{
			System.out.println("la palabra "+clave+" se encuentra un total de "+valor+ " veces");
		});
	}
	
	//funcion para convertir en null las palabras que tengan menos de 3 caracteres
	public static void masde3char(String[] palabra) {
		for(int i=0;i<palabra.length;i++) {
			if(palabra[i].length()<3) {
				palabra[i]=null;
			}
		}
	}
	
	//funcion para buscar la palabra mas repetida del mapeado, es decir el que tenga el valor mas alto
	public static void palabraMasRepetida(HashMap<String, Integer> contadorPalabras) {
		//iniciamos un String y un contador a 0
		String palabrarepetida = null;
		int cont = 0;
		//en el bucle recorremos todo el mapa, la primera vez (cuando es 0) igualamos el cont y la palabra al primer recorrido y despues vamos comparando si el cont es menor que el que se recorre
		//en caso de que sea menor entonces guardar esa palabra y ese contador asi hasta que recorra todo
		for(String clave: contadorPalabras.keySet()) {
			if(cont ==0) {
				palabrarepetida = clave;
				cont = contadorPalabras.get(clave);
			}
			
			if(cont < contadorPalabras.get(clave)) {
				palabrarepetida = clave;
				cont = contadorPalabras.get(clave);
			}
		}
		System.out.println("La palabra "+palabrarepetida+" es la mas repetida con un total de "+cont+" veces");
	}

}
