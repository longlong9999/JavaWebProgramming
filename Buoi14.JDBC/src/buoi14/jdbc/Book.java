/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi14.jdbc;

/**
 *
 * @author Thanh Long
 */
public class Book {
     private String code;
    private String name;
    private String author;
    private String publisher;
    private int quantity;

     public Book() {
    }

     public Book(String code, String name, String author, String publisher, int quantity) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

     public String getCode() {
        return code;
    }

     public void setCode(String code) {
        this.code = code;
    }

     public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

     public String getAuthor() {
        return author;
    }

     public void setAuthor(String author) {
        this.author = author;
    }

     public String getPublisher() {
        return publisher;
    }

     public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

     public int getQuantity() {
        return quantity;
    }

     public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
