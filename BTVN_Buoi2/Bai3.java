
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,Choice;
        System.out.print("nhap n: ");
        n=sc.nextInt();
        int[] a= new int[n];
        do
        {
            System.out.println("============ MENU ============\n");
            System.out.println("1. Nhập mảng");
            System.out.println("2. Hiển thị mảng");
            System.out.println("3. Thêm phần tử");
            System.out.println("4. Xóa phần tử");
            System.out.println("5. Đảo ngược mảng");
            System.out.println("6. Hiển thị a[1] và các số chia hết a[1]");
            System.out.println("7. Thoát");
            System.out.println("Nhập lựa chọn : ");
            Choice = sc.nextInt();
        switch(Choice)
            {
                case 1:
                    System.out.print("\n Nhập mảng:");
                    nhap_mang(a,n);
                    break;
                case 2:
                    System.out.print("\n Xuất mảng: ");
                    xuat_mang(a,n);
                    break;
                case 3:
                    a=chen_x(a, n);
                    System.out.println("Mảng sau khi chèn: ");
                    xuat_mang(a, n);
                    break;
                case 4:
                    a= delete(a, n);
                    System.out.println("Mảng sau khi xóa: ");
                    xuat_mang(a, n);
                    break;
                case 5:
                    a=dao_nguoc(a, n);
                    System.out.println("Mảng đảo ngược: ");
                    xuat_mang(a, n);    
                    break;
                case 6:
                    hien_thi(a, n);
                    break;
                case 7:
                    System.out.println("Bạn đã chọn thoát chương trình!!!!");
                    break;
                default:
                    System.out.println("Không hợp lệ..........");
            }
        } while(n!=7);
        
        
    }
    
    public static void nhap_mang(int a[],int n) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
     public static void xuat_mang(int a[],int n){
         for(int i=0;i<a.length;i++)
             System.out.print(a[i]+ " ");
     }
     public static int [] chen_x(int a[],int n){
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí cần chèn : ");
        int k = sc.nextInt();
        System.out.println("Nhập số cần chèn : ");
        int x = sc.nextInt();
        int[] temp = new int [a.length + 1];
        int index = 0;
        for (int i = 0 ; i < a.length ; i++) {
            if(index == k) {
                temp[index++] = x;
                i--;
            } else {
                temp[index++] = a[i];
            }
        }
        return temp;
    }
    
    public static int[] delete(int a[],int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào vị trí cần xóa: ");
        int k = sc.nextInt();
        int[] temp = new int [a.length - 1];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(i != k)
            {
                temp[index++]=a[i];
            }
        }
        return temp;
    }
    public static int[] dao_nguoc(int a[],int n) {
        int[] temp = new int [a.length];
        for(int i=0;i<a.length;i++){
           temp[temp.length - i - 1]=a[i];
        }
        return temp;
    }
    public static void hien_thi(int a[],int n) {
        System.out.println("a[1]: " +a[1]);
        int dem=0;
        for(int i=0;i<a.length;i++){
             if(a[i]%a[1]==0)
                 dem++;
        }
        if (dem==0)
            System.out.println("Không có số nào chia hết cho a[1] ");
        else{
            System.out.print("Các số nào chia hết cho a[1]: ");
            for(int i=0;i<a.length;i++){
                if(a[i]%a[1]==0)
                    System.out.print(a[i] + " ");
        }
        }
           
    }
            

}
