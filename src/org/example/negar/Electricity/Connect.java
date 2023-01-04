package org.example.negar.Electricity;

import java.sql.*;

public class Connect {
    Connection c;
    Statement s;

    public Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "8603");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
