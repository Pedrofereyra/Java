//

package Default;
import java.util.Scanner;
public class A5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vector[]= new int [8];
		int pass;
		for (int i=0; i<5;i++) {
			System.out.println("ingrese la nota del programador numero "+ (i+1) );
			vector[i]=sc.nextInt();
		}
		for (int i = 0; i<4;i++) {
			for (int j=0; j<4; j++) {
				
				if (vector[j]<vector[j+1]) {
					pass=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=pass;
					
				}
				
				
			}
			
			
		}
		for (int i = 0; i<5;i++) {
			System.out.println(vector[i]);
		}
		for (int i = 5; i<8;i++) {
			System.out.println("ingrese la puntuacion de los programadores de exibicion");
			pass=sc.nextInt();
			if (pass>=0) {
				vector[i]=pass;
			}else {
				i=8;
			}
		}
		for (int i = 0; i<7;i++) {
			for (int j=0; j<7; j++) {	
				if (vector[j]<vector[j+1]) {
					pass=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=pass;	
				}	
			}	
		}
		for (int i = 0; i<8;i++) {
			System.out.println(vector[i]);
		}
		
		
		
		
	}

}
