/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap16huy;

import java.util.ArrayList;

/**
 *
 * @author Ad
 */
public class Baitap16Huy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             ArrayList<Product> b = new ArrayList<Product>();
        b.add(new Product("CPU", 750, 10, 1));
        b.add(new Product("RAM", 50, 2, 2));
        b.add(new Product("HDD", 70, 1, 2));
        b.add(new Product("MAIN", 400, 3, 1));
        b.add(new Product("KEYBROARD", 30, 8, 4));
        b.add(new Product("MOUSE", 25, 50, 4));
        b.add(new Product("VGA", 60, 35, 3));
        b.add(new Product("MONITOR", 120, 28, 2));
        b.add(new Product("CASE", 120, 28, 5));
        Product zxc = new Product();
        zxc.print(zxc.maxByPrice(b));

    }
    
}
