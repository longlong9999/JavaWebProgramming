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
public class Employee extends person{
    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    @Override
    public void input(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Nhập salary:");
        setSalary(sc.nextLine());
    }
}
