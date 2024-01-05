package diccionario;

public class PruebaSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "andrEA";
		nombre = nombre.toLowerCase();
		System.out.println(nombre);
		System.out.println(nombre.substring(0, 1));
		System.out.println(nombre.substring(0, 1).toUpperCase());
		System.out.println(nombre.substring(1));
		System.out.println(nombre.substring(0,1).toUpperCase()+nombre.substring(1));
		String nombreFinal = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
		System.out.println(nombreFinal);
		
	}

}
