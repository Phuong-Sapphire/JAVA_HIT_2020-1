
package Bai4;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class QuanLi {
    private String maql;
    private String hoTen;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã quản lí: ");
        maql = sc.nextLine();
        System.out.print("nhập ho tên quản lí: ");
        hoTen = sc.nextLine();
    }
    public void Output(){
        System.out.println("Ma quản lí: " +maql + "Tên quản lí: " +hoTen);
    }
    public QuanLi() {
    }

    public QuanLi(String maql, String hoTen) {
        this.maql = maql;
        this.hoTen = hoTen;
    }

    public String getMaql() {
        return maql;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaql(String maql) {
        this.maql = maql;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
