
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
public class Bai1 {
    public static void main(String[] args) {
        int m=4,n=7;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==0 || i==m-1 || j==0 || j==n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
    }
    
}
