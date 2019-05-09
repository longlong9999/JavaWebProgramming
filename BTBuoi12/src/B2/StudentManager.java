/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class StudentManager {
    Student st=new Student();
    ArrayList<Student> al=new ArrayList<>();
    
    public void Add(){
        System.out.println("Thêm mới:");
         String rollnumber;
         Scanner sc=new Scanner(System.in);
       if{
           
          do{
              System.out.println("Nhập rollnumber:");
           rollnumber=sc.nextLine();
              for (int i = 0; i < 10; i++) {
                   if(rollnumber==st.getRollnumber()){
               System.err.println("Đã tồn tại!!!");
           }
              }             
          }while(rollnumber!= st.getRollnumber()); 
       }
       else{
               System.out.println("Nhập name:");
               st.setName(sc.nextLine());
               System.out.println("Nhập dop:");
               st.setDob(sc.nextLine());
               System.out.println("Nhập email:");
               st.setEmaill(sc.nextLine());
           }       
    }  
    
    public void SearchName(){
        System.out.println("Mời bạn nhập tên cần tìm kiếm:");
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        if(name==st.getName()){
            System.out.println("Thông tin student.");
            System.out.println("|Rollnumber| Name          |Dop  |Emaill    |");
            System.out.println("|%-10s|%-15s|%-5s|%-10s",st.getRollnumber(),st.getName(),st.getDob(),st.getEmaill());
        }
     
   }

}
