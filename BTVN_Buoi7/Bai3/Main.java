
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Min
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<News> list = new ArrayList<>();
        System.out.println("============= MENU ==================");
        System.out.println("1. Insert News ");
        System.out.println("2. View list news ");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
        System.out.println("=====================================");
        int choice;
        while(true)
        {
            System.out.print("nhập lựa chọn bạn muốn: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    News x = new News();
                    System.out.print("nhập id: ");
                    x.setId(sc.nextInt());
                    System.out.print("nhập tiêu đề: ");
                    sc.nextLine();
                    x.setTitle(sc.nextLine());
                    System.out.print("nhập ngày xuất bản: ");
                    x.setPublishDate(sc.nextLine());
                    System.out.print("nhập tác giả: ");
                    x.setAuthor(sc.nextLine());
                    System.out.print("nhập nội dung: ");
                    x.setContent(sc.nextLine());
                    System.out.println("---------> nhập thông tin rate: ");
                    x.InputRate();
                    list.add(x);
                    break;
                case 2:
                    for(int i=0;i<list.size();i++){
                        System.out.println("---------> thông tin news thứ: "+ (i+1));
                        list.get(i).Display();
                    }
                    break;
                case 3:
                    for(int i=0;i<list.size();i++){
                        list.get(i).Caculator();
                        System.out.println("---------> thông tin news thứ: "+ (i+1));
                        list.get(i).Display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
            
}
