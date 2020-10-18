
package Bai3;

/**
 *
 * @author admini
 */
public class Main {
    public static void main(String[] args) {
        Phieu a = new Phieu();
        System.out.println("==== NHẬP THÔNG TIN HÀNG ======");
        a.Input();
        System.out.println("==== THÔNG TIN HÀNG ======");
        a.Ouput();
        System.out.print("Tổng tiền: " +a.Sum());
        
    }
}
