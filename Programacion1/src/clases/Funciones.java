package clases;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tipoDeDouble(4999999999999999999999999999999999999999999999999999999d);
	}
	
	public static void tipoDeDouble(Double n3) {

		if(n3<=Short.MAX_VALUE && n3>=Short.MIN_VALUE) {
			System.out.println("Se aconseja del tipo SHORT");
			System.out.println(n3);
		} else if (n3<=Long.MAX_VALUE && n3>=Long.MIN_VALUE) {
			System.out.println("Se aconseja del tipo LONG");
			System.out.println(n3);
		} else {
			System.out.println("Se aconseja del tipo DOUBLE");
			System.out.println(n3);

		}

	}

}
