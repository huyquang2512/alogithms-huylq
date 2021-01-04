/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3huy;

import java.util.ArrayList;

/**
 *
 * @author Ad
 */
public class Baitap3Huy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<product> b = new ArrayList<product>();
        b.add(new product("CPU", 750, 10, 1));
        b.add(new product("RAM", 50, 2, 2));
        b.add(new product("HDD", 70, 1, 2));
        b.add(new product("MAIN", 400, 3, 1));
        b.add(new product("KEYBROARD", 30, 8, 4));
        b.add(new product("MOUSE", 25, 50, 4));
        b.add(new product("VGA", 60, 35, 3));
        b.add(new product("MONITOR", 120, 28, 2));
        b.add(new product("CASE", 120, 28, 5));
        product pr = new product();
        pr.findProductByPrice(b, 1);
    }
    
}
