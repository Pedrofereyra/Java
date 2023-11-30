//Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su combinación secreta, 
//que está formado por una combinación de dígitos del uno al cinco. 
//El jugador especificará cuál es la longitud de la combinación, 
//a mayor longitud mayor será la dificultad del juego. La aplicación genera, 
//de forma aleatoria, una combinación secreta que el usuario tendrá que acertar. 
//En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador,
//si es mayor, menor o igual que el correspondiente en la combinación secreta.


package Default;
import java.util.Scanner;
public class A5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese la cantidad de numeros a adivinar");
		int cantidad = sc.nextInt();
		int vector[]= new int [cantidad];
		int c=1;
		int ad;
		for (int i=0; i<cantidad;i++) {
			
			vector[i] = (int) Math.ceil(Math.random()*6);
			
		}
		for (int i=0; i<cantidad;i++) {
			
			while (c==1) {
				System.out.println("intente adivinar el codigo numero "+ i);
				 ad = sc.nextInt();
				if (ad == vector[i]) {
					System.out.println("adivino el numero pase al siguente");
					c=0;
				}else {
				if (ad > vector[i]) {
					System.out.println("el numero es mas chico");
				}else {
					if (ad == vector[i]) {
						System.out.println("el numero es mas grande");
					}
				}
				}
				
				
			}
			c=1;
			
		}

		System.out.println("Gano el juego");
		
		
		
		}
	}


