//Escribir un programa que solicite elementos de una matriz 4x4. La aplicacion debe decidir si la matriz introducia
//corresponde a una matriz magica.

package Default;
import java.util.Scanner;
public class A5_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int matriz [][];
		matriz = new int [4][4];
		
		int Total=0;
		
		for (int i=0; i<4;i++) {
			
			
			for (int j=0; j<4;j++) {
				System.out.println("ingrese el valor del campo"+i+" "+j);
				matriz [i][j] = sc.nextInt();
				
				
			}
		}
		Total = matriz [0][0]+matriz [0][1]+matriz [0][2]+matriz [0][3];
		if ((Total == matriz [1][0]+matriz [1][1]+matriz [1][2]+matriz [1][3]) && (Total == matriz [2][0]+matriz [2][1]+matriz [2][2]+matriz [2][3]) && (Total == matriz [3][0]+matriz [3][1]+matriz [3][2]+matriz [3][3])) {
			if ((Total == matriz [0][0]+matriz [1][0]+matriz [2][0]+matriz [3][0]) && (Total == matriz [0][1]+matriz [1][1]+matriz [2][1]+matriz [3][1]) && (Total == matriz [0][2]+matriz [1][2]+matriz [2][2]+matriz [3][2])&& (Total == matriz [3][0]+matriz [3][1]+matriz [3][2]+matriz [3][3])) {
				System.out.println("Es una matriz magica");
			}else {
				System.out.println("No es una matriz magica");
			}
			
		}else {
			System.out.println("No es una matriz magica");
		}
		
		
		
		
		
		
		
		
	}

}
