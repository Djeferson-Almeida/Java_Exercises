package Main;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:\n"+ product1 +","+ "which price is $" + price1 + product2 +","
		+ "which price is $ " + price2);
		System.out.println("Record: " + age + "years old, " + "code: " + code + "and gender: " + gender);
		Locale.setDefault(Locale.US);
		System.out.printf("Measure which eight decimal places: "+ measure + "Measure which four decimal places: %.2f", measure);
		
		
		
		

	}

}
