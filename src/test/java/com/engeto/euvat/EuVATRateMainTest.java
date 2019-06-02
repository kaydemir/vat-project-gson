package com.engeto.euvat;

import static org.junit.Assert.*;

import org.junit.Test;

import com.engeto.euvat.dao.Vat;
import com.engeto.euvat.parser.JSONResponseParser;
import com.google.gson.Gson;

public class EuVATRateMainTest {

	Gson gson = new Gson();
	
	@Test
	public void testMain() {
		if(JSONResponseParser.getJSONResponse()==null) {
			fail("testMain fails.");
		}
		
	}

	@Test
	public void testFind() {
		Vat vat = gson.fromJson(JSONResponseParser.getJSONResponse().toString().trim(), Vat.class);
		if(vat==null) {
			fail("testFind fails");

		}
	}

}
