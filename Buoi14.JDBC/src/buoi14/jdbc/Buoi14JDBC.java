/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14.jdbc;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Long
 */
public class Buoi14JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/qlithuvien";
        Connection conn = DriverManager.getConnection(connStr, "root", "nguyenlong30111999");

        if (conn != null) {
            System.out.println("Ket noi thanh cong");
            System.out.println("Ket noi thanh cong");
            System.out.println("------------------");
            //-- Sau khi ket noi thanh cong
            Statement stmt = conn.createStatement();
            // -- insert du lieu
//                Book b = new Book("B0009", "Dao duc", "Khong biet", "Giao khoa", 11);
           // String insertQuery = "INSERT INTO SACH(masach, ten, tacgia, nxb, soluong) "
          //          + "VALUES(?,?,?,?,?)";
           // PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            //pstmt.setString(1, b.getCode());
           // pstmt.setString(2, b.getName());
           // pstmt.setString(3, b.getAuthor());
            //pstmt.setString(4, b.getPublisher());
            //pstmt.setInt(5, b.getQuantity());
           // int rowsUpdated = pstmt.executeUpdate();

            //                String insertQuery = "INSERT INTO SACH(masach, ten, tacgia, nxb, soluong) "
//                        + "VALUES('" + b.getCode() + "', "
//                        + "'" + b.getName() + "', "
//                        + "'" + b.getAuthor() + "', "
//                        + "'" + b.getPublisher() + "', " + b.getQuantity() + ")";
//                int rowsUpdated = stmt.executeUpdate(insertQuery);
           // System.out.println("Row: " + rowsUpdated);
            //System.out.println("------------------");
            // -- thuc hien cau lenh select va hien thi du lieu
           // ResultSet rs = stmt.executeQuery("SELECT * FROM SACH");

            //while (rs.next()) {

            //    System.out.println(rs.getString("ten")
               //         + " , " + rs.getString(3)
                //        + " , " + rs.getInt("soluong"));
           // }

        } else {
            System.out.println("Ket noi that bai");
        }
    }
}

