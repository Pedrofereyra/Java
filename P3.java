package Default;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = (int)(Math.random()*100+1);
		int num=-1;
		while (numero!=num) {
			System.out.println("intente adivinar el numero");
			num = sc.nextInt();
			if (num<0) {
				num = numero;
			}else{
				if (num>numero){
					System.out.println("es mayor al numero secreto");
				}
				if (num<numero){
					System.out.println("es menor al numero secreto");
				}

				if (num==numero){
					System.out.println("Felicidades adivinaste el numero");
				}
			}
			

			
			
		}
		
		
		
		
		
	}

}