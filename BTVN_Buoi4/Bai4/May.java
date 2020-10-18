
package Bai4;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.print("kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.print("tính trạng: ");
        tinhTrang = sc.nextLine();
    }
    public void Output(){
        System.out.println("Mã máy: " +maMay +"\t"+ "Kiểu máy: " +kieuMay +"\t"+ "Tính trạng: " +tinhTrang);

    }
    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
