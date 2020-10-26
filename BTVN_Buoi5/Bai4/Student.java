
package Bai4;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập mã sinh viên: ");
        id = sc.nextLine();
        System.out.print("nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("nhập điểm TB: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }
    public void Output()
    {
        System.out.printf("%10s %20s %10s %20s %10s \n", id, name, age, address, gpa);
        System.out.println("");
    }
}
