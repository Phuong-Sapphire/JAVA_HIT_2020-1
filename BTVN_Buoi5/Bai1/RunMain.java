
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Min
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DieuHoa>  list = new ArrayList<>();
        System.out.print("nhap so luong dieu hoa: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("--------> nhập vao điều hòa thứ " +(i+1)+ ":");
            DieuHoa x = new DieuHoa();
            x.Input();
            list.add(x);
        }
        for(int i=0;i<list.size();i++)
        {
            list.get(i).Output();
        }
        double min = list.get(0).getGiaBan();
        for(int i=0;i<list.size();i++)
        {
            if(min>list.get(i).getGiaBan())
                min = list.get(i).getGiaBan();
        }
        System.out.println("======== DANH SACH HÃNG SẢN XUẤT TÊN LÀ ELECTROLUX ==============");
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getHangSx().compareTo("electrolux")==0 && list.get(i).getGiaBan()==min){
                list.get(i).Output();
            }
            else
                System.out.println("không có hãng sản xuất");
            
        }
    }
}
