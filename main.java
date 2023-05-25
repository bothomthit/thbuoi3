/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thbuoi5;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        danhSach ds = new danhSach();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("\n -------MENU--------");
            System.out.println("1. them phong hoc");
            System.out.println("2.xuat danh sach phong hoc");
            System.out.println("0. Thoat");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                   System.out.println("nhap ma phong hoc");
        int maPhong = sc.nextInt();
        System.out.println("nhap vao day nha");
       String dayNha = sc.nextLine();
        System.out.println("nhap vao so bong den");
       int soBongDen = sc.nextInt();
        System.out.println("nhap dien tich phong");
       float dienTich = sc.nextFloat();
                    System.out.println("1.phong ly thuyet");
                    System.out.println("2.phong may chieu");
                    System.out.println("3.phong thi nghiem");
                    System.out.println("4.phong ly may tinh");
                    int loaiPhong = sc.nextInt();
                    sc.nextLine();
             break;
            }         
        }
    }
    
}
