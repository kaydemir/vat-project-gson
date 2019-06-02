package com.engeto.euvat.dao;

public class PeriodRate {

	private Double super_reduced;
	private Double reduced;
	private Double reduced1;
	private Double reduced2;
	private Double standard;
	
	public PeriodRate() {
	}
	
	public Double getSuper_reduced() {
		return super_reduced;
	}
	public void setSuper_reduced(Double super_reduced) {
		this.super_reduced = super_reduced;
	}
	public Double getReduced() {
		return reduced;
	}
	public void setReduced(Double reduced) {
		this.reduced = reduced;
	}
	public Double getReduced1() {
		return reduced1;
	}
	public void setReduced1(Double reduced1) {
		this.reduced1 = reduced1;
	}
	public Double getReduced2() {
		return reduced2;
	}
	public void setReduced2(Double reduced2) {
		this.reduced2 = reduced2;
	}
	public Double getStandard() {
		return standard;
	}
	public void setStandard(Double standard) {
		this.standard = standard;
	}

	public PeriodRate(Double standard) {
		super();
		this.standard = standard;
	}

}
