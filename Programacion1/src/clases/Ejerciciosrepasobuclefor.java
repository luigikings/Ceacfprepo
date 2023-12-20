package clases;

public class Ejerciciosrepasobuclefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1. Suma y Resta de Números Enteros: Escribe un programa que solicite al usuario dos
		números enteros y luego muestre la suma y la resta de esos números.
		
		2. Multiplicación y División de Números de Punto Flotante: Pide al usuario dos números
		de punto flotante (números con decimales) y muestra el resultado de multiplicarlos y
		dividirlos.
		
		3. Cálculo del Área de un Círculo: Solicita al usuario el radio de un círculo y calcula su
		área. Utiliza la fórmula: Área = π * radio^2.
		
		4. Número Mayor y Menor: Pide al usuario tres números y determina cuál es el mayor y
		cuál es el menor de los tres.
		
		5. Comprobación de Par o Impar: Solicita al usuario un número entero y verifica si es par
		o impar. Muestra un mensaje en consecuencia.
		
		6. Mayor de Edad: Pide al usuario su edad y determina si es mayor de edad (mayor o
		igual a 18 años) o no.
		
		7. Aprobado o Reprobado: Solicita una calificación (un número) y verifica si el estudiante
		ha aprobado (calificación mayor o igual a 5) o reprobado (calificación menor a 5).
		
		8. Conversión de Mayúsculas a Minúsculas: Pide al usuario una letra en mayúscula y
		conviértela a minúscula.
		
		9. Identificación de Vocales: Solicita al usuario un carácter (una letra) y verifica si es una
		vocal (a, e, i, o, u) o una consonante.
		
		10. Reverso de una Cadena: Escribe un programa que tome una cadena de texto y la
		imprima en orden inverso.
		
		11. Longitud de una Cadena: Solicita al usuario una cadena de texto y muestra cuántos
		caracteres contiene.
		
		12. Contar Palabras: Pide al usuario una frase y cuenta cuántas palabras contiene. Supón
		que las palabras están separadas por espacios en blanco.
		
		13. Eliminar Espacios en Blanco: Crea un programa que tome una frase y elimine todos los
		espacios en blanco de la misma antes de mostrarla.
		
		14. Suma de Números Pares: Solicita al usuario un número y suma todos los números
		pares desde 2 hasta ese número.
		
		15. Número Primo: Pide al usuario un número y verifica si es un número primo (solo
		divisible por 1 y por sí mismo).
		
		16. Contador Regresivo: Escribe un programa que cuente desde 10 hasta 1 en orden
		regresivo.
		*/
		
		
		//Ejercicio 1:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 1:");
		sumayresta(5,5);
		
		//Ejercicio 2:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 2:");
		flotantes(5.4F,5.23F);
		
		//Ejercicio 3:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 3:");
		areaCirculo(1);
		
		//Ejercicio 4:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 4:");
		mayoromenor(-444, 992222, -44444);
		
		//Ejercicio 5:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 5:");
		paroimpar(-4);
		
		//Ejercicio 6:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 6:");
		mayoredad(18);
		
		//Ejercicio 7:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 7:");
		calificar(10);
		
		//Ejercicio 8:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 8:");
		mayustolower("LK");
		
		
		//Ejercicio 9:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 9:");
		vocales('A');
		
		//Ejercicio 10:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 10:");
		stringReverso("HOLA 123 123 123");
		
		//Ejercicio 11:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 11:");
		contarcarac("hola como estas hace tiempo no se de ti");
		
		//Ejercicio 12:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 12:");
		contarPalabras("hola que tal amigo mio");
		
		//Ejercicio 13:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 13:");
		eliminarEspacios("     hola que tal           amigo mio");
		
		//Ejercicio 14:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 14:");
		sumaPares(10);
		
		//Ejercicio 15:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 15:");
		numPrimos(4);
		
		//Ejercicio 16:
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 16:");
		cuentaRegresiva();
		
		//Ejercicio 17: CHATGPT
		//Escribe un programa que pida al usuario ingresar una serie de números (3)
		//(puede ser un número indefinido) y luego calcule y muestre el promedio de esos números.
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 17: CHATGPT");
		promedio(1, 3, 6.5);
		
		//Ejercicio 18: CHATGPT
		//Crea un programa que permita al usuario ingresar una temperatura en grados Celsius y 
		//luego la convierta a grados Fahrenheit utilizando la fórmula: Fahrenheit = (Celsius * 9/5) + 32.
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 18: CHATGPT");
		Fahrenheit(16);
		
		//Ejercicio 19: CHATGPT
		//Solicita al usuario ingresar un número entero y luego calcula y muestra el factorial de ese número.
		//El factorial de un número entero n es el producto de todos los enteros positivos desde 1 hasta n.
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 19: CHATGPT");
		factorial(5);
		
		//Ejercicio 20: CHATGPT
		//Escribe un programa que pida al usuario ingresar un número n y luego muestre los primeros n números de la serie Fibonacci.
		//La serie Fibonacci comienza con 0 y 1, y cada número siguiente es la suma de los dos números anteriores (0, 1, 1, 2, 3, 5, ...).
		System.out.println("---------------------------------------------");
		System.out.println("Ejercicio 20: CHATGPT");
		fibonacci(10);

		
		
		
		
				
			
		

	}
	
	//Funcion Ejercicio 1:
	public static void sumayresta(int n1, int n2) {
		int suma = n1+n2;
		int resta = n1-n2;
		System.out.println("El resultado de la suma de "+n1+" y "+n2+" es: "+suma);
		System.out.println("El resultado de la resta de "+n1+" y "+n2+" es: "+resta);
	}
	//Funcion Ejericio 2:
	public static void flotantes(float n1, float n2) {
		float multi = n1*n2;
		float div = n1/n2;
		System.out.println("El resultado de la multiplicacion de "+n1+" y "+n2+" es: "+multi);
		System.out.println("El resultado de la division de "+n1+" y "+n2+" es: "+div);
	}
	//Funcion Ejercicio3:
	public static void areaCirculo(double r) {
		double area = Math.PI*Math.pow(r, 2);
		System.out.println("El area del circulo de radio "+r+" es: "+area);
	}
	//Funcion Ejercicio4:
	public static void mayoromenor(int n1, int n2, int n3) {
		int mayor = n1;
		int menor = n1;
		if (n1 > n2 && n1 > n3) {
			mayor = n1;
		} else if (n2 > n1 && n2 > n3) {
			mayor = n2;
		} else {
			mayor = n3;
		}
		
		if (n1 < n2 && n1 < n3) {
			menor = n1;
		} else if (n2 < n1 && n2 < n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		
		System.out.println("de estos 3 numeros :"+n1+", "+n2+" y "+n3+" el mayor es: "+mayor+" y el menor es: "+menor);
	}
	//Funcion Ejercicio5:
	public static void paroimpar(int n1) {
		if (n1%2==0) {
			System.out.println("El numero "+n1+" es PAR");
		} else {
			System.out.println("El numero "+n1+" es IMPAR");
		}
	}
	//Funcion Ejercicio6:
	public static void mayoredad(int edad) {
		if (edad >= 18) {
			System.out.println("Usted con "+edad+" es MAYOR DE EDAD");
		} else {
			System.out.println("Usted con "+edad+" es MENOR DE EDAD");
		}
	}
	//Funcion Ejercicio7:
	public static void calificar (int calificacion) {
		if (calificacion >=5 && calificacion < 11) {
			System.out.println("Usted con una nota de "+calificacion+" esta APROBADO");
		} else if (calificacion <5 && calificacion >= 0) {
			System.out.println("Usted con una nota de "+calificacion+" esta REPROBADO");
		} else {
			System.out.println("La nota de "+calificacion+" esta FUERA DE RANGO (0-10)");
		}
	}
	//Funcion Ejercicio8:
	public static void mayustolower(String letra) {
		System.out.println(letra.toLowerCase());
	}
	//Funcion Ejercicio9:
	public static void vocales(char letra) {
		switch (letra) {
			case 'a','e','i','o','u','A','E','I','O','U':
				System.out.println("La letra "+letra+" es una VOCAL");
				break;
			default:
				System.out.println("La letra "+letra+" es una CONSONANTE");
		}
	}
	//Funcion Ejercicio10:
	public static void stringReverso(String txt) {
		int i=txt.length()-1;
		String txtReverso = "";
		while(i >=0) {
			txtReverso = txtReverso+txt.charAt(i);
			i--;
		}
		System.out.println(txtReverso);
	}
	//Funcion Ejercicio11:
	public static void contarcarac(String txt) {
		System.out.println("La frase tiene: "+txt.length()+" CARACTERES");
	}
	//Funcion Ejercicio12:
	public static void contarPalabras(String txt) {
		int numPalabras= 1;
		for (int i=0;i<txt.length();i++) {
			if(txt.charAt(i)==' ') {
				numPalabras++;
			}
		}
		System.out.println("La frase tiene: "+numPalabras+" PALABRAS");
	}
	//Funcion Ejercicio13:
	public static void eliminarEspacios(String txt) {
		String txtSinEspacio = "";
		for (int i=0;i<txt.length();i++) {
			if(txt.charAt(i)!=' ') {
				txtSinEspacio = txtSinEspacio+txt.charAt(i);
			}
		
		}
		System.out.println(txtSinEspacio);
			
	}
	//Funcion Ejercicio14:
	public static void sumaPares(int n1) {
		int suma = 0;
		for(int i=2;i<=n1;i++) {
			if(i%2==0) {
				suma = suma + i;
			}
		}
		System.out.println("La suma de los numeros pares desde el 2 hasta el "+n1+" es: "+suma);
	}
	//Funcion Ejercicio15:
	public static void numPrimos(int n1) {
		boolean primo = true;
		for(int i=2;i<n1;i++) {
			if(n1%i==0) {
				primo = false;
			}
		}
		if (n1 >= 2) {
			if (primo == true) {
				System.out.println("El numero "+n1+" ES PRIMO");
			
			}
		} 
		System.out.println("El numero "+n1+" NO ES PRIMO");
		
	}
	//Funcion Ejercicio16:
	public static void cuentaRegresiva() {
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("BOOM!");
	}
	//Funcion Ejercicio17:
	public static void promedio(double n1, double n2, double n3) {
		double promedio = (n1+n2+n3)/3;
		System.out.println("El promedio es: "+promedio);
	}
	//Funcion Ejercicio18:
	public static void Fahrenheit(double celcius) {
		double Fahrenheit = (celcius*9/5)+32;
		System.out.println("Los grados Fahrenheit son: "+Fahrenheit);
	}
	//Funcion Ejercicio19:
	public static void factorial(int n1) {
		int resFactorial=1;
		for (int i=1;i<=n1;i++) {
			resFactorial=resFactorial*i;
		}
		System.out.println("el factorial de "+n1+" es: "+resFactorial);
	}
	//Funcion Ejercicio20:
	public static void fibonacci(int n1) {
		int a = 0;
		int b = 1;
		for(int i=1;i<=n1;i++) {
			System.out.print(a +" ");
			int aux = a;
			a = b;
			b = b+aux;
		
			
		}
	}

}
