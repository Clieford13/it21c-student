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
public class Employee {
    String empName;
    int empSalary;
    
    Employee(String empName, int empSalary){
        this.empName = empName;
        this.empSalary = empSalary;
    }
    
    String getEmpName(){
        return empName;
    }
    
    int getEmpSalary(){
        return empSalary;
    }
    
}
