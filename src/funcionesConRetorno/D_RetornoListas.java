package funcionesConRetorno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_RetornoListas {
	public static void main(String[] args) {

		mostrarListaOrdenada( ordenarNumeros( ingresarNumeros() ) );

	}

	public static List ingresarNumeros() {
		List<Integer> listaNumeros = new ArrayList<>();

		// Algoritmo de ingreso de numeros enteros, finalizando con la palabra "FIN"
		while (true) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese un numero entero");
			System.out.println("Coloque FIN para terminar");
			String respuesta = entrada.next();
			if (respuesta.equalsIgnoreCase("fin")) {
				break;
			}
			// Se parsea el String respuesta como entero, y se agrega a la lista
			listaNumeros.add(Integer.parseInt(respuesta));
		}

		return listaNumeros;
	}

	public static List ordenarNumeros(List<Integer> listaNum) {

		// Aplicar el algoritmo de ordenamiento burbuja
		for (int i = 0; i < (listaNum.size() - 1); i++) {
			for (int j = 0; j < (listaNum.size() - i - 1); j++) {
				if (listaNum.get(j) > listaNum.get(j + 1)) {
					// Intercambiar los elementos de numero
					int temporalNumero = listaNum.get(j);

					int SegundoElementoNumero = listaNum.get(j + 1);

					listaNum.set(j, SegundoElementoNumero); // lista.set(posicion en la lista, nuevo dato)
					listaNum.set(j + 1, temporalNumero);
				}
			}
		}

		return listaNum;
	}

	public static void mostrarListaOrdenada(List<Integer> listaOrdenada) {

		// Algoritmo para recorrer una lista
		for (int i = 0; i < listaOrdenada.size(); i++) {
			System.out.println("Numero en la posición " + i + ": " + listaOrdenada.get(i));
		}

	}

}
