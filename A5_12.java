//Crear una tabla bidimensional de tamaño 5 x 5 y rellenarla de la siguiente forma: la posición [n, m] debe contener n + m. Después se debe mostrar su contenido
package Default;
import java.util.Scanner;
public class A5_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int matriz [][];
		matriz = new int [4][4];
		
		int Total=0;
		
		for (int i=0; i<4;i++) {
			
			
			for (int j=0; j<4;j++) {
				
				matriz [i][j] = i+j;
				System.out.print (matriz [i][j]+ " ");
				
			}
			System.out.println ();
		}
	}
}
