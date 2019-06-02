package com.engeto.euvat;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.engeto.euvat.dao.Period;
import com.engeto.euvat.dao.PeriodRate;
import com.engeto.euvat.dao.Rate;


public class VatTest {
	
	
	List<Rate> rateList = new ArrayList<Rate>();
	Rate rate = new Rate();
	Rate rate1 = new Rate();
	
	private List<Period> periodList = new ArrayList<Period>();
	private List<Period> periodList1 = new ArrayList<Period>();

	Period period = new Period();
	Period period1 = new Period();

	PeriodRate periodRate = new PeriodRate();
	PeriodRate periodRate1 = new PeriodRate();

	
	@Test
	public void testOrder() {
		
		periodRate.setStandard(20.0);
		periodRate.setReduced(15.0);
		
		periodRate1.setStandard(22.0);
		periodRate1.setReduced(17.0);
		
		period.setRates(periodRate);
		period1.setRates(periodRate1);
		
		periodList.add(period);
		periodList1.add(period1);
		
		rate.setPeriods(periodList);
		rate1.setPeriods(periodList1);
		
		rateList.add(rate);
		rateList.add(rate1);
	
			Collections.sort(rateList);

			if (!(rateList.get(0).getPeriods().get(0).getRates().getStandard()==20.0)) {
				fail("testOrder fails.");
			}
		
		
	}


}
