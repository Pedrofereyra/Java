package Default;
import java.util.Scanner;
public class A2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0,num2=0, c1, c2;
		String decena = null, centena = null;
		while(num<1||num>99) {
			System.out.println("Ingrese un numero del 1 al 99");
			num = sc.nextInt();
		}
		num2=num;
		c1=num%10;
		c2=num/10%10;
		System.out.println(c1);
		System.out.println(c2);
		switch(c1){
		case 1:
			centena="y uno";
			break;
		case 2:
			centena="y dos";
			break;
		case 3:
			centena="y tres";
			break;
		case 4:
			centena="y cuatro";
			break;
		case 5:
			centena="y cinco";
			break;
		case 6:
			centena="y seis";
			break;
		case 7:
			centena="y siete";
			break;
		case 8:
			centena="y ocho";
			break;
		case 9:
			centena="y nueve";
			break;
		case 0:
			centena="";
			break;
	
		}
		
		switch(c2){
		case 1:
			decena="diez ";
			break;
		case 2:
			decena="veinte ";
			break;
		case 3:
			decena="treinta ";
			break;
		case 4:
			decena="cuarenta ";
			break;
		case 5:
			decena="cincuenta ";
			break;
		case 6:
			decena="sesenta ";
			break;
		case 7:
			decena="setenta ";
			break;
		case 8:
			decena="ochenta ";
			break;
		case 9:
			decena="noventa ";
			break;
		}
		switch(num2){
		case 11:
			decena="once";
			centena="";
			break;
		case 12:
			decena="doce";
			centena="";
			break;
		case 13:
			decena="trece";
			centena="";
			break;
		case 14:
			decena="catorce";
			centena="";
			break;
		case 15:
			decena="quince";
			centena="";
			break;
		
		} 
		System.out.print(decena+" "+centena);
		
		
		
		
	}

}
