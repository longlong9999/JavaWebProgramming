/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14.jdbc;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Main {
    public static void main(String[] args) {
        try {
            Process p = new Process();
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap ten sach: ");
            String name = input.nextLine();
            System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
            String date = input.nextLine();

             ResultSet rs = p.ex6(name, date);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

     }
}
