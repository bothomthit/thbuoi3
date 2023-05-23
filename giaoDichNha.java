/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoicuoi;

/**
 *
 * @author Admin
 */
public class giaoDichNha extends giaoDich {
    
    private String loaiNha, diaChiNha ;
    private int luaChon;

    public String getDiaChiNha() {
        return diaChiNha;
    }

    public void setDiaChiNha(String diaChiNha) {
        this.diaChiNha = diaChiNha;
    }

    /**
     * Get the value of loaiNha
     *
     * @return the value of loaiNha
     */
    public String getLoaiNha() {
        return loaiNha;
    }

    /**
     * Set the value of loaiNha
     *
     * @param loaiNha new value of loaiNha
     */
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public giaoDichNha() {
        super();
    }

    public giaoDichNha(String loaiNha, String diaChiNha) {
         super();
                this.loaiNha = loaiNha;
        this.diaChiNha = diaChiNha;
       
    }
    @Override
    public void nhap(){
    super.nhap();
        System.out.println("nhap dia chi nha");
        diaChiNha = sc.nextLine();
        System.out.println("nhap loai nha. 0: nha cao cap/1:nha thuong");
        luaChon = sc.nextInt();
        switch (luaChon){
            case 0 -> loaiNha = "cao cap";
            case 1 -> loaiNha="thuong";
                default -> System.out.println("chon lai so o hoac 1");
        }
        
        
}

    @Override
    public String toString() {
        return "giaoDichNha{" + "loaiNha=" + loaiNha + ", diaChiNha=" + diaChiNha + ", luaChon=" + luaChon + '}';
    }
    
}
