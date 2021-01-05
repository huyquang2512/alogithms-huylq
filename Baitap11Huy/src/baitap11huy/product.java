/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap11huy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ad
 */
public class Product {

    String name;
    int price, quality, categoryID;

    public Product(String name, int price, int quality, int categoryID) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryID = categoryID;
    }

    Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void sortByPrice(ArrayList<Product> productlist) {
        Product temp;
        Product temp2;
        int i, j;
        boolean swapped = false;
        for (i = 0; i < productlist.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < productlist.size() - 1 - i; j++) {
                if (productlist.get(j).price > productlist.get(j + 1).price) {
                    temp = productlist.get(j);
                    temp2 = productlist.get(j + 1);
                    productlist.set(j, temp2);
                    productlist.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public void print(ArrayList<Product> product){
        for(Product temp : product){
         System.out.print(temp.price + "    ");
  }
    }

}
