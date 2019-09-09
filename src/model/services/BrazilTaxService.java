package model.services;

public class BrazilTaxService implements TaxService { // implementa a classe interface
										// double com D minusculo = tipo primitivo e não class, assume que sempre terá que receber valor
	public double tax(double amount) { // se fosse D maiusculo, poderia ocasionalmente ser um valor nulo!
		if (amount <= 100.0) {        
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
