/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LopHoc classroom = new LopHoc();
        System.out.println("\t\t\t=============== NHẬP THÔNG TIN 1 LỚP HỌC ============");
        classroom.Input();
        System.out.println("\t\t\t=============== NHẬP THÔNG TIN 1 LỚP HỌC ============");
        classroom.Output();
        System.out.println("\n------------>Lớp có " + classroom.count()+" sinh viên K14");
        System.out.println("\t\t\t============== THÔNG TIN SINH VIẾN SAU KHI SẮP XÊP ============");
        classroom.sort();
        classroom.Output();
    }
}
