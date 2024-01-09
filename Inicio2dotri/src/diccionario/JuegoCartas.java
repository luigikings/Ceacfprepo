package diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class JuegoCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el mapeado de las barajas y la rellenamos de 4 mapeados (los 4 palos de las cartas)
		HashMap<String, ArrayList<String[]>> barajaCartas = new HashMap<>();
		rellenarBaraja(barajaCartas);
		
		//creamos arraylist de String que van a ser las 2 manos de cartas que tenga el jugador. Una lista de 2 es igual a 2 cartas
		ArrayList<String[]> jugador1 = new ArrayList<String[]>();
		ArrayList<String[]> jugador2 = new ArrayList<String[]>();
		ArrayList<String[]> jugador3 = new ArrayList<String[]>();
		ArrayList<String[]> jugador4 = new ArrayList<String[]>();
		
		//repartimos 2 cartas a cada jugador
		repartirCartas(barajaCartas, jugador1);
		repartirCartas(barajaCartas, jugador2);
		repartirCartas(barajaCartas, jugador3);
		repartirCartas(barajaCartas, jugador4);

		//vemos las cartas de cada Jugador
		System.out.println("////////////////////////////////////");
		System.out.println("Jugador 1:");
		verCartasJugador(jugador1);
		System.out.println("////////////////////////////////////");
		System.out.println("Jugador 2:");
		verCartasJugador(jugador2);
		System.out.println("////////////////////////////////////");
		System.out.println("Jugador 3:");
		verCartasJugador(jugador3);
		System.out.println("////////////////////////////////////");
		System.out.println("Jugador 4:");
		verCartasJugador(jugador4);
		System.out.println("////////////////////////////////////");
		
		//vemos la baraja (debe estar incompleta ya que quitamos cartas que estan repartidas por los jugadores)
		verBaraja(barajaCartas);
		
		//hacemos que los jugadores usen sus manos y se devuelven a la baraja
		usarMano(jugador1, barajaCartas);
		usarMano(jugador2, barajaCartas);
		usarMano(jugador3, barajaCartas);
		usarMano(jugador4, barajaCartas);
		
		//volvemos a ver si la baraja esta completa
		System.out.println("----------------------------------------------------------------------");
		verBaraja(barajaCartas);

	}

	//En esta funcion rellenamos la baraja de cartas con listas de los 4 palos y en cada palo cada carta con su palo y su valor (2-14)
	public static void rellenarBaraja(HashMap<String, ArrayList<String[]>> barajaCartas) {
		//aqui creamos las listas de cada palo
		ArrayList<String[]> diamante = new ArrayList<String[]>();
		ArrayList<String[]> trebol = new ArrayList<String[]>();
		ArrayList<String[]> corazon = new ArrayList<String[]>();
		ArrayList<String[]> pica = new ArrayList<String[]>();

		//cogemos cada lista y la rellenamos con las cartas
		rellenarPalo(diamante,"D");
		rellenarPalo(trebol,"T");
		rellenarPalo(corazon,"C");
		rellenarPalo(pica,"P");
		
		//una vez las listas ya llenas metemos estas 4 listas al mapeado
		barajaCartas.put("diamante", diamante);
		barajaCartas.put("trebol", trebol);
		barajaCartas.put("corazon", corazon);
		barajaCartas.put("pica", pica);
	}
	
	//En esta funcion cogemos cada lista de palo y la rellenamos con su palo y su valor (2-14)
	public static void rellenarPalo(ArrayList<String[]> Palo,String palo){
		//hacemos un bucle que cree 14 cartas (14 cartas tiene cada palo)
		for(int i=0;i<13;i++) {
			//creamos la carta con un array de String de 2 y la rellenamos con su valor en la primera posicion y en la segunda posicion rellenamos con el valor
			String[] carta = new String[2];
			carta[0]=palo;
			
			carta[1]=i+2+"";
			//añadimos la carta a la lista del palo
			Palo.add(carta);

		}
	}

	//En esta funcion repartimos 2 
	public static void repartirCartas(HashMap<String, ArrayList<String[]>> barajaCartas,ArrayList<String[]> jugador) {
		String[] carta = new String[2];
		
		Random rd = new Random();
		
		
		ArrayList<String[]> manoPalo = new ArrayList<String[]>();
		for(int i=0;i<2;i++) {
			int azar = 0;
			
			switch (rd.nextInt(1, 5)) {
			case 1:
				 manoPalo = barajaCartas.get("diamante");
				 azar = rd.nextInt(0,manoPalo.size());
				 carta = manoPalo.get(azar);
				 manoPalo.remove(azar);
				 barajaCartas.put("diamante", manoPalo);
				break;
			case 2:
				manoPalo = barajaCartas.get("trebol");
				azar = rd.nextInt(0,manoPalo.size());
				carta = manoPalo.get(azar);
				manoPalo.remove(azar);
				barajaCartas.put("trebol", manoPalo);
				break;
			case 3:
				manoPalo = barajaCartas.get("corazon");
				azar = rd.nextInt(0,manoPalo.size());
				carta = manoPalo.get(azar);
				manoPalo.remove(azar);
				barajaCartas.put("corazon", manoPalo);
				break;
			case 4:
				manoPalo = barajaCartas.get("pica");
				azar = rd.nextInt(0,manoPalo.size());
				carta = manoPalo.get(azar);
				manoPalo.remove(azar);
				barajaCartas.put("pica", manoPalo);
				break;
			default:
				break;
			}
			System.out.println(carta[0]+carta[1]);
			jugador.add(carta);
		}
		
	}
	
	public static void verCartasJugador(ArrayList<String[]> jugador) {
		int numCarta=1;
		for(int i = 0;i<jugador.size();i++) {
			String[] carta = jugador.get(i);
			System.out.println("CARTA "+numCarta);
			numCarta++;
			for(int j = 0;j<carta.length;j++) {
				switch (carta[j]) {
				case "11":
					System.out.print("J");
					break;
				case "12":
					System.out.print("Q");
					break;
				case "13":
					System.out.print("K");
					break;
				case "14":
					System.out.print("A");
					break;

				default:
					System.out.print(carta[j]);
					break;
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void verBaraja(HashMap<String, ArrayList<String[]>> barajaCartas) {
		for( ArrayList<String[]> valor : barajaCartas.values()) {
			ArrayList<String[]> palo = valor;
			for(int i=0;i<palo.size();i++) {
				String[] carta = palo.get(i);
				System.out.print(carta[0]+carta[1]+" ");
			}
			System.out.println();
			
		}
	}
	
	public static void usarMano(ArrayList<String[]> jugador,HashMap<String, ArrayList<String[]>> barajaCartas) {
		
		
		ArrayList<String[]> manoPalo = new ArrayList<String[]>();
		for(int i=0;i<jugador.size();i++) {
			String[] carta = jugador.get(i);
			switch (carta[0]) {
			case "D":
				manoPalo = barajaCartas.get("diamante");
				manoPalo.add(carta);
				barajaCartas.put("diamante", manoPalo);
				break;
			case "T":
				manoPalo = barajaCartas.get("trebol");
				manoPalo.add(carta);
				barajaCartas.put("trebol", manoPalo);
				break;
			case "C":
				manoPalo = barajaCartas.get("corazon");
				manoPalo.add(carta);
				barajaCartas.put("corazon", manoPalo);
				break;
			case "P":
				manoPalo = barajaCartas.get("pica");
				manoPalo.add(carta);
				barajaCartas.put("pica", manoPalo);
				break;

			default:
				break;
			}
		}
		jugador.clear();
		
	}
}
