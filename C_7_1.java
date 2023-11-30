package Clases;
import java.util.Scanner;
public class C_7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = 1;
		String q = "";
		System.out.println("Desea crear una cuenta corriente? (Y/N)");
		q = sc.next();
		if (q.equals("Y")) {
			CuentaCorriente cuenta1 = new CuentaCorriente();
			System.out.println("Ingrese su nombre");
			cuenta1.nombre = sc.next();
			System.out.println("Ingrese su DNI");
			cuenta1.DNI = sc.nextInt();

			
			while (d > 0) {
				System.out.println("que desea hacer?");
				System.out.println("Ingresar dinero (1)");
				System.out.println("Retirar dinero (2)");
				System.out.println("Mostrar (3)");
				System.out.println("Salir (0)");
				d = sc.nextInt();
				if (d==1) {
					cuenta1.ingresar();
				}
				if (d==2) {
					cuenta1.retirar();
				}
				if (d==3) {
					cuenta1.mostrar();
				}
			}
		}else {
			System.out.println("Chau");
		}
	}

}
