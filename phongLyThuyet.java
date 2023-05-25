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
public class phongLyThuyet extends phongHoc {
    
    private int soMayChieu;
    Scanner sc = new Scanner(System.in);

    /**
     * Get the value of soMayChieu
     *
     * @return the value of soMayChieu
     */
    public int getSoMayChieu() {
        return soMayChieu;
    }

    /**
     * Set the value of soMayChieu
     *
     * @param soMayChieu new value of soMayChieu
     */
    public void setSoMayChieu(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    public phongLyThuyet() {
        super();
    }

    public phongLyThuyet(int soMayChieu) {
       super();
        this.soMayChieu = soMayChieu;
    }
    @Override
    public void nhap(){
        System.out.println("nhap vao so may chieu");
    soMayChieu = sc.nextInt();
}

    @Override
    public String toString() {
        return "phongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen +"phongLyThuyet{" + "soMayChieu=" + soMayChieu + '}';
    }
    public void phongLTChuan(){
        if(soMayChieu>0)
            System.out.println("phong ly thuyet dat chuan");
        else
            System.out.println("phong ly thuyet chua dat chuan");
    }
}
