package diccionario;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class AccesoEdificio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Boolean> accesoEdificio = new HashMap<>();
		
		generarUsuarios(accesoEdificio);
		verificarAcceso(accesoEdificio);
		
		
	}
	public static void generarUsuarios(HashMap<String,Boolean> accesoEdificio) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		for(int i=1;i<10;i++) {
			System.out.println("Coloca al usuario a introducir");
			String usuario = sc.nextLine();
			if(accesoEdificio.containsKey(usuario)) {
				System.out.println("Ya existe esta tarjeta!");
				i--;
			} else {
				accesoEdificio.put(usuario, rd.nextBoolean());
			}
		}
	}
	
	public static void verificarAcceso(HashMap<String,Boolean> accesoEdificio) {
		int accesos = 0;
		for(String clave: accesoEdificio.keySet()) {
			if(accesoEdificio.get(clave)) {
				accesos++;
			}
		}
		System.out.println("Hay un total de "+accesos+" usuarios en el edificio");
		System.out.println(accesoEdificio);
	}
}
