/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Students {
    private int id;
    private String name;
    private String email;
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  
    
    public Students() {
    }

    public Students(int id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }
    public void login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("QUIZ ONLINE");
        System.out.println("-----------------");
        System.out.println("Enter email:");
        this.email=sc.nextLine();
        System.out.println("Enter pass");
        this.pass = sc.nextLine();
    }
    public Students status(String email, String pass) throws Exception{
         DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "select * from students "+              
                "where students.email = ? and students.pass = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();
        Students s=null;
        if(rs.next()){
            s=new Students(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("pass"));
        }
        return s;
    }
   
    public int addAnswer(Students s, Questions q,String answer) throws SQLException, Exception{
         DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String query ="INSERT INTO students_questions VALUES (?,?,?)";
        PreparedStatement pst=conn.prepareStatement(query);
        pst.setInt(1, s.getId());
        pst.setInt(2, q.getId());
        pst.setString(3, answer);
        return pst.executeUpdate();
    }
    
    

    
}
