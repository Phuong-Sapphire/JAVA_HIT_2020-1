
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Minh Phương Đỗ
 */
public class HangHoa {
        private String maHang;
        private String tenHang;
        private int soluong;
        private float dongia;
        Scanner sc = new Scanner(System.in);
    public void Nhap() {
        System.out.println("nhập vào mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("nhập vao tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("nhập vào số lượng: ");
        soluong = sc.nextInt();
        System.out.println("nhập vao đơn giá: ");
        dongia = sc.nextFloat();
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoluong() {
        return soluong;
    }

    public float getDongia() {
        return dongia;
    }
    
    public void Xuat()
    {
        System.out.println("Mã hàng: " +maHang);
        System.out.println("Tên hàng: " +tenHang);
        System.out.println("Thành tiền: " + (dongia*soluong));
    }
}

