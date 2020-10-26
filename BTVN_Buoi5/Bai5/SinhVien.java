
package Bai5;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class SinhVien extends Nguoi{
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien() {
    }
    
    public SinhVien(String maSV, String nganh, int khoaHoc) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(String maSV, String nganh, int khoaHoc, String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("nhập mã sv: ");
        maSV = sc.nextLine();
        System.out.print("nhập chuyên ngành: ");
        nganh= sc.nextLine();
        System.out.print("nhập khóa học: ");
        khoaHoc = sc.nextInt();
        sc.nextLine();
    }
    public void Output()
    {
        super.Output();
        System.out.printf("%10s %20s %10s", maSV,nganh,khoaHoc +"\n");
    }
}
