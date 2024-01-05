package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class ContactosTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> contactos = new HashMap<>();
		
		
		boolean seguir = true;
		while (seguir) {
			switch (menuContactos()) {
			case AÑADIR:
				agregarContacto(contactos);
				break;
			case ELIMINAR:
				eliminarContacto(contactos);
				break;
			case BUSCAR:
				buscarContacto(contactos);
				break;
			case MOSTRAR:
				mostrarContactos(contactos);
				break;
			case SALIR:
				seguir = false;
				break;
			default:
				break;
			}
		}
		System.out.println("Adios!");
	}

	public static void mostrarContactos(HashMap<String, String> contactos) {
		System.out.println("Contactos");
		if (contactos.isEmpty()) {
			System.out.println("No hay contactos añadidos!");
		}
		contactos.forEach((clave, valor) -> {
			System.out.println("Nombre: " + clave);
			System.out.println("///////////////////////////////////////////////////");
		});
	}
	
	public static void agregarContacto(HashMap<String, String> contactos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n-------------------------------------------");
		System.out.println("Agregemos un contacto");
		System.out.println("Introduce el nombre:");
		String nombre = sc.nextLine();
		nombre = nombreBonito(nombre);
		System.out.println("Ahora introduce el Número de telefono");
		String tlf = sc.nextLine();
		contactos.put(nombre, tlf);
		System.out.println("-------------------------------------------");
		
	}
	
	public static void eliminarContacto(HashMap<String, String> contactos) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Eliminemos un contacto");
		mostrarContactos(contactos);
		System.out.println("coloca el nombre del contacto a eliminar:");
		
		if(contactos.isEmpty()) {
			System.out.println("No hay contactos para eliminar!");
		} else {
			String nombre = sc.nextLine();
			nombre = nombreBonito(nombre);
			if(contactos.containsKey(nombre)) {
				System.out.println(nombre+" eliminado!");
				contactos.remove(nombre);
			} else {
				System.out.println("No existe ese contacto");
			}
		}
		System.out.println("-------------------------------------------");
	}
	
	public static void buscarContacto(HashMap<String, String> contactos) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Busquemos el usuario y mostremos su telefono");
		mostrarContactos(contactos);
		System.out.println("coloca el nombre del contacto");
		if(contactos.isEmpty()) {
			System.out.println("No hay contactos para buscar");
		} else {
			String nombre = sc.nextLine();
			nombre = nombreBonito(nombre);
			if(contactos.containsKey(nombre)) {
				System.out.println("telefono de "+nombre+": "+contactos.get(nombre));
				System.out.println(contactos);
			} else {
				System.out.println("No existe ese contacto");
			}
		}
		System.out.println("-------------------------------------------");	
	}

	public static TelefonoMenu menuContactos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n-------------------------------------------");
		System.out.println("ELIGA 1 DE LAS SIGUIENTES OPCIONES:");
		System.out.println("1: Añadir contacto");
		System.out.println("2: Eliminar contacto");
		System.out.println("3: Buscar contacto");
		System.out.println("4: mostrar contactos");
		System.out.println("5: Salir");

		while(true) {
			String menu = sc.nextLine();

			switch (menu) {
			case "1": 
				return TelefonoMenu.AÑADIR;
				
			case "2": 
				return TelefonoMenu.ELIMINAR;
				
			case "3": 
				return TelefonoMenu.BUSCAR;
				
			case "4": 
				return TelefonoMenu.MOSTRAR;
				
			case "5": 
				return TelefonoMenu.SALIR;
				
			default:
				System.out.println("UPS repite!");
			}
		}
	}
	
	public static String nombreBonito(String nombre) {
		nombre = nombre.toLowerCase();
		String nombreFinal = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
		return nombreFinal;
	}
}
