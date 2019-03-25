/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Student extends person {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào email:");
        setEmail(sc.nextLine());
    }
    
    
}
