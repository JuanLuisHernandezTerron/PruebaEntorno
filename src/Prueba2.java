import java.util.Scanner;
public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado;
		    teclado = new Scanner(System.in);
		      short numero;
		      short numero1;

		    System.out.println("Dime la fecha actual");
		    numero=teclado.nextShort();
		    System.out.println("Dime la fecha de tu cumpleaños");
		    numero1=teclado.nextShort();

		    System.out.println("La diferencia es de:");
		    System.out.print( numero - numero1);
		    System.out.print("años");
	}

}
