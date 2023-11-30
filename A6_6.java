package Default;
import java.util.Scanner;
public class A6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String caracter, total="";
		 

          System.out.println("Ingrese cualquier palabra o frase");
          caracter = sc.nextLine();
          

          for (int i=1;i<caracter.length()+1;i++){
        	
        	total=caracter.substring(i-1,i)+total;
              
          }
          System.out.println(total);

		
		
		
		
	}

}
