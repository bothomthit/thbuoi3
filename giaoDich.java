/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoicuoi;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class giaoDich {
    
    int maGiaoDich;

    String ngayGiaoDich;

    float donGia;

    float dientich;
Scanner sc = new Scanner(System.in);
    
    public float getDientich() {
        return dientich;
    }

   
    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    /**
     * Get the value of donGia
     *
     * @return the value of donGia
     */
    public float getDonGia() {
        return donGia;
    }

    /**
     * Set the value of donGia
     *
     * @param donGia new value of donGia
     */
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    /**
     * Get the value of ngayGiaoDich
     *
     * @return the value of ngayGiaoDich
     */
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    /**
     * Set the value of ngayGiaoDich
     *
     * @param ngayGiaoDich new value of ngayGiaoDich
     */
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    /**
     * Get the value of maGiaoDich
     *
     * @return the value of maGiaoDich
     */
    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    /**
     * Set the value of maGiaoDich
     *
     * @param maGiaoDich new value of maGiaoDich
     */
    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public giaoDich() {
        super();
    }

    public giaoDich(int maGiaoDich, String ngayGiaoDich, float donGia, float dientich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dientich = dientich;
    }
    public void nhap(){
        System.out.println("nhap ma giao dich");
        maGiaoDich = sc.nextInt();
        System.out.println("nhap ngay giao dich");
        ngayGiaoDich = sc.nextLine();
        System.out.println("nhap vaodon gia");
        donGia = sc.nextFloat();
        System.out.println("nhap dien tich dat");
        dientich = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "giaoDich{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dientich=" + dientich + '}';
    }

}
