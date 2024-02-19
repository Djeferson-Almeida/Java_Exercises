package model.services;

public class PaypalService {

private Double amount;

private Integer months;
public Double paymentFee (Double amount) {
	return amount * months;
}

public Double interest(Double amount,Integer months) {
	return amount * months;
}

}
