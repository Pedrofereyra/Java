package Default;
import java.util.Scanner;
public class A5_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de numeros que va a ingresar");
		int tamaño =  sc.nextInt();
		int par =0;
		int impar=0;
		int vector[]= new int [tamaño];
		for (int i=0; i<tamaño;i++) {
			System.out.println("ingrese un numero");
			vector[i]=sc.nextInt();
			if (vector[i]%2==0) {
				par++;
			}else {
				impar++;
			}
		}
			int par1[]= new int [par];
			int impar1[]= new int [impar];
			int p=0;
			int m=0;
		for (int i=0; i<tamaño;i++) {
			
			
			if (vector[i]%2==0) {
				
				par1[p]=vector[i];
				p++;
			}else {
				impar1[m]=vector[i];
				m++;
			}
		}
		System.out.println("Los numeros pares son:");
		for (int i=0; i<par;i++) {
			
			System.out.println(par1[i]);
		}
		System.out.println("Los numeros impares son:");
		for (int i=0; i<impar;i++) {
			System.out.println(impar1[i]);
		}
			
		
		
	}

}
