package com.nespralnic.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    public static Statement connect(){
        String url = "jdbc:mysql://localhost:3306/javatest";
        String username = "root";
        String password = "";
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement(); 
           
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return statement;
    }
}
