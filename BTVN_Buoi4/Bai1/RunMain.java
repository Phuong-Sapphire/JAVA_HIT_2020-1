
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng sách: ");
        int n= sc.nextInt();
        Sach[] a;
        a = new Sach[50];
        System.out.println("========= NHẬP VÀO THÔNG TIN SÁCH =========");
        for(int i=0;i<n;i++){
            System.out.println("nhập vào sách thứ: " +(i+1));
            a[i] = new Sach();
            a[i].Input();
        }
        System.out.println("========= THÔNG TIN SÁCH =========");
        for(int i=0;i<n;i++){
            a[i].Output();
        }
        
        
    }
}
