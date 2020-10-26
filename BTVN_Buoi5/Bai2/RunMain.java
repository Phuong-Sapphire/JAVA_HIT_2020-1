
package Bai2;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Complex SP1 = new Complex();
        Complex SP2 = new Complex();
        System.out.println("nhập số phức t1: ");
        SP1.Input();
        System.out.println("nhập số phức t2: ");
        SP2.Input();
        Complex m = SP1.Cong(SP2);
        System.out.print("SP1 + SP2 = ");
        m.Output();
        Complex n = SP1.Tru(SP2);
        System.out.print("SP1 - SP2 = ");
        n.Output();
    }
}
