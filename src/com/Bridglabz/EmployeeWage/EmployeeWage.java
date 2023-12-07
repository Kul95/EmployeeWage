package com.Bridglabz.EmployeeWage;
/*
@Desc: Employee wage problem,
       Use case one check Employee is present or absent.,
       Daily Employee Wage,
       Part time Employee Wagew.
@Params: Variable  number of employee
 */
public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 30;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Employee Wage: " + totalEmpWage);

    }
}