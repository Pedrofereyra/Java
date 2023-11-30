package Default;
import java.util.Scanner;
public class A2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la nota");
		num = sc.nextInt();
		if (num<=4) {
			System.out.println("Insuficiente");
		}else {
			if (num==5) {
				System.out.println("suficiente");
			}else {
				if (num==6) {
					System.out.println("Bien");
				
				}else {
					if (num<=8) {
						System.out.println("notable");	
					}else {
						System.out.println("Sobresaliente");	
					}
					
				}
				
			}
			
		}
		
		
		
		
		
		
	}

}
