package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	private Date dueDate(Date date, int months) {
		Calendar newDate = Calendar.getInstance();
		newDate.setTime(date);
		newDate.add(Calendar.MONTH, months);
		return newDate.getTime();
	}
	
	public void processContract(Contract contract, int months) {
		double base = contract.getTotalValue()/months;
		for(int i=1; i<=months; i++) {
			Date dueDate = dueDate(contract.getDate(), i);
			double updatedBase = base + onlinePaymentService.interest(base, i);
			double amount = updatedBase + onlinePaymentService.paymentFee(updatedBase);
			contract.addInstallment(new Installment(dueDate, amount));
		}
	}
}
