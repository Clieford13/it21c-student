/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clieford;/**
 *
 * @author PC-6
 */
public class Student {
   public String name,section,motto;
    
    Student(String name, String section, String motto){
        this.name = name;
         this.section = section;
          this.motto = motto;
    }
    
   public String getName(){
        return name;
    }
   public String getSection(){
        return section;
    }
   public String getMotto(){
        return motto;
    }
}
