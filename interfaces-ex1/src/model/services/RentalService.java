package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long milisegPickup = carRental.getStart().getTime();
		long milisegReturn = carRental.getFinish().getTime();
		double durationHours = (double)(milisegReturn - milisegPickup)/1000/60/60;
		double basicPayment;
		
		if(durationHours <= 12) {
			basicPayment = Math.ceil(durationHours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(durationHours/24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
