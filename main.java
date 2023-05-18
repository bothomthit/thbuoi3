/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thbuoi4;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     product p1= new product("Nước tương", "sp1", 18000);
        product p2 = new product("Gạo", "sp2", 18000);
        product p3 = new product("Đường", "sp3", 10000);
        product p4 = new product("Gạo", "sp4", 18000);

        order order = new order(1, LocalDate.now());
        order.addLineItems(p1, 10);
        order.addLineItems(p2, 5);
        order.addLineItems(p3, 1);
        order.addLineItems(p4, 1);

        System.out.println(order.toString());
    }
    
}
