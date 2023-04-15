package com.strategizeqa.base;

import com.strategizeqa.utility.PropUtil;

public class Config {

	public String getAppUrl() {
		String env = System.getProperty("env");
		if (env==null) {
			env = "stage";
		} else if (env.isEmpty())
			env = "stage";

		PropUtil prop = new PropUtil();
		String url = prop.getProperty("/src/main/resources/application.properties", env + ".url");
		return url;
	}
	
	
	
	public String getUsername() {
        String env = System.getProperty("env");
        if (env == null) {
            env = "stage";
        } else if (env.isEmpty()) 
            env = "stage";
        
        
        PropUtil prop = new PropUtil();
        String username = prop.getProperty("/src/main/resources/application.properties", env + ".username");
        return username;
    }

    public String getPassword() {
        String env = System.getProperty("env");
        if (env == null) {
            env = "stage";
        } else if (env.isEmpty()) 
            env = "stage";
        
        
        PropUtil prop = new PropUtil();
        String password = prop.getProperty("/src/main/resources/application.properties", env + ".password");
        return password;
    }

}
