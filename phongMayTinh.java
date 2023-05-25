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
public class phongMayTinh extends phongHoc {
  
    private int soMayTinh;
    
    private float mtTB;
        Scanner sc = new Scanner(System.in);

    /**
     * Get the value of mtTB
     *
     * @return the value of mtTB
     */
    public float getMtTB() {
        return (float) (dienTich/1.5);
    }

    /**
     * Set the value of mtTB
     *
     * @param mtTB new value of mtTB
     */
    public void setMtTB(float mtTB) {
        this.mtTB = mtTB;
    }



   
    
    
    

    /**
     * Get the value of soMayTinh
     *
     * @return the value of soMayTinh
     */
    public int getSoMayTinh() {
        return soMayTinh;
    }

    /**
     * Set the value of soMayTinh
     *
     * @param soMayTinh new value of soMayTinh
     */
    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }
 public phongMayTinh() {
        super();
    }
    public phongMayTinh(int soMayTinh) {
       super();
        this.soMayTinh = soMayTinh;
    }
    @Override
  public void nhap(){
        System.out.println("nhap vao so may tinh co trong phong"); 
        soMayTinh = sc.nextInt();
        
  }

    @Override
    public String toString() {
        return "phongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + ", bongDenTB=" + bongDenTB + "phongMayTinh{" + "soMayTinh=" + soMayTinh + ", mtTB=" + mtTB + '}';
    }

   
public void phongMTDatChuan(){
  if(soMayTinh<=mtTB)
        System.out.println("phong may tinh dat chuan");
  else
        System.out.println("phong may tinh chua dat chuan");
}  
}
