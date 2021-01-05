/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap12huyy;

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
 int i,j;
    public List<Product> insertion(ArrayList<Product> productlist) 
      {
          
      }
    public void print(ArrayList<Product> product){
        for(Product temp : product){
         System.out.print(temp.price + "    ");
  }
    }

}
