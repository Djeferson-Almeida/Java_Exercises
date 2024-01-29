package Main;

import methods.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		converter.reais = sc.nextDouble();
		converter.dolar = sc.nextDouble();
		converter.iofTax= sc.nextDouble();
		
		System.out.println("Enter value of reais to converter in dolar: ");
		System.out.println(Double.parseDouble("Dolar:", converter.converterReal()));
		
		
	}

}
