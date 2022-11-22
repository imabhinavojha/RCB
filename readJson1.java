package com.TestVagrant;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class readJson1 {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			String currentDir = System.getProperty("user.dir");
			Object obj = parser.parse(new FileReader(currentDir + "/src/main/java/com/TestVagrant/TeamRCB.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray player = (JSONArray) jsonObject.get("player");
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