package practica;

public class ejerciciosstring {

	public static void main(String[] args) {
		System.out.println(contadorDeLetras("Elefantees"));
	}
// eje 1
	public static int contarLetrasE(String cadena) {
        if (cadena == null) {
        }
		return 0;
	}
	public static int contadorDeLetras(String cadena) {
		int cont = 0;
		for(int i = 0; i < cadena.length(); i++) {
			char caracterActual = Character.toLowerCase(cadena.charAt(i));
			if (caracterActual == 'e') {
				cont = cont + 1;
			}
		}
		return cont;
	}
	
//eje 2
	

}
