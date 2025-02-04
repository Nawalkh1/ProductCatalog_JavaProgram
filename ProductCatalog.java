/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.ArrayList;
/**
 *
 * @author Nawal khan 
 */
public class ProductCatalog {
    private ArrayList<Product> catalog = new ArrayList<Product>();
    
    public void addProduct(Product p){
        catalog.add(p);
    }
    public void addProduct(int code, String desc, double price, String cat){
          addProduct(new Product(code, desc, price, cat));
    }
    public Product searchByDescrition(String desc){
       
      for(Product p: catalog){
          if(p.getDescription().equalsIgnoreCase(desc))
              return p;
      }
        return null;
    }
    public boolean remove(int code){
        for(int i=0;i<catalog.size();i++){
            if(catalog.get(i).getCode() == code ){
                catalog.remove(i);
                return true;
            }
        }
        return false;
        
    }
    
    
    public boolean remove(Product p){
        return remove(p.getCode());
    }
    
    public String toString(){
        String s= "";
        for(int i=0;i<catalog.size();i++){
            s = s + "\n" + catalog.get(i);
        }
        return s;
        
    }
    
    
}
