/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2huy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ad
 */
public class Baitap2Huy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<product> list = new ArrayList<product>();
        list.add(new product("CPU", 750, 10, 1));
        list.add(new product("RAM", 50, 2, 2));
        list.add(new product("HDD", 70, 1, 2));
        list.add(new product("MAIN", 400, 3,   1));
        list.add(new product("KEYBROARD", 30, 8, 4));
        list.add(new product("MOUSE", 25, 50, 4));
        list.add(new product("VGA", 60, 35, 3));
        list.add(new product("MONITOR", 120, 28, 2));
        list.add(new product("CASE", 120, 28, 5));
        product pr = new product();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào CaretogyID : ");
        int soNhap = nhap.nextInt();
        pr.print(pr.findProductByCategoryID(list, soNhap));
    };
  
}
