package methods;

import java.util.Scanner;

public class CurrencyConverter {

	Scanner sc = new Scanner(System.in);
	
	public double dolar;
	public double iofTax;
	public double reais;
	
	public double converterReal (double reais, double iofTax, double dolar) {
		
		return reais / iofTax / dolar;
		
	}
	
}
