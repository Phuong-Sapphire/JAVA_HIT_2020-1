/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;
    
    public void Input(){
    Scanner sc =new Scanner(System.in);
    System.out.print("Nhập mã phiếu: ");
    maPhieu = sc.nextLine();
    System.out.print("Nhập số lượng: ");
    n = sc.nextInt();
    x= new Hang[n];
    for (int i=0;i<n;i++){
        x[i] = new Hang();
        x[i].Input();
    }
    }
    public void Ouput(){
        System.out.println("Mã phiếu: " +maPhieu);
        for(int i=0;i<n;i++){
            x[i].Output();
        }
    }
    public double Sum(){
        double sum=0;
        for(Hang hang: x){
            sum+= hang.getDonGia();
       }    
        return sum;
    }
    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
