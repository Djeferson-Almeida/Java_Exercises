package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private LocalDate Date;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment() {
	}
	
	public Installment(LocalDate Date, Double amount) {
		this.Date = Date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate dueDate) {
		this.Date = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return Date.format(fmt) + "-" + String.format("%.2f",amount);
	}
	
	
}
