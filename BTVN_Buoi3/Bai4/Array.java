
package Bai4;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Array {
    private int n;
    private int[] a;
    Scanner sc = new Scanner(System.in);
    public void InputData(){
        System.out.print("nhập váo số lượng phần tử: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("nhập a[" + (i+1)+ "]=");
            a[i] = sc.nextInt();
        }
    }
    public void Show()
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
    }
    public int Sum()
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += a[i];
        }
        return sum;
    }
     Array(){
        
    }
     Array(int n,int a[]){
        this.a=a;
        this.a=a;
    }

    public int getN() {
        return n;
    }

    public int[] getA() {
        return a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(int[] a) {
        this.a = a;
    }
     
    
}

