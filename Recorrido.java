// Programita que pase una velocidad en km/h a m/s llea por teclado
import java.util.*;
public class Recorrido{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		double velocidad;
		System.out.println("Introduce velocidad en km/h: ");
			velocidad = sc.nextDouble();
			System.out.println(velocidad + " km/h -> " + velocidad * 1000/3600 + " m/s");
				System.out.println("                           ");
				System.out.println("---------------------------");
				System.out.println("-   Alfredi 29-sep-2020   -");
				System.out.println("---------------------------");
	}
}