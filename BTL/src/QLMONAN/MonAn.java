
package QLMONAN;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class MonAn {
    private String tenMonAn;
    private double money;

    public MonAn() {
    }

    public MonAn(String tenMonAn, double money) {
        this.tenMonAn = tenMonAn;
        this.money = money;
    }
//    public void Input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the name of the dish: ");
//        tenMonAn = sc.nextLine();
//        System.out.println("Snter the price of money");
//        money = sc.nextDouble();
//    }

    @Override
    public String toString() {
        return "MonAn{" + "tenMonAn=" + tenMonAn + ", money=" + money + '}';
    }
    
    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getGia() {
        return money;
    }

    public void setGia(double money) {
        this.money = money;
    }
    
}
