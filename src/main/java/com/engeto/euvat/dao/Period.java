package com.engeto.euvat.dao;

public class Period {

	private String effective_from;
	PeriodRate rates ;

	public Period() {
	}
	
	public Period(String effective_from, PeriodRate rates) {
		super();
		this.effective_from = effective_from;
		this.rates = rates;
	}
	
	public Period(String effective_from) {
		super();
		this.effective_from = effective_from;
	}

	public String getEffective_from() {
		return effective_from;
	}

	public void setEffective_from(String effective_from) {
		this.effective_from = effective_from;
	}

	public PeriodRate getRates() {
		return rates;
	}

	public void setRates(PeriodRate rates) {
		this.rates = rates;
	}

	

}
