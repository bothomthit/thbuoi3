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
public class phongThiNghiem extends phongHoc {
    
    private int soBonRua;
    Scanner sc = new Scanner(System.in);

    /**
     * Get the value of soBonRua
     *
     * @return the value of soBonRua
     */
    public int getSoBonRua() {
        return soBonRua;
    }

    /**
     * Set the value of soBonRua
     *
     * @param soBonRua new value of soBonRua
     */
    public void setSoBonRua(int soBonRua) {
        this.soBonRua = soBonRua;
    }
    @Override
    public void nhap(){
        System.out.println("nhap vao so bon rua");
    soBonRua = sc.nextInt();
}
    public phongThiNghiem() {
        super();
    }

    public phongThiNghiem(int soBonRua) {
        super();
        this.soBonRua = soBonRua;
    }

    @Override
    public String toString() {
        return "phongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + "phongThiNghiem{" + "soBonRua=" + soBonRua + '}';
    }
public void phongTNChuan(){
    if(soBonRua>0)
        System.out.println("phong thi nghiem dat chuan");
    System.out.println("phong thi nghiem chua dat chuan");
}
}
