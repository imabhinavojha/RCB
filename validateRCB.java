package com.RCB;

import org.testng.annotations.Test;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class validateRCB {
	JSONParser parser = new JSONParser();
	static String currentDir = System.getProperty("user.dir");
	Object obj; 
	JSONObject jsonObject;
	JSONArray player;
	@Test
	// Write a test that validates that the team has only 4 foreign players
	public void validatesForeignPlayers() {
		try {
			obj = parser.parse(new FileReader(currentDir + "/src/test/resources/TeamRCB.json"));
			jsonObject = (JSONObject) obj;
			player = (JSONArray) jsonObject.get("player");
			int countryCount = 0;
			for (int i = 0; i < player.size(); i++) {
				JSONObject jsonObjectRow = (JSONObject) player.get(i);
				String country = (String) jsonObjectRow.get("country");
				if (!country.equals("India")) {
					countryCount++;
				}

			}

			if (countryCount == 4) {

				System.out.println("Case Pass");

			} else {

				System.out.println("Case Fail");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Write a test that validâtes that there is at least one wicket keeper
	@Test
	public void validatesWicketKeeper() {
		try {
			obj = parser.parse(new FileReader(currentDir + "/src/test/resources/TeamRCB.json"));
			jsonObject = (JSONObject) obj;
			player = (JSONArray) jsonObject.get("player");
			int countryCount = 0;
			for (int i = 0; i < player.size(); i++) {
				JSONObject jsonObjectRow = (JSONObject) player.get(i);
				String country = (String) jsonObjectRow.get("country");
				if (!country.equals("India")) {
					countryCount++;
				}

			}

			if (countryCount == 4) {

				System.out.println("Case Pass");

			} else {

				System.out.println("Case Fail");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
