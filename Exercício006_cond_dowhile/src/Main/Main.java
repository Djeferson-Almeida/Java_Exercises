package Main;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Conversor de Celsius para Fahrenheit\n");
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.println("Essa temperatura em Celsius é equivalente á: "+ F +" em Fahrenheit!");
			System.out.println("Deseja repetir? (s/n)");
			resp = sc.next().charAt(0); 
		} while (resp != 'n');
		
		sc.close();
		
		
	}

}
