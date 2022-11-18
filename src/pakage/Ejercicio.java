package pakage;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;

		num1 = Util.leerInt("Introduzca el primer número: ");

		num2 = Util.leerInt("Introduzca el segundo número: ");

		numeros(num1, num2);

	}

	public static void numeros(int n1, int n2) {

		do {
			n1++;
			System.out.println(n1);

		} while (n1 < n2 - 1);

	}
}
