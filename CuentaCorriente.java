package Clases;
import java.util.Scanner;
public class CuentaCorriente {
	Scanner sc = new Scanner(System.in);
	int DNI = 0;
	String nombre = "";
	int saldo = 0;
	int ldd = -50;

	
	public void ingresar() {
		System.out.println("Cuanto desea ingresar?");
		int monto = -1;
		while (monto < 0) {
			monto = sc.nextInt();
		}
		
		saldo=saldo+monto;
		System.out.println("Ok su saldo total es de: "+ saldo);
		System.out.println("-------------------------------------------------------------------------------------------------");
	
	}
	
	public void retirar() {
		System.out.println("Cuanto desea retirar?");
		int monto = -1;
		while (monto < 0) {
			monto = sc.nextInt();
		}
		
		if (saldo-monto<ldd) {
			System.out.println("No tiene suficiente dinero para retirar, su saldo es de: "+ saldo);
		}else {
			saldo=saldo-monto;
			System.out.println("Ok su saldo total es de: "+ saldo);
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("DNI: "+ DNI);
		System.out.println("Saldo: "+ saldo);
		System.out.println("-------------------------------------------------------------------------------------------------");
		
	}
}
