package clases;

public class arrayrellenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= new int[5];
		
		
		a =rellenararray(a,1);
		a =rellenararray(a,2);
		a =rellenararray(a,3000000);
		a =rellenararray(a,4);
		a =rellenararray(a,5);
		a =rellenararray(a,6);
		a =rellenararray(a,7);
		a =rellenararray(a,8);
		a =rellenararray(a,9);
		a =rellenararray(a,100000 );
		a =rellenararray(a,11);
		a =rellenararray(a,12);
		a =rellenararray(a,13);
		a =rellenararray(a,14);
		a =rellenararray(a,15);
		a =rellenararray(a,16);
		a =rellenararray(a,17);
		a =rellenararray(a,18);
		a =rellenararray(a,19);
		a =rellenararray(a,20);
		a =rellenararray(a,21);
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		

	}
	public static int[] rellenararray(int[] array1,int numero1) {
		int pos=0;
		for (int i=0;i<array1.length;i++) {
			if (array1[i]!=0) {
				pos++;
			}
		}
		if (pos>=array1.length) {
			int [] array2= array1;
			array1 = new int[array2.length*2];
			for (int i=0;i<array2.length;i++) {
				array1[i]=array2[i];
			}
			
		}
		array1[pos]=numero1;
		
		
		return array1;
			
		
	}

}
