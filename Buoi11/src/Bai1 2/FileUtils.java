/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
 

/**
 *
 * @author Thanh Long
 */
public class FileUtils {
    
    public void CreateFile(){
        File dir=new File("C:\\Dev-Cpp");
        System.out.println("PathName:" +dir.getAbsolutePath());//Lấy đường dẫn tuyệt đối
        System.out.println("Path exists:" +dir.exists());//Kiểm tra có tồn tại k.
        System.out.println("Parent Path exists: " +dir.getParentFile().exists());
         boolean created = dir.mkdir();
        System.out.println("Directory created: " + created);
    }
    public void getfile(){
       
       File dir=new File("C:\\Dev-Cpp");
        System.out.println("PathName:" +dir.getAbsolutePath());//Lấy đường dẫn tuyệt đối
        File[] children = dir.listFiles();
        
        for (File file : children) {
             
      
         if(file.isFile()){
             System.out.println("File:"+file.getAbsolutePath());
         }
         else{
             System.out.println("Folder:"+file.getAbsolutePath());
         }
        
     
        }
    
    }
   
    
   
}
