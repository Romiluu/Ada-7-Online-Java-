package Ejercicios;

import java.util.Scanner;

/*TATETI:
 *  Se tiene Un tablero de 3 x 3 matriz [fila][columna] 
 *  Dos jugadores que ingresan las coordenadas de cada ficha por teclado 
 *  Una vez que tengo fila y columna de la ficha, muestro el tablero con X o 0 
 *  Verificar si es posible la posicion de la ficha y ver si hay ganador 
 *  Mientras no haya ganador continua el siguiente jugador
 *  
 *         |   |  
 *      ---|---|---         fila columna  
 *         |   | X  -> tablero[1][2] 
 *      ---|---|----    
 *         |   |
 */
public class EjercicioTATETI {

import java.util.List;

public class CompareArrayNumbers {
	public static List<Integer> max(List<Integer> a, List<Integer> b) {
		int maxList[] = {};
		if (a > b) {
			maxList = a;
		} else {
			maxList = b;
		}
		return maxList;
	}
}
