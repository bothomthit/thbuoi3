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
          public void sapTheoDayNha() {
        Collections.sort(danhSach, (phong1, phong2) -> phong1.getDayNha().compareTo(phong2.getDayNha()));
        System.out.println("danh sach da duoc xep.");
    }

    public void sapTheoDienTich() {
        Collections.sort(danhSach, (phong1, phong2) -> Double.compare(phong1.getDienTich(), phong2.getDienTich()));
        System.out.println("danh sach da duoc xep");
    }

    public void sapTheoSoBongDen() {
        Collections.sort(danhSachPhong, (phong1, phong2) -> Integer.compare(phong1.getSoBongDen(), phong2.getSoBongDen()));
        System.out.println("danh sach da duoc xep");
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        for (phongHoc phong : danhSach) {
            if (phong instanceof PhongMayTinh && phong.getMaPhong().equals(maPhong)) {
                ((PhongMayTinh) phong).setSoMayTinh(soMayTinh);
                System.out.println("danh sach da duoc xep.");
                return;
            }
        }
        System.out.println(" " + maPhong);
    }

    public void xoaPhong(String maPhong) {
        Iterator<phongHoc> iterator = danhSach.iterator();
        while (iterator.hasNext()) {
            phongHoc phong = iterator.next();
            if (phong.getMaPhong().equals(maPhong)) {
                iterator.remove();
                System.out.println("xoa thanh cong.");
                return;
            }
        }
        System.out.println( " null " + maPhong);
    }

    public void inTongSoPhong() {
        System.out.println("Tong so phong: " + danhSach.size());
    }

    public void inDanhSachPhongMay() {
        boolean found = false;
        for (phongHoc phong : danhSach) {
            if (phong instanceof phongMayTinh && ((phongMayTinh) phong).getSoMayTinh() == 60) {
                System.out.println(phong);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay");
        }
    }
    }
 
    }

