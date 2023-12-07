package com.Bridglabz.EmployeeWage;
/*
@Desc: Employee wage problem,
       Use case one check Employee is present or absent.,
       Daily Employee Wage,
       Part time Employee Wagew.
@Params: Variable  number of employee
 */
public class EmployeeWage {
    public static void main(String[] args) {
        //Constant variables
        int IS_PART_TIME=1;
        int IS_FULL_TIME = 2;
        int empRate_Per_Hour=30;
        //Variables
        int empHours=0;
        int empWage=0;
        //Condition
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_PART_TIME)
            empHours=4;
        else if(empCheck==IS_FULL_TIME)
            empHours=8;
        else
            empHours=0;
        empWage=empHours*empRate_Per_Hour;
        System.out.println("EmployeeWage: "+empWage);

    }
}
