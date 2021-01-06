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
public class Baitap21Huy {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Salary  :");
        int salary = a.nextInt();
        System.out.println("year : ");
        int year = a.nextInt();
        System.out.println("Category : "+caSalary(salary, year));

    }

    public static float caSalary(int Salary, int n) {
        float luong = Salary;
        for (int i = 1; i <= n; i++) {
            luong = luong + (luong/10);
        }
        return luong;
    }
}
