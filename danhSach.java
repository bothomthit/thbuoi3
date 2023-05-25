/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhSach {
     public ArrayList<phongHoc> list =new ArrayList<>();
    public void Nhap(){
        System.out.println("Nhap ten vao danh sach");
        Scanner sc=new Scanner(System.in);
        int i=1;
        do{
            System.out.print("phong hoc ");
            System.out.println("day nha");
            int maPhong = sc.nextInt();
            String dayNha = sc.nextLine();
            int soBongDen = sc.nextInt();
            float dienTich = sc.nextFloat();
            float bongDenTB = sc.nextFloat();
            list.add(new phongHoc( maPhong, dayNha,  dienTich,  soBongDen,  bongDenTB));
            sc.nextLine();
            i++;
        }while(true);
    }
    public void Xuat()
    {
        System.out.println("Danh sach phong hoc:");
        System.out.println("ma phong\t\t|day nha");
        for(phongHoc Phonghoc:list){
            System.out.printf("%20s| %.2f\n",Phonghoc.getMaPhong(),Phonghoc.getDayNha(), Phonghoc.getSoBongDen(),Phonghoc.getDienTich(),Phonghoc.getBongDenTB());
    }
    }
 
    }

