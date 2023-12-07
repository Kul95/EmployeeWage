package com.Bridglabz.EmployeeWage;
/*
@Desc: Employee wage problem,
       Use case one check Employee is present or absent.
@Params: Variable  number of employee
 */
public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is not present");
        }
    }
}
