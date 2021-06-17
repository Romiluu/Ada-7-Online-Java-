package Ejercicios;

/*Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes,
 *  donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia. 
 *  Se ingresa toda la semana completa y se modifica de a uno.
 *  Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
 *  Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese  cero para salir.
 *   (1. agregar  2. listar 3. modificar 0. salir)
 */
import java.util.Scanner;

public class Ejercicio996Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		int dia[] = new int[5];
		int totalesRecaudados;

		System.out.println("********* Bienvenida **********");
		System.out.println("-------------------------------");
		System.out.println(" ");

		opc = mostrarMenu(sc);

		while (opc != 0) {
			switch (opc) {
			case 1:

				System.out.println("Ingrese el numero el dia de la semana");
				System.out.println("0: Lunes");
				System.out.println("1: Martes ");
				System.out.println("2: Miercoles ");
				System.out.println("3: Jueves ");
				System.out.println("4: Viernes ");
				int numDia = sc.nextInt();

				System.out.println("Ingrese el total que cobro en el dia seleccionado");
				totalesRecaudados = sc.nextInt();

				dia[numDia] = totalesRecaudados;
				break;

			case 2:
				System.out.println("Listado de recaudaciones por dia: ");
				System.out.println("--------------------------------- ");
				for (int i = 0; i < dia.length; i++) {
					System.out.println("el total recaudado  es: $" + dia[i]);
				}
				break;
			case 3:

				System.out.println("Ingrese el numero del dia que desea modificar:");
				System.out.println("0: Lunes");
				System.out.println("1: Martes ");
				System.out.println("2: Miercoles ");
				System.out.println("3: Jueves ");
				System.out.println("4: Viernes ");
				int diaModificado = sc.nextInt();
				System.out.println("Ingrese nuevo importe:");
				int importeNuevo = sc.nextInt();
				dia[diaModificado] = importeNuevo;

			}
			opc = mostrarMenu(sc);
		}

		System.out.println("-------- ADIOS -----------");

	}

	private static int mostrarMenu(Scanner sc) {
		int opc;

		System.out.println(" ");
		System.out.println("Por favor ingrese una opcion:");
		System.out.println("1: Agregar");
		System.out.println("2: Listar");
		System.out.println("3: Modificar");
		System.out.println("0: Salir");
		opc = sc.nextInt();
		return opc;
	}

}
