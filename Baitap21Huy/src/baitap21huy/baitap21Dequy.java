/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap21huy;

import java.util.Scanner;

/**
 *
 * @author Ad
 */
public class baitap21Dequy {

    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Salary  :  ");
        int salary = a.nextInt();
        System.out.println("year : ");
        int year = a.nextInt();
        System.out.println("Category : " + caSalary(salary, year));

    }

    public static float caSalary(int Salary, int year) 
    {
        switch (year) 
        {
            case 0:
                return 0;
            case 1:
                return Salary;
            default:
                return caSalary(Salary, year-1)+(caSalary(Salary, year-1)/10);
        }
    }
}
