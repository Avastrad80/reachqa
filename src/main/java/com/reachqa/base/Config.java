package com.reachqa.base;

import org.apache.log4j.Logger;

import com.reachqa.utility.PropUtil;

public class Config {
	private static final Logger LOG = Logger.getLogger(Config.class);
	public String getAppUrl() {
		String env = System.getProperty("env");
		if (env==null) {
			env = "stage";
		} else if (env.isEmpty())
			env = "stage";
		LOG.info("Launching URL for env: "+env);
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
        LOG.info("Entered UserName: "+username);
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
        LOG.info("Entered Passwrod:");
        LOG.info("Logged in Sucessfully");
        return password;
        
    }

}
