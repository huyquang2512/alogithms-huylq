/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3huy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ad
 */
public class product {
    String name;
    int price,quality, categoryID;
   Scanner c = new Scanner(System.in);
    public product(String name, int price, int quality, int categoryID) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryID = categoryID;
    }

    product() {
       
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
    
    public List<product> findProductByPrice(List<product> listproduct, int price){
        List<product> z = new ArrayList<>();
        for (product a : listproduct) {
            if ( a.price <= price) {
             z.add(a);
            } 
        }
        return z;
    } 
    public void print(List<product> products){
        for (product temp : products) {
             System.out.println("Name : " + temp.name + "  Price : " + temp.price + "  Quality : " + temp.quality+ "  CategoryID : " + temp.categoryID ); 
        }
}
     }
