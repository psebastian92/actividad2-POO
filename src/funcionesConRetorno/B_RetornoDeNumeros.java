package funcionesConRetorno;

import java.util.Scanner;

public class B_RetornoDeNumeros {
	
	static int n1, n2;
	
	public static void main(String[] args) {
		//Se llama a la función 'ingresarNumeros()'
		ingresarNumeros();
		
		//Dentro de un syso, se llama a la función sumar(), dándole como ARGUMENTOS n1 y n2
		System.out.println("El resultado es: " + sumar(n1,n2) );
	}
	
	// Función ENTERA (int) sumar, que espera los PARÁMETROS enteros "a" y "b"
	public static int sumar(int a, int b) {
	    int resultado = a + b;
	    
	    return resultado;
	    // return a+b (es lo mismo que 'return resultado'
	}

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese el primer numero: ");
		n1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = entrada.nextInt();
	}
	
}
