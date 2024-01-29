package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horario;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o horário: ");
		horario = sc.nextInt();
		
		if (horario <= 12) {
			System.out.println("É de manhã!");
			}
		else {
				System.out.println("É de tarde! ");
			}
		sc.close();
		}
			
		}
	


