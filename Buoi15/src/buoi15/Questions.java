/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thanh Long
 */
public class Questions {
    private int id;
    private String content;
    private String answer_a;
    private String answer_b;
    private String answer_c;
    private String answer_d;
    private String correct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer_a() {
        return answer_a;
    }

    public void setAnswer_a(String answer_a) {
        this.answer_a = answer_a;
    }

    public String getAnswer_b() {
        return answer_b;
    }

    public void setAnswer_b(String answer_b) {
        this.answer_b = answer_b;
    }

    public String getAnswer_c() {
        return answer_c;
    }

    public void setAnswer_c(String answer_c) {
        this.answer_c = answer_c;
    }

    public String getAnswer_d() {
        return answer_d;
    }

    public void setAnswer_d(String answer_d) {
        this.answer_d = answer_d;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public Questions() {
    }

    public Questions(int id, String content, String answer_a, String answer_b, String answer_c, String answer_d, String correct) {
        this.id = id;
        this.content = content;
        this.answer_a = answer_a;
        this.answer_b = answer_b;
        this.answer_c = answer_c;
        this.answer_d = answer_d;
        this.correct = correct;
    }
    public List<Questions> getQuestionses() throws Exception{
        //1 Kết nối dtb
        DBConnector db=new DBConnector();
        Connection conn=db.getConnect();
        //2.Tạo lệnh truy vấn
        String sql="SELECT * FROM questions";
        //3Thực thi truy vấn
        PreparedStatement pt=conn.prepareStatement(sql);
        ResultSet rs=pt.executeQuery(sql);
        //4 Duyệt kết quả và add vào list
        List<Questions> list=new ArrayList<>();
        while(rs.next()){
            Questions q=new Questions();
            q.setId(rs.getInt("id"));
            q.setAnswer_a(rs.getString("answer_a"));
            q.setAnswer_b(rs.getString("answer_b"));
            q.setAnswer_c(rs.getString("answer_c"));
            q.setAnswer_d(rs.getString("answer_d"));
            q.setContent(rs.getString("content"));
            q.setCorrect(rs.getString("Correct"));
            list.add(q);
           
            
        }
        
        
        return list;
        
    }
    
     public String toString(){
        StringBuffer builder=new StringBuffer();
        builder.append(this.content);
       
        builder.append("\nA." +this.answer_a);
        builder.append("\nB." +this.answer_b);
        builder.append("\nC." +this.answer_c);
        builder.append("\nD." +this.answer_d);
        builder.append("\n");

        return builder.toString();
        
    }
    
    

}
