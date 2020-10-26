
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class SanPham {
    private String id;
    private String tenSanPham;
    private String  hangSx;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(String id, String tenSanPham, String hangSx, String ngayNhap) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.hangSx = hangSx;
        this.ngayNhap = ngayNhap;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma san pham: ");
        id = sc.nextLine();
        System.out.print("nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.print("nhap hang san xuat: ");
        hangSx = sc.nextLine();
        System.out.print("nhap vao ngay nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void Output()
    {
        System.out.println("Ma sp: " +id +"\t"+ "Ten sp: " +tenSanPham +"\t"+ "Hang sx: " +hangSx +"\t"+ "Ngay nhap: " +ngayNhap);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
}
