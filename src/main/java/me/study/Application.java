package me.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username = "dongchul";
        String password = "PASS";

        // try with resource java 8
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection created : " + connection);
        }

    }
}
