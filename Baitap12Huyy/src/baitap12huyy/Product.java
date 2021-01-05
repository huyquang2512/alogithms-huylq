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
    public List<Product> sortName(List<Product> productList)
        {
            String name;
            int length;
            for (int i = 1; i < productList.size(); i++)
            {
                name = productList.get(i).name;
                length = i;
                while (length > 0 && productList.get(length - 1).name.length() < name.length())
                {
                    productList.get(length).name = productList.get(length - 1).name;
                    length--;
                }
                if (length != i)
                {
                    productList.get(length).name = name;
                }
            }
            return productList;
        }
        public void find(List<Product> productList)
        {
            for (int i = 0; i < productList.size(); i++)
            {
                System.out.println(" " + productList.get(i).name);
            }
        }

}
