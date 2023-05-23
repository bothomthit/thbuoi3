/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoicuoi;

/**
 *
 * @author Admin
 */
public class giaoDichDat extends giaoDich {
    
    private String loaiDat;

    public giaoDichDat() {
        super();
    }

    public giaoDichDat(String loaiDat) {
       super();
        this.loaiDat = loaiDat;
    }
    

    /**
     * Get the value of loaiDat
     *
     * @return the value of loaiDat
     */
    public String getLoaiDat() {
        return loaiDat;
    }

    /**
     * Set the value of loaiDat
     *
     * @param loaiDat new value of loaiDat
     */
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    @Override
    public void nhap(){
   super.nhap();
        System.out.println("nhap loai dat (A/B/C)");
        loaiDat = sc.nextLine();
}

    @Override
    public String toString() {
        return "giaoDichDat{" + "loaiDat=" + loaiDat + '}';
    }
    
}
