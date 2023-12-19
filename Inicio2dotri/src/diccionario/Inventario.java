package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> inventario = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		
		while(!salir) {
			
			System.out.println("Elige 1 opcion:");
			System.out.println("1: Añadir Producto");
			System.out.println("2: Eliminar Producto");
			System.out.println("3: Mostrar Inventario");
			System.out.println("4: Mirar Cantidad de un Producto");
			System.out.println("5: Salir");
			String usuario = sc.nextLine();
			switch(usuario) {
			case "1":
				añadirProducto(inventario);
				break;
			case "2":
				eliminarProducto(inventario);
				break;
			case "3":
				mostrarProducto(inventario);
				break;
			case "4":
				mirarCantidad(inventario);
				break;
			case "5":
				salir = true;
				break;
			default:
				System.out.println("UPS ERROR");
				continue;
			}
		}
		System.out.println("Adios!");
	}
	//❤
	public static void añadirProducto(HashMap<String,Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre del Producto a añadir");
		String producto = sc.nextLine();
		
		System.out.println("Dime la cantidad de inventario");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		inventario.put(producto, cantidad);
		
	}
	
	public static void eliminarProducto(HashMap<String,Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre del Producto a eliminar");
		String producto = sc.nextLine();
		
		if(inventario.containsKey(producto)) {
			inventario.remove(producto);
			System.out.println("ELIMINADO!");
		}else {
			System.out.println("NO SE ENCUENTRA");
		}
	}
	
	public static void mostrarProducto(HashMap<String,Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		
		inventario.forEach((clave, valor) ->{
			System.out.println("Producto:" + clave);
			System.out.println("///////////////////////////////////////////////////");
		});
	}
	
	public static void mirarCantidad(HashMap<String,Integer> inventario) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre del Producto a mirar");
		String producto = sc.nextLine();
		
		if(inventario.containsKey(producto)) {
			System.out.println("El producto tiene "+inventario.get(producto)+" de cantidad");
			
		} else {
			System.out.println("no se encuentra dicho producto");
		}

		
	}
	

}
