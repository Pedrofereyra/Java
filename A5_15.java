//Escribir la función rellenaPares () a la que se le pasa como  
//parámetro  una  tabla que debe rellenar de la siguiente forma:
//se leerá por teclado una serie de números, guardando en la tabla 
//los pares hasta que esté llena, e ignorando los impares. 
//La función tiene que devolver la cantidad de impares desechados.
package Default;
import java.util.Scanner;
public class A5_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz [][];
		matriz = new int [3][3];
		int i =0, j=0;
		int temp;
		int count=0;
		matriz [2][2]=0;
		while (matriz [2][2] == 0){
			System.out.println ("ingrese el valor de la matriz");
			
			temp = sc.nextInt();
			if (temp % 2 == 0) {
				matriz [i][j]=temp;
				
				j++;
				if (j==3) {
					j=0;
					i++;
				}
				
				
			}else {
				count++;
				
			}
			
			
			
			
		}
		for (int ii=0; ii<3;ii++) {
			for (int jj=0; jj<3;jj++) {
				
				
				
				System.out.print (matriz [ii][jj]+ " ");
				
			}
			System.out.println ();
		}
		System.out.print("La cantidad de impares fue: "+count);
		
		
	
		
		
		
		
		

	}

}
