/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Nawal Khan
 */
public class Week5Driver {
    public static void main(String a[]){
        ProductCatalog c = new ProductCatalog();
        c.addProduct(123, "Murree Brewery Water bottle", 30, "Grocery");
        c.addProduct(567,"Cola Next", 50, "Grocery");
        c.addProduct(678,"Gala",25,"Grocery");
        System.out.println(c);
                
    }
}
