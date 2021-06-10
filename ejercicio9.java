import java.util.*;

public class ejercicio9{
	
	public static void main(String[] args){
		double t1, t2, promediot1, promediot2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese temperatura 1: ");
		t1 = scanner.nextDouble();
		System.out.println("Ingrese temperatura 2: ");
		t2 = scanner.nextDouble();
		
		double contadort1 = 0;
		double contadort2 = 0;
		double acumuladort1 = 0;
		double acumuladort2 = 0;
		
		while ((t1 != 0) && (t1>=5 && t1<=15) ){
			contadort1 = contadort1 + 1;
			acumuladort1 = acumuladort1 + t1;
			contadort2 = contadort2 + 1;
			acumuladort2 = acumuladort2 + t2;
		
			System.out.println("Ingrese la nueva temperatura 1: ");
			t1 = scanner.nextDouble();
			System.out.println("Ingrese la nueva temperatura 2: ");
			t2 = scanner.nextDouble();			
		}
		
		promediot1 = acumuladort1/contadort1;
		promediot2 = acumuladort2/contadort2;
		
		System.out.println("El promedio de las temperaturas 1 es: "+promediot1);
		System.out.println("El promedio de las temperaturas 2 es: "+promediot2);		
	}
}