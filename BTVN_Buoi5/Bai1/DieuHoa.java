
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class DieuHoa extends SanPham{
    private double congSuat;
    private double giaBan;

    public DieuHoa() {
    }

    public DieuHoa(double congSuat, double giaBan, String id, String tenSanPham, String hangSx, String ngayNhap) {
        super(id, tenSanPham, hangSx, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }
    
    public void Input()
    {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap cong suat: ");
        congSuat = sc.nextDouble();
        System.out.print("nhap gia tien: ");
        giaBan = sc.nextDouble();
    }
    
    public void Output()
    {
        super.Output();
        System.out.println("Cong suat: " +congSuat +"\t"+ "Gia ban: " +giaBan);
    }
    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
