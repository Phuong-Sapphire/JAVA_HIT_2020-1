
package Bai2;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập ngày: ");
        day = sc.nextInt();
        System.out.print("nhập tháng: ");
        month = sc.nextInt();
        System.out.print("nhập năm: ");
        year = sc.nextInt();
    }
    public void Output(){
        System.out.println(""+day+"-"+month+"-"+year);
    }
    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}

