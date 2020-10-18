
package Bai3;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Hang {
    private String maHang;
    private String tenHang;
    private double donGia;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }
    public void Output(){
        System.out.println("Mã hàng: " +maHang);
        System.out.println("Tên hàng: " +tenHang);
        System.out.println("Đơn giá: " +donGia);
    }
    public Hang() {
    }

    public Hang(String maHang, String tenHang, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }
    
    
}
