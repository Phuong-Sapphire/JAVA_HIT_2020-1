
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admini
 */
public class Bai4 {
    public static boolean IsPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return n>1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int[] prime= new int[n];
       int dem=2;
       for(int i=0;i<n;i++)
       {
           do{
               if(IsPrime(dem))
                   prime[i]=dem;
           }while(!IsPrime(dem++));
       }
           
        for(int i=0;i<n;i++)
        {
            sum+= IsPrime(a[i])? a[i]+ prime[i] -i : a[i];
        }
        System.out.println("SUM = "+ sum);
    }
}
