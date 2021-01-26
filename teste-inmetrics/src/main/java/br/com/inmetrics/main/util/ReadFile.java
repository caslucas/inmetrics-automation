package br.com.inmetrics.main.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

public class ReadFile {

	public String readFile(String field) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/test/resources/user.json"));
		String newField;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String json = sb.toString();
			JSONObject j = new JSONObject(json);

			newField = j.getString(field);
		} finally {
			br.close();
		}
		return newField;
	}
}
