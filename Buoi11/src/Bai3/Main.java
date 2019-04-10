/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Main {
    public static void main(String[] args) {
        TaskManager TaM=new TaskManager();
        Scanner sc=new Scanner(System.in);
         int chon;
          TaM.save();
        TaM.loadfile();
         
        do{
            System.out.println("------TODO App------");
            System.out.println("1. Load tasks");
            System.out.println("2. Show tasks");
            System.out.println("3. Create new task");
            System.out.println("4. Filter by Status ");
            System.out.println("5. Update Status");
            System.out.println("6. View Detail");
            System.out.println("7. Exit");
            System.out.print("Mời Bạn Chon Chức Năng:");
           
            chon=sc.nextInt();
            switch(chon){
                case 1:{
                    System.out.println("sssssssss");
                
                
                }      break;         
                case 2:{
                     TaM.loadfile();
                    TaM.showAll();
                    
                }      break;
                case 3:{
                    System.err.println("Chưa có chức năng này!!!");
                    
                }      break;
                case 4:{
                    System.err.println("Chưa có chức năng này!!!");
                    
                }      break;
                case 5:{
                     System.err.println("Chưa có chức năng này!!!");
                    
                }      break;
                case 7:{
                    System.out.println("Thanks you.");
                    
                }      break;
                case 6:{
                    TaM.detail();
                }     break;
                default:
                    System.err.println("Bạn chọn sai chức năng!!!");
            }
            

        }while(chon!=7);
    }
    
}
