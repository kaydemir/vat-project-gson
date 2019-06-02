package com.engeto.euvat.main;

import com.engeto.euvat.dao.Vat;
import com.engeto.euvat.parser.JSONResponseParser;
import com.google.gson.Gson;

/**
 * 
 * @author <a href="mailto:kaydemir1993@gmail.com">Kemal Aydemir</a>
 *
 */
public class EuVATRateMain {

	public static void main(String[] args) {
		find(JSONResponseParser.getJSONResponse().toString());
	}

	public static void find(String json) {
		Gson gson = new Gson();
		Vat vat = gson.fromJson(json.trim(), Vat.class);
		vat.order();
		vat.printLowest(3);
		vat.printhighest(3);
	}

}
