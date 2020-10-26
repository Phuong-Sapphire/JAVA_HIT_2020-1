
package Bai3;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private double SoLuong;
    private double DonGia;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, double SoLuong, double DonGia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
    public void InputSP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã sp: ");
        MaSP = sc.nextLine();
        System.out.print("nhập tên sp: ");
        TenSP = sc.nextLine();
        System.out.print("nhập số lượng: ");
        SoLuong = sc.nextDouble();
        System.out.print("nhập đơn giá: ");
        DonGia = sc.nextDouble();
    }
    public void OutputSP()
    {
        System.out.println("Mã SP: " +MaSP +"\t"+ "Tên SP: " +TenSP +"\t"+ "Thành tiền: " +SoLuong*DonGia);
    }
    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
    
}
