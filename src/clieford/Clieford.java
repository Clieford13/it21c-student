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
import java.time.LocalDate;
public class Clieford {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Employee Employee1 = new Employee("Roberta petrus", 50000, LocalDate.parse("2021-04-01"));
       
       System.out.println(Employee1.empName +" "+Employee1.empSalary +" "+Employee1.getEmpDate() );
           
       }
           
    }
    

