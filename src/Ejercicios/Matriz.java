package Ejercicios;

import java.util.Scanner;

public class Matriz {

	private static final int DIAS = 5;
	private static final int CANT_LOCALES = 2;

	public static void main(String[] args) {
		// 5 filas x cada dia de la semana
		// 2 locales x cada sucursal

		// en la matriz ventas voy a guardar la cantidad de ventas
		// por sucursal por dia
		int ventas[][] = new int[DIAS][CANT_LOCALES];
		char crucigrama[][] = new char[DIAS][CANT_LOCALES];// Esto es ejemplo para hacer matriz con caracteres

		// ventas[0][1] --> guarda las ventas del dia lunes para el local 2
		// ventas[4][0] --> guarda las ventas del dia viernes para el local 1

		Scanner sc = new Scanner(System.in);
		// carga de matriz
		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				System.out.println("Ingrese ventas local " + (j + 1) + " dia: " + (i + 1));
				ventas[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				System.out.print(ventas[i][j] + " ");
			}
			System.out.println();
		}

		// Ejemplo matriz con caracteres
		crucigrama[0][0] = 'a';
		crucigrama[0][1] = 'b';
		crucigrama[1][0] = 'c';
		crucigrama[1][1] = 'd';
		crucigrama[2][0] = 'e';
		crucigrama[2][1] = 'f';
		crucigrama[3][0] = 'g';
		crucigrama[3][1] = 'h';
		crucigrama[4][0] = 'i';
		crucigrama[4][1] = 'j';

		for (int i = 0; i < DIAS; i++) {

			for (int j = 0; j < CANT_LOCALES; j++) {
				System.out.print(crucigrama[i][j] + " ");
			}
			System.out.println();
		}
	}
}