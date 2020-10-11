/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("nhập vào mảng thứ 1 ");
        arr1.InputData();
        System.out.println("nhập vào mảng thứ 2 ");
        arr2.InputData();
        System.out.print("mảng 1: ");
        arr1.Show();
        System.out.print("mảng 2: ");
        arr2.Show();
        float temp= arr1.Sum()/arr1.getN() - arr2.Sum()/arr2.getN();
        if(temp>0)
        {
            System.out.println("TBC mảng 1 > mảng 2");
        }
        else if(temp<0)
        {
            System.out.println("TBC mảng 1 < mảng 2");
        }
        else if(temp==0)
        {
            System.out.println("Hi ^_^");
        }
    }
}
