/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;



/**
 *
 * @author Thanh Long
 */
public class Student {
    private String rollnumber;
    private String name;
   private String dob;
    private String emaill;

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public Student() {
    }

    public Student(String rollnumber, String name, String dob, String emaill) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.dob = dob;
        this.emaill = emaill;
    }
    
    
}
