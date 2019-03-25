/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Menu {
    
    public void menu(){
         Scanner sc=new Scanner(System.in);
  Manager epm =new EmployeeManager();
  
   
    int chon;
    do{
      
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1.Chức năng add.");
            System.out.println("2.Chức năng show.");
            System.out.println("3.Chức năng seach.");
            System.out.println("Chọn chức năng:");
             chon=sc.nextInt();
            switch(chon){
                case 1:
                    epm.add();
                    break;
                case 2:
                    epm.show();
                    break;
                    
                case 3:
                     System.out.print("Name > ");
                    String name = sc.nextLine();
                    epm.search(name);
                    break;
               
                default:
                    System.err.println("Không có chức năng");
                 
            }
          
       }while(chon!=3);
       
    }
   


}
