/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thanh Long
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Scanner sc=new Scanner(System.in);
             Students s =new Students();
             
             Questions que=new Questions();
             
            
        s.login();
            s.status(email, pass);
       
        if(s!=null){
            System.out.println("Thành Công ");
            sc.nextLine();
            List<Questions> questions=que.getQuestionses();
            int index=1;
            int dem=0;
            for(Questions q: questions){
                System.out.printf("Question %d/%d",index++,questions.size());
                System.out.println(q);
                System.out.println("Your answer:");
                String answer =sc.nextLine();
                s.addAnswer(s, q, answer);
                if(answer.toLowerCase().equals(q.getCorrect().toLowerCase())){
                    dem++;
                }
            }
            System.out.println("Chúc mứng bạn đã trả lời đúng");
            System.out.printf("Your result %d/%d :",dem,questions.size());
            
            
        }else{
            System.err.println("Nhập sai rồi!!!");
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
    }
    
}
