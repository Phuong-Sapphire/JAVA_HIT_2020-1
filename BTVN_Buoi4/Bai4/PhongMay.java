
package Bai4;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dientich; 
    private QuanLi x;
    private May[] y;
    private int n;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("nhập diện tích: ");
        dientich = sc.nextDouble();
        x = new QuanLi();
        x.Input();
        System.out.println("nhập vào sô lượng máy: ");
        n = sc.nextInt();
        y = new May[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("------>nhập váo máy thứ: " +(i+1));
            y[i] = new May();
            y[i].Input();
        }
    }
    public void Output()
    {
        System.out.println("Mã phòng: " +maPhong +"\t"+"Tên phòng: " +tenPhong +"\t"+ "Diện tích: " +dientich +"m2");
        x.Output();
        for(int i=0;i<n;i++)
        {
            y[i].Output();
        }
    }
    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dientich, QuanLi x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dientich = dientich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public double getDientich() {
        return dientich;
    }

    public QuanLi getX() {
        return x;
    }

    public May[] getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public void setX(QuanLi x) {
        this.x = x;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    
}
