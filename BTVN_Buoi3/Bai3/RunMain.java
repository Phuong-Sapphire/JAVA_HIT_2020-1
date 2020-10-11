package Bai3;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        HangHoa a= new HangHoa();
        System.out.println("--------- nhâp thông tin mặt hàng -----------");
        a.Nhap();
        System.out.println("--------- thông tin mặt hàng t1 -----------");
        a.Xuat();
        a.setMaHang("456");
        a.setTenHang("Kẹo dẻo");
        a.setSoluong(15);
        a.setDongia(10000);
        System.out.println("--------- thông tin mặt hàng t2 -----------");
        System.out.println("Mã hàng: " + a.getMaHang());
        System.out.println("Tên hàng: " + a.getTenHang());
        System.out.println("Thành tiền: " + a.getDongia()*a.getSoluong());
        
    }
}
