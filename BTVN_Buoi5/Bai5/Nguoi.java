/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("nhập quê quán: ");
        queQuan = sc.nextLine();
    }
    public void Output()
    {
        System.out.printf("%20s %15s %20s", hoTen,ngaySinh,queQuan);
    }
}
