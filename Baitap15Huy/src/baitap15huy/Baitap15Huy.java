/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap15huy;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ad
 */
public class Baitap15Huy {
    
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("CPU", 750, 10, 1));
        products.add(new Product("RAM", 50, 2, 2));
        products.add(new Product("HDD", 70, 1, 2));
        products.add(new Product("MAIN", 400, 3, 1));
        products.add(new Product("KEYBROARD", 30, 8, 4));
        products.add(new Product("MOUSE", 25, 50, 4));
        products.add(new Product("VGA", 60, 35, 3));
        products.add(new Product("MONITOR", 120, 28, 2));
        products.add(new Product("CASE", 120, 28, 5));
        Product zxc = new Product();
        zxc.print(zxc.minByPrice(products));
    } 
    
}
