/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class phongHoc {
    
    int maPhong;
    
    String dayNha;

    float dienTich;

    int soBongDen;
    
    float bongDenTB;
    

    /**
     * Get the value of bongDenTB
     *
     * @return the value of bongDenTB
     */
    public float getBongDenTB() {
        return soBongDen/dienTich;
    }

    /**
     * Set the value of bongDenTB
     *
     * @param bongDenTB new value of bongDenTB
     */
    public void setBongDenTB(float bongDenTB) {
        this.bongDenTB = bongDenTB;
    }

    Scanner sc = new Scanner(System.in);
    

    /**
     * Get the value of soBongDen
     *
     * @return the value of soBongDen
     */
    public int getSoBongDen() {
        return soBongDen;
    }

    /**
     * Set the value of soBongDen
     *
     * @param soBongDen new value of soBongDen
     */
    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    /**
     * Get the value of dienTich
     *
     * @return the value of dienTich
     */
    public float getDienTich() {
        return dienTich;
    }

    /**
     * Set the value of dienTich
     *
     * @param dienTich new value of dienTich
     */
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    /**
     * Get the value of dayNha
     *
     * @return the value of dayNha
     */
    public String getDayNha() {
        return dayNha;
    }

    /**
     * Set the value of dayNha
     *
     * @param dayNha new value of dayNha
     */
    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }


    /**
     * Get the value of maPhong
     *
     * @return the value of maPhong
     */
    public int getMaPhong() {
        return maPhong;
    }

    /**
     * Set the value of maPhong
     *
     * @param maPhong new value of maPhong
     */
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public phongHoc() {
    }

    public phongHoc(int maPhong, String dayNha, float dienTich, int soBongDen, float bongDenTB) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
        this.bongDenTB = bongDenTB;
    }
    
public void nhap(){
        System.out.println("nhap ma phong hoc");
        maPhong = sc.nextInt();
        System.out.println("nhap vao day nha");
       dayNha = sc.nextLine();
        System.out.println("nhap vao so bong den");
        soBongDen = sc.nextInt();
        System.out.println("nhap dien tich phong");
        dienTich = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "phongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + ", bongDenTB=" + bongDenTB + '}';
    }
public void phongDatChuan(){
    if (bongDenTB>10)
        System.out.println("phong hoc dat chuan");
    else
        System.out.println("phong hoc chua dat chuan");
}

   

}
