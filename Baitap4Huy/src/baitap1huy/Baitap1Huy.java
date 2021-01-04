/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1huy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ad
 */
public class Baitap1Huy {
   
    public static void main(String[] args) {
              ArrayList<product> b = new ArrayList<product>();
        product product1 = new product("CPU", 750, 10, 1);
        product product2 = new product("RAM", 50, 2, 2);
        product product3 = new product("HDD", 70, 1, 2);
        product product4 = new product("MAIN", 400, 3, 1);
        product product5 = new product("KEYBROARD", 30, 8, 4);
        product product6 = new product("MOUSE", 25, 50, 4);
        product product7 = new product("VGA", 60, 35, 3);
        product product8 = new product("MONITOR", 120, 28, 2);
        product product9 = new product("CASE", 120, 28, 5);
  
        b.add(product1);
        b.add(product2);
        b.add(product3);
        b.add(product4);
        b.add(product5);
        b.add(product6);
        b.add(product7);
        b.add(product8);
        b.add(product9);
        for (product a : b) {
            if (a.name == "VGA") {
                 System.out.println(a.name + " " + a.price + " " + a.quality+ " " + a.categoryID );
            }
            
        }
      
    }
    
}
