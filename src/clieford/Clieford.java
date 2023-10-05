/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clieford;

/**
 *
 * @author PC-6
 */
public class Clieford {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("clieford","it21c","life is good");
        
        System.out.println(student1.getName());
        System.out.println(student1.getSection());
        System.out.println(student1.getMotto());
        // TODO code application logic here
    }
    
}
