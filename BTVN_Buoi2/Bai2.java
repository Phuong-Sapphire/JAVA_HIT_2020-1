
import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("max = " +max);
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("min = " +min);
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }  
        System.out.print("Mang sx tang: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }
}
}