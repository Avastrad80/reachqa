package com.strategizeqa.base;

import com.strategizeqa.utility.PropUtil;

public class Config {

	public String getAppUrl() {
		String env = System.getProperty("env");
		if (env==null) {
			env = "qa";
		} else if (env.isEmpty())
			env = "qa";

		PropUtil prop = new PropUtil();
		String url = prop.getProperty("/src/main/resources/application.properties", env + ".url");
		return url;
	}

}
