/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoicuoi;
import java.util.ArrayList;
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
    ArrayList<giaoDichNha> arrGiaoDichNha = new ArrayList<>();
        ArrayList<giaoDichDat> arrGiaoDichDat = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập số giao dịch đất: ");
        soGiaoDichDat = scanner.nextInt();
        System.out.print("Nhập số giao dịch nhà: ");
        soGiaoDichNha = scanner.nextInt();
         
        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            giaoDichDat giaoDichDat = new giaoDichDat();
            giaoDichDat.nhap();
            arrGiaoDichDat.add(giaoDichDat);
        }
         
        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            giaoDichNha giaoDichNha = new giaoDichNha();
            giaoDichNha.nhap();
            arrGiaoDichNha.add(giaoDichNha);
        }
         
        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
         
        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
         
        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
            if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                    arrGiaoDichDat.get(i).getDonGia() * 1.5;
            } else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                    arrGiaoDichDat.get(i).getDonGia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);
         
        
            }
        }
    
    

