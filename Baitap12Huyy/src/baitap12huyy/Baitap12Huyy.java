/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap12huyy;

import java.util.ArrayList;

/**
 *
 * @author Ad
 */
public class Baitap12Huyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("CPU", 750, 10, 1));
        list.add(new Product("RAM", 50, 2, 2));
        list.add(new Product("HDD", 70, 1, 2));
        list.add(new Product("MAIN", 400, 3, 1));
        list.add(new Product("KEYBROARD", 30, 8, 4));
        list.add(new Product("MOUSE", 25, 50, 4));
        list.add(new Product("VGA", 60, 35, 3));
        list.add(new Product("MONITOR", 120, 28, 2));
        list.add(new Product("CASE", 120, 28, 5));
        Product product = new Product();
        product.find(product.sortName(list));
    }
    
}
