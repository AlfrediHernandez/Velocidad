// Programa lea la longitud de los catetos de un triangulo rectangulo
// y calcule la longitud de la Hipotenusa segun teorema de pitagoras
import java.util.*;
public class Catetos{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		double cat1,cat2;
		System.out.println("Ingrese Longitud del primer cateto: ");
			cat1 = sc.nextDouble();
		System.out.println("Ingrese Longitud del segundo cateto: ");
			cat2 = sc.nextDouble();
		System.out.println("Hipotenusa => " + Math.sqrt(Math.pow(cat1,2)+ Math.pow(cat2,2)));
		System.out.println("                             ");
		System.out.println("      Alfredi 4-oct-2020     ");	
	}
}