/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clieford;/**

/**
 *
 * @author PC-6
 */

import java.time.LocalDate;
        
public class Employee {
    String empName;
    int empSalary;
    LocalDate empDate;
    
    
    Employee(String empName, int empSalary, LocalDate empDate){
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDate = empDate;
    }
/*
    Employee(String Roberta_petrus, String string, int i) {
         }
   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  */  
    String getEmpName(){
        return empName;
    }
    
    int getEmpSalary(){
        return empSalary;
    }
    LocalDate getEmpDate(){
        return empDate;
    }
}
