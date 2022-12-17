package com.example.courswork;

import java.sql.*;

public class DBcommands {
    private final String HOST = "jdbc:postgresql://localhost:5432/db_trips";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "123456";

    private Connection connection;

    public DBcommands () {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}