package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.Enums.WorkerLevel;
import entities.HourContract;
public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		
		//Entrada de dados
		System.out.print("Enter the departament name: ");
		String departmentName = sc.nextLine();
		System.out.print(" Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Name: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker (workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print(worker);
		System.out.print("How many contracts to this worker?");
		int n = sc.nextInt();
		
		
		//Varedura para checar quantos contratos irão ter e fazer a soma dos valores
		for (int i =1; i<-n;i++) {
			System.out.print("Enter contract #" + i + "data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		//Entrada de dados 
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month =Integer.parseInt( monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name:" + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}

}
