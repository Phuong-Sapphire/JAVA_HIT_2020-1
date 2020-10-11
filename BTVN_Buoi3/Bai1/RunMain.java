
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Person TieuChien= new Person();
        Person DangLuan= new Person();
        TieuChien.setName("Tiêu Chiến");
        TieuChien.setDateOfBirth("05/10/1991");
        TieuChien.setGender("Nam");
        TieuChien.setHobby("Nuôi mèo,ăn lẩu");
        DangLuan.setName("Đặng Luân");
        DangLuan.setDateOfBirth("21/10/1992");
        DangLuan.setGender("Nam");
        DangLuan.setHobby("Màu xanh, ăn uống");
        System.out.println("Tên: "+TieuChien.getName());
        System.out.println("Ngày sinh: " +TieuChien.getDateOfBirth());
        System.out.println("Giới tính: "+TieuChien.getGender());
        System.out.println("Sở thích: "+TieuChien.getHobby());
        System.out.println("");
        System.out.println("Tên: "+DangLuan.getName());
        System.out.println("Ngày sinh: "+DangLuan.getDateOfBirth());
        System.out.println("Ngày sinh: " +DangLuan.getGender());
        System.out.println("Sở thích: "+DangLuan.getHobby());
        
    }
}
