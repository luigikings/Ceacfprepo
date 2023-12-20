package clases;

import java.util.Scanner;



public class tresenraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//creamos el tablero 3x3
		char[][] tablero = new char [3][3];
		rellenarTablero(tablero);
		
		System.out.println("VAMOS A JUGAR A EL 3 EN RAYA");
		System.out.println("TU ERES X");
		System.out.println("EL ORDENADOR ES O");
		
		//Hacemos un bucle infinito que solo saldra en caso de que gane algun jugador o no haya mas movimientos posibles
		while(true) {
			
			mostrarTablero(tablero);
			turnoUsuario(tablero);
			if (comprobarTablero(tablero)) {
				break;
			}
			System.out.println("JUEGA O");
			turnoOrdenador(tablero);
			if (comprobarTablero(tablero)) {
				break;
			}
			
		}
		//Mostramos el tablero al final y damos finalizada la partida
		mostrarTablero(tablero);
		System.out.println("FIN DE LA PARTIDA");
	}
	//En esta función rellenamos la tabla de caracteres (-)
	public static void rellenarTablero(char [][] tablero) {
		for (int y=0;y<tablero.length;y++) {
			for (int x=0;x<tablero[y].length;x++) {
				tablero[x][y]='-';
				
			}
		}
	}

	//Con esta función mostramos al Usuario el estado actual del tablero
	public static void mostrarTablero(char [][] tablero) {
		System.out.println("---------------------------");
		System.out.println("          TABLERO:         ");
		//Usamos numeros para mostrar las posiciones X
		System.out.println(" 1  2  3");
		for (int y=0;y<tablero.length;y++) {
			for (int x=0;x<tablero[y].length;x++) {
					System.out.print(" "+tablero[x][y]+" ");
				
			}
			//Usamos la y para mostrar la posicion Y
			System.out.print(y+1);
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	//Con esta función hacemos el movimiento del usuario
	public static void turnoUsuario(char [][] tablero) {
		System.out.println("Turno X");
		//declaramos X y Y ya que seran las coordenadas que utilizara para jugar
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=0;
		
		//Usamos un bucle infinito para asegurarnos de que salgamos solo si el usuario introduce los 2 numeros
	while(true) {
		System.out.println("Introduce coordenadas X y Y");
		System.out.println("Las posiciones pueden ser 1, 2 o 3");
		System.out.print("X:");
		try {
			x = sc.nextInt();
			System.out.print("Y:");
			y = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("FALLO");
			sc.nextLine();
			continue;
		}
		break;
	}
		//Metemos una condicional para que si el numero entra dentro del rango podamos escribirlo dentro del tablero, en caso de que no volver a pedir las coordenadas
		if ((x >= 1 && x <= 3) && (y >= 1 && y <= 3)) {
			//y ahora metemos otra condicional para verificar que la posicion deseada esta vacia, esta vacia en caso de que ponga (-), en caso de que no avisar al usuario y volverle a pedir las coordenadas
			if (tablero[x-1][y-1]=='-') {
				tablero[x-1][y-1]='X';
			} else {
				System.err.println("POSICION YA UTILIZADA, ELIGA OTRA POSICIÓN");
				turnoUsuario(tablero);
			}
		} else {
			System.err.println("COORDENADAS FUERA DE RANGO REPITE");
			turnoUsuario(tablero);
		}
	}

	//En esta función hacemos que el ordenador juegue su turno eligiendo el numero al azar dentro del rango (0-1-2) si esta ocupada volver a pedir que pruebe otra
	public static void turnoOrdenador(char [][] tablero) {
		//generamos las 2 coordenadas del 0 al 2
		int x=(int)(Math.random()*3);
		int y=(int)(Math.random()*3);
		
		//condicional para verificar que no esta ocupada la posicion elegida
		if (tablero[x][y]=='-') {
			tablero[x][y]='O';
		} else {
			System.err.println("EL ORDENADOR ES BOBO PERDONA");
			turnoOrdenador(tablero);
		}
	}

	//Esta funcion devuelve un boolean para ver si la partida ya terminado en caso de victoria de algun jugador o que no es posible hacer mas jugadas
	public static boolean comprobarTablero(char [][] tablero) {
		//si la funcion llamada en la condicional se cumple significa que hay 1 ganador
		if(ganaXoO(tablero)) {
			return true;
		}
		
		//en este bucle verificamos si hay un espacio en el tablero en caso de que encuentre 1 que devuelva false y siga el juego
		for (int y=0;y<tablero.length;y++) {
			for (int x=0;x<tablero[y].length;x++) {
				if(tablero[y][x]=='-') {
					return false;
				}
			}
		}
		//despues de verificar que no hay espacios entonces devolvemos que hubo un empate y termina la partida devolviendo un true
		System.out.println("TENEMOS UN EMPATE:");
		return true;
	}
	
	//en esta función devuelve un boolean de true si hay ganador o false si no lo hay
	public static boolean ganaXoO(char [][] tablero) {

		//en este bucle recorremos las columnas del tablero
		for (int y=0;y<tablero.length;y++) {
			//verificamos que en cada columna tengan el mismo char
			if(tablero[y][0]==tablero[y][1] && tablero[y][1]==tablero[y][2]) {
				//y tambien que es o una X o O (ya que el char - no es valido)
				if(tablero[y][0]=='X' || tablero[y][0]=='O') {
					System.out.println("GANO "+tablero[y][0]);
					return true;
				}
			}
		}
		//en este bucle recorremos las filas del tablero
		for (int y=0;y<tablero.length;y++) {
			//verificamos que en cada columna tengan el mismo char
			if(tablero[0][y]==tablero[1][y] && tablero[1][y]==tablero[2][y]) {
				//y tambien que es o una X o O (ya que el char - no es valido)
				if(tablero[0][y]=='X' || tablero[0][y]=='O') {
					System.out.println("GANO "+tablero[0][y]);
					return true;
				}
			}
		}
		//en esta condicional miramos si son iguales los caracteres de la diagonal
		if (tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2]) {
			//verificamos de que son X o O
			if(tablero[0][0]=='X' || tablero[0][0]=='O') {
				System.out.println("GANO "+tablero[0][0]);
				return true;
			}
		}
		
		//en esta condicional miramos si son iguales los caracteres de la otra diagonal
		if (tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0]) {
			if(tablero[0][2]=='X' || tablero[0][2]=='O') {
				System.out.println("GANO "+tablero[0][2]);
				return true;
			}
		}
		return false;
	}
}
