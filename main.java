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
                 System.out.println("2. Tim phong");
            System.out.println("3.xuat danh sach phong hoc");
             System.out.println("4. In danh sach phong chuan");
            System.out.println("5. Sap xep theo day");
            System.out.println("6. Sap xep theo dien tich");
            System.out.println("7. Sap theo so bong den");
            System.out.println("8. cap nhat may tinh");
            System.out.println("9. Xoa phong");
            System.out.println("10. in tong so phong");
            System.out.println("11. In danh sach co 60 may");
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
            switch (loaiPhong) {
                        case 1:
                            System.out.print("Co may chieu (true/false): ");
                            boolean coMayChieu = sc.nextBoolean();
                            phongLyThuyet PhongLyThuyet = new phongLyThuyet(maPhong, dayNha, dienTich, soBongDen, soMayChieu);
                             danhSach.themPhong(phongLyThuyet);
                            break;
                        case 2:
                            System.out.print("Nhap so may tinh: ");
                            int soMayTinh = sc.nextInt();
                            phongMayTinh PhongMayTinh = new phongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                            danhSach.themPhong(phongMayTinh);
                            break;
                        case 3:
                            System.out.print("Nhap nganh: ");
                            String chuyenNganh = sc.nextLine();
                           
                            System.out.print("co bon rua (true/false): ");
                            boolean coBonRua = sc.nextBoolean();
                            phongThiNghiem PhongThiNghiem = new phongThiNghiem(maPhong, dayNha, dienTich, soBongDen, coBonRua);
                             danhSach.themPhong(phongThiNghiem);
                            break;
                        default:
                            System.out.println(".");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("nhap ma phong: ");
                    maPhong = sc.nextLine();
                    PhongHoc phong = quanLyPhongHoc.timPhong(maPhong);
                    if (phong != null) {
                        System.out.println("thong tin phong:");
                        System.out.println(phong);
                    } else {
                        System.out.println(" null  " + maPhong);
                    }
                    break;
                case 3:
                   danhSach.inDanhSachPhong();
                    break;
                case 4:
                  danhSach.inDanhSachPhongDatChuan();
                    break;
                case 5:
                    danhSach.sapTheoDayNha();
                    break;
                case 6:
                    danhSach.sapTheoDienTich();
                    break;
                case 7:
                   danhSach.sapTheoSoBongDen();
                    break;
                case 8:
                    System.out.print("nhap ma phong: ");
                    maPhong = sc.nextLine();
                    System.out.print("nhap so may tinh: ");
                    int soMayTinh = sc.nextInt();
                    scanner.nextLine(); 
               danhSach.capNhatSoMayTinh(maPhong, soMayTinh);
                    break;

                case 9:
                    System.out.print("nhap ma phong: ");
                    maPhong = sc.nextLine();
                     danhSach.xoaPhong(maPhong);
                    break;
                case 10:
                     danhSach.inTongSoPhong();
                    break;
                case 11:
                    danhSach.inDanhSachPhongMay();
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("khong hop le");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
        }
    }
    
}
