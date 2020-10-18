
package Bai2;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date NS;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String hoTen, Date NS) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.NS = NS;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã nhân sự: ");
        maNhanSu = sc.nextLine();
        System.out.print("nhập họ tên: ");
        hoTen = sc.nextLine();
        NS = new Date();
        NS.Input();
    }
    public void Output(){
        System.out.println("Mã NV: " +"\t" +maNhanSu +"\t"+ "Họ tên: " +hoTen);
        NS.Output();
    }
    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNS() {
        return NS;
    }
    
    
}
