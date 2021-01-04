/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2huy;

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
    
    public List<product> findProductByCategoryID(List<product> product, int categoryID){
        Scanner c = new Scanner(System.in);
        System.out.print("Nhập CategoryID : " );
        int category = c.nextInt();
        for (product a : product) {
            
            if (category == a.categoryID) {
                System.out.println("Name : " + a.name + "  Price : " + a.price + "  Quality : " + a.quality+ "  CategoryID : " + a.categoryID );

            } 
        }
        
        return product;
    } 
}
