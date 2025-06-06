/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1.java;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Grace;
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String datenow = sdf.format(new Date());
        LocalTime time = LocalTime.now();
        
        // INPUT TIME-IN
        System.out.println("Monday");
        System.out.println("Time in: ");
        Scanner user = new Scanner(System.in);
        String user_in = user.nextLine();
        System.out.println("Time out: "); 
        Scanner user2 = new Scanner(System.in);
        String user_out = user2.nextLine(); 
        
        String[] timein = user_in.split(":"); // "8:30" > ["8","30"]
        String[] timeout = user_out.split(":");
        
        int timein_hours = Integer.parseInt(timein[0]); // "8" > 8
        int timein_mins = Integer.parseInt(timein[1]); // "30" > 30
        
        int timeout_hours = Integer.parseInt(timeout[0]);
        int timeout_mins = Integer.parseInt(timeout[1]);
        
        LocalTime start = LocalTime.of(timein_hours,timein_mins,0); // 08:30:00
        LocalTime end = LocalTime.of(timeout_hours,timeout_mins,0);
        
        Duration time_dur = Duration.between(start,end);
        
        long Diff_hours = time_dur.toHours()-1;
        long Diff_mins = time_dur.toMinutes() % 60;
        
        System.out.println("Tuesday"); 
        System.out.println("Time in: "); 
        Scanner user3 = new Scanner(System.in);
        String user_in2 = user3.nextLine();
        System.out.println("Time out: ");
        Scanner user4 = new Scanner(System.in);
        String user_out2 = user4.nextLine();   
        
        String[] timein2 = user_in2.split(":");
        String[] timeout2 = user_out2.split(":");
        
        int timein_hours2 = Integer.parseInt(timein2[0]);
        int timein_mins2 = Integer.parseInt(timein2[1]);
        
        int timeout_hours2 = Integer.parseInt(timeout2[0]);
        int timeout_mins2 = Integer.parseInt(timeout2[1]);
        
        LocalTime start2 = LocalTime.of(timein_hours2,timein_mins2,0);
        LocalTime end2 = LocalTime.of(timeout_hours2,timeout_mins2,0);
        
        Duration time_dur2 = Duration.between(start2,end2);
        
        long Diff_hours2 = time_dur2.toHours()-1;
        long Diff_mins2 = time_dur2.toMinutes() %60;
        
        System.out.println("Wednesday"); 
        System.out.println("Time in: "); 
        Scanner user5 = new Scanner(System.in);
        String user_in3 = user5.nextLine();
        System.out.println("Time out: ");
        Scanner user6 = new Scanner(System.in);
        String user_out3 = user6.nextLine();  
        
        String[] timein3 = user_in3.split(":");
        String[] timeout3 = user_out3.split(":");
        
        int timein_hours3 = Integer.parseInt(timein3[0]);
        int timein_mins3 = Integer.parseInt(timein3[1]);
        
        int timeout_hours3 = Integer.parseInt(timeout3[0]);
        int timeout_mins3 = Integer.parseInt(timeout3[1]);
        
        LocalTime start3 = LocalTime.of(timein_hours3,timein_mins3,0);
        LocalTime end3 = LocalTime.of(timeout_hours3,timeout_mins3,0);
        
        Duration time_dur3 = Duration.between(start3,end3);
        
         long Diff_hours3 = time_dur3.toHours()-1;
        long Diff_mins3 = time_dur3.toMinutes() % 60;
        
        System.out.println("Thursday"); 
        System.out.println("Time in: "); 
        Scanner user7 = new Scanner(System.in);
        String user_in4 = user7.nextLine();
        System.out.println("Time out: ");
        Scanner user8 = new Scanner(System.in);
        String user_out4 = user8.nextLine(); 
        
        String[] timein4 = user_in4.split(":");
        String[] timeout4 = user_out4.split(":");
        
        int timein_hours4 = Integer.parseInt(timein4[0]);
        int timein_mins4 = Integer.parseInt(timein4[1]);
        
        int timeout_hours4 = Integer.parseInt(timeout4[0]);
        int timeout_mins4 = Integer.parseInt(timeout4[1]);
        
        LocalTime start4 = LocalTime.of(timein_hours4,timein_mins4,0);
        LocalTime end4 = LocalTime.of(timeout_hours4,timeout_mins4,0);
        
        Duration time_dur4 = Duration.between(start4,end4);
        
        long Diff_hours4 = time_dur4.toHours()-1;
        long Diff_mins4 = time_dur4.toMinutes() % 60;
        
        System.out.println("Friday"); 
        System.out.println("Time in: "); 
        Scanner user9 = new Scanner(System.in);
        String user_in5 = user9.nextLine();
        System.out.println("Time out: ");
        Scanner user10 = new Scanner(System.in);
        String user_out5 = user10.nextLine();  
        
        String[] timein5 = user_in5.split(":");
        String[] timeout5 = user_out5.split(":");
        
        int timein_hours5 = Integer.parseInt(timein5[0]);
        int timein_mins5 = Integer.parseInt(timein5[1]);
        
        int timeout_hours5 = Integer.parseInt(timeout5[0]);
        int timeout_mins5 = Integer.parseInt(timeout5[1]);
        
        LocalTime start5 = LocalTime.of(timein_hours5,timein_mins5,0);
        LocalTime end5 = LocalTime.of(timeout_hours5,timeout_mins5,0);
        
        Duration time_dur5 = Duration.between(start5,end5);
        
        long Diff_hours5 = time_dur5.toHours()-1;
        long Diff_mins5 = time_dur5.toMinutes() % 60;
        
        String emp_name = "Jacklyn, Tolentino";
        int emp_id = 10025;
        double Salary_hours = (Diff_hours + Diff_hours2 + Diff_hours3 + Diff_hours4 + Diff_hours5) * 142.86;
        double Salary_mins = Diff_mins + Diff_mins2 + Diff_mins3 + Diff_mins4 + Diff_mins5 * (142.86 / 60);
        double Duration_hours = Diff_hours + Diff_hours2 + Diff_hours3 + Diff_hours4 + Diff_hours5;
        double Duration_mins = Diff_mins + Diff_mins2 + Diff_mins3 + Diff_mins4 + Diff_mins5;
        double Total_Salary = Salary_hours + Salary_mins;
        double Rice_allowance = 1500;
        double Phone_allowance = 500;
        double clothing_allowance = 500;
        double SSS = 250;
        double Philhealth = Total_Salary * 0.05;
        double tax = Total_Salary * 0.15;
        double Pagibig = Total_Salary * 0.02;
        double Allowance = (Rice_allowance + Phone_allowance + clothing_allowance)/4;
        double Total = Philhealth + tax + Pagibig + SSS;
        double Total_deduction = Total;
               
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Hours Worked: " + Duration_hours + " hours " + Duration_mins + " minutes");
        System.out.println("Gross Salary: " + Total_Salary);
        System.out.println("Deminimis: " + Allowance);
        System.out.println("Social Security: " + SSS);
        System.out.println("Philhealth: " + Philhealth);
        System.out.println("Pag-ibig: " + Pagibig);
        System.out.println("Income Tax: " + tax);
        System.out.println("Total Deduction: " + Total_deduction);
        System.out.println("Net Pay:");
        System.out.println(Salary_hours + Salary_mins + Allowance - Total_deduction);
        System.out.println("Date: " + datenow + " Time: " + time);
    }
}