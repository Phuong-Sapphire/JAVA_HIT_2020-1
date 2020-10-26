
package Bai2;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Complex {
    private double phanThuc;
    private double phanAo;

    public Complex() {
    }

    public Complex(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập phần thực: ");
        phanThuc = sc.nextDouble();
        System.out.print("nhập phần ảo: ");
        phanAo = sc.nextDouble();
    }
    public void Output()
    {
        System.out.println(phanThuc + "+" +phanAo+"i");
    }
    public Complex Cong(Complex a)
    {
        Complex x = new Complex();
        x.phanThuc = this.phanThuc + a.phanThuc;
        x.phanAo = this.phanAo + a.phanAo;
        return x;
    }
    public Complex Tru(Complex a)
    {
        Complex x = new Complex();
        x.phanThuc = this.phanThuc - a.phanThuc;
        x.phanAo = this.phanAo - a.phanAo;
        return x;
    }
    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    
    
}
