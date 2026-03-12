package funcionesConRetorno;

import java.util.Scanner;

public class C_RetornoArrays {
	public static void main(String[] args) {

	}
	

	// Función ENTERA (int) sumar, que espera los PARÁMETROS enteros "a" y "b"
	public static int sumar(int a, int b) {
	    int resultado = a + b;
	    
	    return resultado;
	    // return a+b (es lo mismo que 'return resultado'
	}

	public static int[] ingresarNumeros() {
		Scanner entrada = new Scanner (System.in);
		int[] arrayNumeros = new int[2];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Ingrese un numero: ");
			arrayNumeros[i] = entrada.nextInt();
		}
		
		return arrayNumeros;
	}

}
