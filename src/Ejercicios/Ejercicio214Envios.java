package Ejercicios;

/*Una compañía de paquetería internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia.
 *  El costo por el servicio de paquetería se basa en el peso del paquete y la zona a la que va dirigido. 
 *  
 *  Lo anterior se muestra en la siguiente tabla:
 *  
 *  ZONA       UBICACION         COSTO/GRAMO
 *  1       AMERICA DEL NORTE       $11
 *  2       AMERICA CENTRAL         $10
 *  3       AMERICA DEL SUR         $12
 *  4           EUROPA              $24
 *  5           ASIA                $27
 */
import java.util.Scanner;

public class Ejercicio214Envios {
	private static final int PESO_MAXIMO = 5000;
	private static final int ZONA_1 = 1;
	private static final int ZONA_2 = 2;
	private static final int ZONA_3 = 3;
	private static final int ZONA_4 = 4;
	private static final int ZONA_5 = 5;
	private static final int VALOR_Z1 = 11;
	private static final int VALOR_Z2 = 10;
	private static final int VALOR_Z3 = 12;
	private static final int VALOR_Z4 = 24;
	private static final int VALOR_Z5 = 27;

	public static void main(String[] args) {
		Scanner sc; // declaracion de variable: le pone un nombre y un tipo a la variable
		// en este punto la variable sc tiene valor null
		sc = new Scanner(System.in); // inicializando variable sc

		System.out.println("SISTEMA DE ENVIOS");
		System.out.println("=================");
		System.out.println();
		System.out.println("Ingrese peso del envio (en gramos) ");
		int gramosEnvio = sc.nextInt();
		if (gramosEnvio > PESO_MAXIMO) {
			System.out.println("No puede hacer ese envio por superar los 5kg");
		} else {

			System.out.println("1 - America del Norte");
			System.out.println("2 - America Central");
			System.out.println("3 - America del Sur");
			System.out.println("4 - Europa");
			System.out.println("5 - Asia");
			System.out.println("Ingrese codigo de zona: ");
			int codigoZona = sc.nextInt();
			int total;

			switch (codigoZona) {
			case ZONA_1:
				total = VALOR_Z1 * gramosEnvio;
				break;
			case ZONA_2:
				total = VALOR_Z2 * gramosEnvio;
				break;
			case ZONA_3:
				total = VALOR_Z3 * gramosEnvio;
				break;
			case ZONA_4:
				total = VALOR_Z4 * gramosEnvio;
				break;
			case ZONA_5:
				total = VALOR_Z5 * gramosEnvio;
				break;

			default:
				total = 0;
				break;
			}

			System.out.println("El total a pagar es: " + total);
		}

	}

}
