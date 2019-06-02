package com.engeto.euvat.dao;

import java.util.Collections;
import java.util.List;

public class Vat {

	private String details;
	private String version;
	private List<Rate> rates;
	
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Rate> getRates() {
		return rates;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}

	public void order() {
		Collections.sort(rates);

	}

	public void printLowest(int count) {
		System.out.println("Lowest " + count + " EU countries for standard VAT below:");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "- Country " + rates.get(i));
		}

	}

	public void printhighest(int count) {
		System.out.println("\nHighest " + count + " EU countries for standard VAT below:");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "- Country " + rates.get(rates.size() - 1 - i));
		}

	}

}
