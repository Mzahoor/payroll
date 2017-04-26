/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**
 *
 * @author muhammadzahoor
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter employee's first name:");
       String employeeFirstName = input.next();
       
       System.out.println("Enter employee's last name:");
       String employeeLastName = input.next();
       
       System.out.println("Enter number of hours worked:");
       double hoursWorked = input.nextDouble();
       
       System.out.println("Enter hourly pay rate:");
       double payRate = input.nextDouble();
       
       double gross_pay = payRate * hoursWorked;
       
       //System.out.println("Enter withholding amount:");
       //double withholdingRate =  0.20;
       System.out.println("Enter withholding_RateIndecimal(.2):");
       double withholding_Rate= input.nextDouble();
       double withholdingAmount = withholding_Rate * gross_pay;
       
       double total_pay = gross_pay - withholdingAmount;
       
       System.out.println("Employee firstName: " + "EmployeeLastName");
       
       
       System.out.println("HoursWorked: " + hoursWorked);
       
       System.out.println("Enter payRate: " + payRate);
       
       System.out.println("Enter gross pay: " + gross_pay);
       
       System.out.println(" Deductions: ");
       System.out.println("\t Withholding_Rate: "  + withholding_Rate);
       System.out.println("\t Total deductions: " + withholdingAmount);
       System.out.println("WeeklyPay: $ " + (gross_pay - withholdingAmount));
    }  
    
}
    