package diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GeneracionyAlmacenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<Integer>> generador = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i=1;i<=10000;i++) {
			rellenarhashmap(generador, generarNums());
		}
		
		mostrarhashmap(generador);
	}
	public static int generarNums() {
		Random rd = new Random();
		int numAzar = rd.nextInt(1,11);
		return numAzar;
	}
	
	public static void rellenarhashmap(HashMap<Integer, ArrayList<Integer>> generador, int numAzar) {
		if(generador.containsKey(numAzar)) {
			ArrayList<Integer> listaNum = generador.get(numAzar);
			listaNum.add(numAzar);
			generador.put(numAzar, listaNum);
		} else {
			ArrayList<Integer> listaNum = new ArrayList<Integer>();
			listaNum.add(numAzar);
			generador.put(numAzar, listaNum);
		}
	}
	
	public static void mostrarhashmap(HashMap<Integer, ArrayList<Integer>> generador) {
		generador.forEach((clave,valor)->{
			System.out.println("El número "+clave+" salio "+valor.size()+" veces");
		});
	}

}
