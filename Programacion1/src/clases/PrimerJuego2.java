
package clases;

import java.util.Scanner;

public class PrimerJuego2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generar un número aleatorio del 1 al 100 y el usuario tiene que adivinarlo


				//Declaro variables para un número de intentos,un número pedido por el usuario, un Scanner y un número adivinar del 1 al 100
				int jugar=1;
				int num1=0;
				Scanner sc = new Scanner(System.in); 



				//Un bucle para jugar por primera vez y ya que despues se le pregunta si desea volver a jugar que se repita en caso de que si (1)
				while (jugar==1) {
					int numadivinar = (int)(Math.random()*100+1);
					int intentos=0;
					
					intentaradivinar(num1, numadivinar, intentos);
					
					jugar=volverajugar();
				}
				//Fin del programa Adios!
				System.out.println("Adios!");
			}
			//bucle infinito para preguntar si quiere volver a jugar (1) o si no quiere salir del programa (cualquier otro numero)
			public static int volverajugar () {
				Scanner sc = new Scanner(System.in);
				int jugar=1;
				System.out.println("Quieres volver a jugar?");
				System.out.println("Presiona (1) si quieres volver a jugar");
				System.out.println("si no introduce cualquier numero");
				try {
					jugar = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("NO HAS INTRODUCIDO UN NUMERO");
					sc.nextLine();
					volverajugar();

				}
				return jugar;
			}

			//Condicional para dar la pista si el numero es mayor o menor o si ha sido adivinado o tambien si el numero esta fuera de rango
			public static void adivinanza (int num1,int numadivinar,int intentos) {
				if (num1 >= 0 && num1 <= 100) {
					if (num1 > numadivinar) {
						System.out.println("El número es menor que el introducido");
					} else if (num1 < numadivinar) {
						System.out.println("El numero es mayor al introducido");
					} else if (num1 == numadivinar) {
						System.out.println("Correcto");
						System.out.println("Felicidades! adivinaste el numero en "+intentos+" intentos y era:"+numadivinar);
					}
				} else {
					System.out.println("El numero introducido esta fuera de RANGO (1-100)");
				}
				
			}
			//bucle donde se repita siempre que el usuario no adivine el número
			public static void intentaradivinar(int num1,int numadivinar, int intentos) {
				Scanner sc = new Scanner(System.in); 
				while (num1 != numadivinar) {
					//pedimos el número al usuario y sumamos 1 intento
					System.out.println("Adivina el numero! Introduce un numero del 1 al 100");
					System.out.println(numadivinar);
					intentos++;
					//metemos una condicional en donde terminaremos el bucle en caso de que el usuario lo intente 100 veces y no logre adivinar 
					if (intentos == 100) {
						System.out.println("No has podido adivinar el numero!");
						break;
					}
					//Un try para evitar crashear el programa cuando se pida un numero y el usuario introduzca un texto
					try {
						num1 = sc.nextInt();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("NO HAS INTRODUCIDO UN NUMERO");
						sc.nextLine();
						continue;
					}
					adivinanza(num1, numadivinar, intentos);
				}
			}
	}
