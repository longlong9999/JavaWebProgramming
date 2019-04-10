/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class TaskManager {
    ArrayList<Task> listTask = new ArrayList<>();
    Task ta=new Task();
    Scanner sc=new Scanner(System.in);
    public void save(){
        try {
            BufferedWriter bw=null;//Khởi tạo 
            FileWriter fw=null;//khởi tạo
            String data="";// Tạo một string data bằng rỗng.
            for (int i = 0; i < listTask.size(); i++) {
               String row="";//Tạo hàng rỗng;
               row=row + listTask.get(i).getId() +"\t";
               row=row + listTask.get(i).getTitle()+"\t";
               row=row + listTask.get(i).getContent()+"\n";
               data +=row;//Cộng thêm dòng mới.
                      
            }
            fw=new FileWriter("Task.txt");
            bw=new BufferedWriter(fw);
            bw.write(data);//Lưu lại String data;
            bw.close();
            
        } catch (IOException ex) {
        }
    }
    public void loadfile() {
        try {
            BufferedReader br=null;
            FileReader fr=null;
            listTask=new ArrayList<>();
             fr = new FileReader("Task.txt");
            br = new BufferedReader(fr);
            String s=null;
            try {
                 while ((s = br.readLine()) != null) {
                    //Cắt chuỗi:
                    String arr[] = s.split("\t");
                    //Khởi tạo
                    
                    ta.setId(arr[0]);
                    ta.setTitle(arr[1]);
                    ta.setContent(arr[2]);
                    

                    
                 }
                
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException ex) {
        }
    }
    void add(){
        Task ta=new Task();
        System.out.println("Nhập ID:");
        ta.setId(sc.nextLine());
        System.out.println("Nhập Title:");
        ta.setTitle(sc.nextLine());
        System.out.println("Done:");
        ta.setDone(true);
        save();
          
        
        
    }
   
    void showAll(){
        loadfile();
        System.out.println("+=====+====================+=====+");
        System.out.println("| ID  |     TITLE          |DONE |");
        System.out.println("+=====+====================+=====+");
        for (int i = 0; i < listTask.size(); i++) {
            listTask.get(i).show();
            
        }
        System.out.println("+=====+====================+=====+");
    }
    void detail(){
        loadfile();
        Task ta=new Task();
        System.out.println("ID:");
        System.out.println("Content:");
        System.out.println("Done:");
        
        
    }
}
