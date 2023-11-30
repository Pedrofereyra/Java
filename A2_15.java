package Default;
import java.util.Scanner;
public class A2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		while(num<1||num>7) {
			System.out.println("Ingrese un numero del 1 al 7");
			num = sc.nextInt();
		}
		switch(num) {
		case 1:
			System.out.println("lunes");
		break;
		case 2:
			System.out.println("martes");
		break;
		case 3:
			System.out.println("miercoles");
		break;
		case 4:
			System.out.println("jueves");
		break;
		case 5:
			System.out.println("viernes");
		break;
		case 6:
			System.out.println("sabado");
		break;
		case 7:
			System.out.println("domingo");
		break;
			
		}
		
		
		
	}

}
