/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package thbuoi4;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class order {
    
    private int orderID;

    private LocalDate orderDate;
    
    private int count;
    private orderDetail[] lineItems;

    public order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new
            orderDetail[20];
        this.count = 0;
    }
public void addLineItems(product Product, int quantity){
    lineItems[count]= new
        orderDetail(Product,quantity);
    count++;
}
public double calcTotalCharge(){
    double totalCharge = 0;
    for(int i=0; i<count; i++){
    totalCharge +=
            lineItems[i].calcTotalPrice();
    }
    return totalCharge;
}

    @Override
    public String toString() {
        return "Ngay HD"  + orderID 
     + "Ngay lap hoa don" + orderDate 
    + ", count=" + count + ", lineItems=" + Arrays.toString(lineItems) + '}';
    }

    
    public int getCount() {
        return count;
    }

    /**
     * Set the value of count
     *
     * @param count new value of count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Get the value of orderDate
     *
     * @return the value of orderDate
     */
    public LocalDate getOrderDate() {
        return orderDate;
    }

    /**
     * Set the value of orderDate
     *
     * @param orderDate new value of orderDate
     */
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Get the value of orderID
     *
     * @return the value of orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Set the value of orderID
     *
     * @param orderID new value of orderID
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

}
