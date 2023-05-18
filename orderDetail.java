/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi4;

/**
 *
 * @author Admin
 */
public class orderDetail {
 
    private int quantity;
private product Product; 


    public orderDetail(product Product, int quantity) {
        this.quantity = quantity;
        this.Product = Product;
    }
public double calcTotalPrice(){
    return quantity*Product.getPrice();
}

    @Override
    public String toString() {
        return "ma SP" +""+      "mo ta"+"" +               "Don gia"+ "" +   "s. Luong"  +"thanh tien"
      + Product.getProductID() + Product.getDescription() + Product.getPrice()  + quantity + quantity*Product.getPrice() +'}';
    }
   
    
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  public product getProduct(){
      return Product;
  }

}
