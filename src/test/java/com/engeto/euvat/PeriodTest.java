package com.engeto.euvat;

import static org.junit.Assert.*;

import org.junit.Test;
import com.engeto.euvat.dao.Period;
import com.engeto.euvat.dao.PeriodRate;

public class PeriodTest {

	Period period = new Period("2019-01-01");
	PeriodRate rate = new PeriodRate(20.0);

	@Test
	public void testGetEffective_from() {
		if ((period.getEffective_from() == null))
			fail("testGetEffective_from fails.");
	}

	@Test
	public void testSetEffective_from() {
		period.setEffective_from("2019-02-02");
		if (!period.getEffective_from().equalsIgnoreCase("2019-02-02"))
			fail("testSetEffective_from fails.");
	}

	@Test
	public void testGetRates() {
		rate.setReduced(20.0);
		rate.setStandard(25.0);
		rate.setSuper_reduced(5.0);
		if (!(rate.getSuper_reduced() == 5.0) && (!(rate.getReduced() == 20.0)))
			fail("testGetRates fails.");
	}

	@Test
	public void testSetRates() {
		if ((rate.getStandard() == null))
			fail("testSetRates fails.");
	}

}
