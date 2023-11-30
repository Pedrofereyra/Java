//Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números. 
//Realizar la media de los números positivos,
//la media de los negativos y contar el número de ceros introducidos.

package Default;
import java.util.Scanner;
public class A5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		System.out.println("cuantos numeros queres introducir");
		cant = sc.nextInt();
		int num [] = new int[cant];
		int i =0;
		int contador=0; 
		float total=0, total2=0, cont=0, cont2=0;
		for (i=0;i<cant;i++) {
			System.out.println("ingrese el numero "+i);
			num[i] = sc.nextInt();
			if (num[i]==0) {
				contador++;
			}
			if (num[i]>0) {
				total=total+num[i];
				cont++;
			}
			if (num[i]<0) {
				total2=total2+num[i];
				cont2++;
			}
		}
		System.out.println("la cantidad de ceros es: "+contador);
		System.out.println("el promedio de los numeros positivos es: "+total/cont);
		System.out.println("el promedio de los numeros negativos es: "+total2/cont2);
	}

}
