
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String NXB;
    private String soTrang;
    private double giaTien;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        NXB = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextDouble();
    }
    public void Output(){
        System.out.println("Mã sách: " +maSach +"\t"+ "Tên sách: " +tenSach +"\t"+ "NXB: " +NXB +"\t"+ "Số trang: " +"\t"+ soTrang +"\t"+ "Giá tiền: " +giaTien);
    }
    public Sach() {
    }
    public Sach(String maSach, String tenSach, String NXB, String soTrang, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public double getGiaTien() {
        return giaTien;
    }
    
    
}
