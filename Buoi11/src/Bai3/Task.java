/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Thanh Long
 */
public class Task {
    private String id;
    private String title;
    private String content;
    private boolean done;

    Task() {
       
    }

    public String getId() {
        return id;
    }

    public Task(String id, String title, String content, boolean done) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.done = done;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
     public void show(){
        
        System.out.printf("|%5s| %20s| %5s|\n", getId(),getTitle(),getContent());
    }
        
    
    
    
}
