package com.engeto.euvat.dao;

import java.util.ArrayList;
import java.util.List;

public class Rate implements Comparable<Rate> {
	private String name;
	private String code;
	private String country_code;
	private List<Period> periods = new ArrayList<Period>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public int compareTo(Rate o) {
		if (periods.get(0).rates.getStandard() > o.getPeriods().get(0).getRates().getStandard()) {
			return 1;
		}
		if (periods.get(0).rates.getStandard() < o.getPeriods().get(0).getRates().getStandard()) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Name="+name+", Country VAT Rate="+periods.get(0).getRates().getStandard();
	}

}
