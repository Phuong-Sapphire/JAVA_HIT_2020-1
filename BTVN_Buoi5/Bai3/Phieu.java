
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private ArrayList<SanPham> list = new ArrayList<>();
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu, DateTime a, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.n = n;
    }
 
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return list;
    }

    public void setX(ArrayList<SanPham> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void InputPhieu()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhập mã phiếu: ");
        maPhieu = sc.nextLine();
        System.out.print("nhập tên phiếu: ");
        tenPhieu = sc.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.println("nhập vào số lượng sản phẩm: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("nhập vào sản phẩm thứ " +(i+1)+":");
            SanPham x = new SanPham();
            x.InputSP();
            list.add(x);
        }
    }
    public void OutputPhieu()
    {
        System.out.println("Mã phiếu: " +maPhieu +"\t"+ "Tên phiếu: " +tenPhieu);
        System.out.print("Ngày-tháng-năm: ");
        a.OutputDate();
        for(int i=0;i<list.size();i++)
        {
            list.get(i).OutputSP();
        }
    }
    
    
}
