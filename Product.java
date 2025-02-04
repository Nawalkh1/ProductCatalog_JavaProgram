/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Nawal khan 
 */
public class Product {
    private int code;
    private String description;
    private double price;
    private String category;

    public Product(int code, String description, double price, String category) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean equals(Object o){
        if( o instanceof Product){
            Product p   =(Product)o;
            return (this.code == p.code);
        }return false;
    }
    @Override
    public String toString() {
      
        return ""+code;
    }
    
    
            
}
