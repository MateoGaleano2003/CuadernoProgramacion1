package practica;

import java.util.Scanner;

public class ejerciciosfunciones {
	
public static void main(String[] args) {
        
        int resultado = cantDivisores(45);
        System.out.println("La cantidad de divisores de 45 es: " + resultado);
        System.out.println("La cantidad de divisores de 2374 es: " + cantDivisores(2374));
        System.out.println("La cantidad de divisores de 3529 es: " + cantDivisores(3529));
        
        System.out.println(esPrimo(37));
        System.out.println(esPrimo(633));
        System.out.println(esPrimo(3592));
        
        System.out.println(SiguientePrimo(8));
        System.out.println(SiguientePrimo(230));
        System.out.println(SiguientePrimo(3527));
        
        System.out.println(Factorial(3));
        System.out.println(Factorial(7));
        System.out.println(Factorial(16));
    }
//funciones eje 1
	public static int cantDivisores(int numero) {
		int cont = 0;
		
		for (int i=1; i<= numero; i++) {
			if(numero % i == 0) {
				cont++;
			}
		}
		return cont;
	}
	
	
//eje 2
	public static boolean esPrimo(int numero) {
		if (numero > 1) {
			return false;
		}
		
		for (int i=1; i<= numero; i++) {
			if(numero % i == 0) {
			}
		}
		return cantDivisores(numero) == 2;
	}
	
//eje 3	
	public static int SiguientePrimo(int numero) {
		int candidato = numero + 1;
		while(true) {
			if(esPrimo(candidato));{
				
			}
			return candidato;
		}
	}
		
//eje 4
// el mayor numero que puede calcular el factorial es de 32
	public static int Factorial(int numero) {
		int resultado = 1;
		for(int i = 1; i <= numero; i++) {
			resultado = resultado * i;
		}
		return resultado;
		
	}
	
//eje 5
	
}
	
