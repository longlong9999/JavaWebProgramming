/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thanh Long
 */
public class DBConnector {
     public Connection getConnect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/qlithuvien";
        Connection conn = DriverManager.getConnection(conStr, "root", "nguyenlong30111999");
        return conn;
    }
}
