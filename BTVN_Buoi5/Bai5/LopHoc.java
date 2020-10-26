
package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admini
 */
public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private ArrayList<SinhVien> x = new ArrayList<>();
    private int n;
    private Nguoi giaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, int n, Nguoi giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Nguoi getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(Nguoi giaoVien) {
        this.giaoVien = giaoVien;
    }
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã lớp: ");
        maLH = sc.nextLine();
        System.out.print("nhập tên lớp: ");
        tenLH = sc.nextLine();
        System.out.print("nhập ngày nhập học: ");
        ngayMo = sc.nextLine();
        System.out.print("nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print("-----> nhập thông tin sinh viên thứ: " +(i+1)+"\n");
            SinhVien a = new SinhVien();
            a.Input();
            x.add(a);
        }
        System.out.print("nhập thông tin giáo viên: ");
        giaoVien = new Nguoi();
        giaoVien.Input();
    }
    public void Output()
    {
        System.out.println("Mã lớp: " +maLH);
        System.out.println("Tên lớp: " +tenLH);
        System.out.println("Ngày nhập học: " +ngayMo);
        System.out.println("\t\t\t--------------- THÔNG TIN SINH VIÊN ---------------");
        System.out.printf("%20s %15s %20s %10s %20s %10s \n","Ho Tên", "Ngáy Sinh", "Quê Quán", "Mã SV", "Ngành", "Khóa");
        for(SinhVien i:x)
        {
            i.Output();
        }
        System.out.println("\n\t\t\t------------- THÔNG TIN GIẢNG VIÊN ---------------\n");
        System.out.printf("%20s %15s %20s \n", "Ho Tên", "Ngáy Sinh", "Quê Quán");
        giaoVien.Output();
    }
    public int count()
    {
        int count =0;
        for(SinhVien i : x)
            if(i.getKhoaHoc() == 14)
                count++;
        return count;
    }
    public void sort()
    {
        for(int i=0;i<x.size()-1;i++)
            for(int j=i+1;j<x.size();j++)
                if(x.get(i).getKhoaHoc() < x.get(j).getKhoaHoc())
                {
                    SinhVien temp = new SinhVien();
                    temp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, temp);
                }
    }
}
