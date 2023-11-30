package Default;
import java.util.Scanner;
public class A6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String caracter, letra=" ";
		  int total=0;

          System.out.println("Ingrese cualquier palabra o frase");
          caracter = sc.nextLine();
          

          for (int i=1;i<caracter.length()+1;i++){
        	
        	
              if ( " ".equals(caracter.substring(i-1,i))) {
            	total++;
              }
          }
          System.out.println(total);
		
		
		
		
	}

}
