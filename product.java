/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi4;

/**
 *
 * @author Admin
 */
public class product {
  public String description ;

    private String productID;
    
    private double price;

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Get the value of productID
     *
     * @return the value of productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Set the value of productID
     *
     * @param productID new value of productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }

    public product() {
    }

    public product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
  
}
