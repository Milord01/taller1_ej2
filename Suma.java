package Taller1;
import java.util.Scanner;
public class Suma {
	public static void main(String[] args) {
		double x;
		double y;
		double suma=0;
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese x:");
	    x = entrada.nextDouble();
	    suma=suma+x; 
	    Scanner entrada1 = new Scanner(System.in);
	    System.out.println("Ingrese y:");
	    y = entrada1.nextDouble();
		x=x+Math.pow(y, 2);
		suma= suma+x/y;
		System.out.println("El valor de la suma es: " + suma);
	}
}
