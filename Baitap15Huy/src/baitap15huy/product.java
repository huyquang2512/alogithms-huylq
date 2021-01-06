/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap15huy;

import com.sun.jdi.connect.spi.Connection;
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

    public Product minByPrice(List<Product> productlist)
    {
        Product min = productlist.get(0);
        for (int i = 0; i < productlist.size(); i++)
        {
            if (productlist.get(i).price < min.price) 
            {
                min = productlist.get(i);
            }
        }
        return min;
    }

    public void print(Product productlist) 
    {
        System.out.println("name  : " + productlist.name + "  Price  : " + productlist.price + "  Quality  : " + productlist.quality + "   CategoryID  : " + productlist.categoryID);
    }
}
