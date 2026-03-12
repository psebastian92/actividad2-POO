package funcionesConRetorno;

public class A_Saludo {
	public static void main(String[] args) {

		String saludo = obtenerSaludo();
		mostrarMensaje(saludo);
		// mostrarMensaje( obtenerSaludo() ); esta línea hace lo mismo que la línea
		// anterior
	}

	public static String obtenerSaludo() {
		return "Hola, bienvenido al sistema.";
	}

	public static void mostrarMensaje(String mensajeSaludo) {

		System.out.println(mensajeSaludo);

	}

}
