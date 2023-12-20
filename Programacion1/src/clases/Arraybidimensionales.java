package clases;

public class Arraybidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] matriz = new int [5][5];

		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=(int)(Math.random()*10);
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		int [][] matriz2 = new int [5][5];
		
		int pos=0;
		
		for (int i=0;i<matriz2.length;i++) {
			for (int j=1+pos;j<matriz2[i].length;j++) {
				matriz2[i][j]=(int)(Math.random()*10);
			
			}
			pos++;
		}
		
		System.out.println("------------------------------------------");
		
		for (int i=0;i<matriz2.length;i++) {
			for (int j=0;j<matriz2[i].length;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
	
		int[][] matriz3 = new int[3][4];
		
		int sumacolumna=0;
		int sumafila=0;
		
		for (int i=0;i<matriz3.length;i++) {
			sumafila=0;
			for (int j=0;j<matriz3[i].length;j++) {
				matriz3[i][j]=(int)(Math.random()*10);
				System.out.print(matriz3[i][j]+" ");
				int aux=matriz3[i][j];
				sumafila=aux+sumafila;
					if (j==matriz3[i].length-1) {
					System.out.print("= "+sumafila);
					}
			}
		System.out.println();
		}
		for(int i=0;i<matriz3.length;i++) {
			System.out.print("= ");
		}
		System.out.println("");
		
		for (int i=0;i<matriz3.length;i++) {
			sumacolumna=0;
			for (int j=0;j<matriz3[i].length;j++) {
				int aux=matriz3[j][i];
				sumacolumna=sumacolumna+aux;
				if (j==matriz3[i].length-1) {
					System.out.print(sumacolumna+" ");
				}		
			}
		}	
	}
}
