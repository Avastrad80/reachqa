package com.reachqa.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DatabaseUtility {

    private static Connection connection;

    public static void connectToDatabase() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/test/resources/application.properties"));

            String driverClass = properties.getProperty("db.driverClass");
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void disconnectFromDatabase() {
        try {
            connection.close();
            System.out.println("Disconnected from database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}
