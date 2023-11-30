package Default;
import java.util.Scanner;
public class Examen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TablaO[]= new int [5];
		int TablaI[]= new int [5];
		int TablaM[]= new int [5];
		int pass;
		for (int i=0; i<5;i++) {
			TablaI[i]=i;
		}
		for (int i=0; i<5;i++) {
			System.out.println("ingrese un numero a la tabla");
			TablaO[i]=sc.nextInt();
			TablaM[i]=TablaO[i];
		}
		for (int i = 0; i<4;i++) {
			for (int j=0; j<4; j++) {
				if (TablaM[j]>TablaM[j+1]) {
					
					pass=TablaM[j+1];
					TablaM[j+1]=TablaM[j];
					TablaM[j]=pass;
					pass=TablaI[j+1];
					TablaI[j+1]=TablaI[j];
					TablaI[j]=pass;
					
				}

			}
		}
		
		
		System.out.println(" ");
		System.out.print("Tabla original: ");
		
		for (int i=0; i<5;i++) {
			System.out.print(TablaO[i]+" ");
	
		}
		
		System.out.println(" ");
		System.out.print("Tabla indices: ");
		for (int i=0; i<5;i++) {
			System.out.print(TablaI[i]+" ");
	
		}
		
	}

}
