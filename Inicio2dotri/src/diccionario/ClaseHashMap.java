package diccionario;

import java.util.HashMap;

public class ClaseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mapa = new HashMap<>();
		
		//mapeamos el 5 con valor "hola" y el 2 con el valor "adios"
		mapa.put(5, "hola");
		mapa.put(2, "adios");
		
		//vemos que valor tiene el 500 = null
		System.out.println("");
		System.out.println("mapeado del dato 500: \n"+mapa.get(500));
		
		//mostramos el mapa con todo
		System.out.println("");
		System.out.println("mapa: "+mapa);
		//miramos si algun dato tiene de valor "hola"
		System.out.println("");
		System.out.println("mapa tiene algun dato con valor (hola): \n"+mapa.containsValue("hola"));
		//miramos el Hashcode
		System.out.println("");
		System.out.println("hashCode del mapa: \n"+mapa.hashCode());
		//conseguimos el valor del dato 2
		System.out.println("");
		System.out.println("valor del dato 2 mapeado:\n"+mapa.get(2));
		//borramos el dato 5 con su valor
		mapa.remove(5);
		
		System.out.println("");
		System.out.println("mapa: \n"+mapa);
		System.out.println("");
		System.out.println("mapa contiene valor (hola): \n"+mapa.containsValue("hola"));
		//miramos que tenga el mapeado tenga el 2 como dato
		System.out.println("");
		System.out.println("mapa contiene dato 2: \n"+mapa.containsKey(2));
		
		//vaciar mapa
		mapa.clear();
		System.out.println("");
		System.out.println("mapa: \n"+mapa);
		
		//miramos si esta vacio
		System.out.println("");
		System.out.println("mapa vacio: \n"+mapa.isEmpty());
		
		//cuantos valores hay mapeados
		System.out.println("");
		System.out.println("tamaño mapa: \n"+mapa.size());
		
		//llenamos el mapa
		mapa.put(5, "hola");
		mapa.put(2, "adios");
		System.out.println("\nBUCLES:");
		
		//recorremos bucle del mapa
		for(Integer clave: mapa.keySet()) {
			System.out.println(clave);
		}
		
		for(String valor: mapa.values()) {
			System.out.println(valor);
		}
		
		//bucles
		for(Integer clave: mapa.keySet()) {
			System.out.println("la clave es: "+clave+" y el valor asociado es: "+mapa.get(clave));
		}
		
		//recorrido flecha
		System.out.println("Bucle forEach: ");
		mapa.forEach((clave,valor)->{
			System.out.println("la clave es: "+clave+" y el valor asociado es: "+valor);
		});
	}

}
