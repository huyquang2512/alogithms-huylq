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
public class product {
    String name;
    int price,quality, categoryID;

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
    
    public List<product> findProductByCategoryID(List<product> listProducts, int categoryID){
     List<product> list = new ArrayList<>();
        for (product products : listProducts) {
            if (products.categoryID == categoryID) {
               list.add(products);

            } 
        }
        
        return list;
    } 
    public void print(List<product> products){
       
          for (product temp : products) {
               System.out.println("Name : " + temp.name + "  Price : " + temp.price + "  Quality : " + temp.quality+ "  CategoryID : " + temp.categoryID ); 
        }
    }
}
