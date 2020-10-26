
package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Min
 */
public class RunMain {
    public static ArrayList<Student> list = new ArrayList<>();
    
    public static void Title()
    {
        System.out.println("*********************************************");
        System.out.println("1. ADD STUDENT ");
        System.out.println("2. EDIT STUDENT BY ID ");
        System.out.println("3. DELETE STUDENT BY ID");
        System.out.println("4. SORT STUDENTS BY NAME ");
        System.out.println("5. SORT STUDENTS BY GPA ");
        System.out.println("6. SHOW STUDENTS ");
        System.out.println("0. EXIT ");
        System.out.println("*********************************************");
    }
    public static void Menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n: ");
        int n=sc.nextInt();
        do{
            Title();
            System.out.print("nhập vào lựa chọn bạn mong muốn: ");
            int choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    AddStudent();
                    break;
                }
                case 2:
                {
                    EditStudentByID();
                    break;
                }
                case 3:
                {
                    DeleteStudent();
                    break;
                }
                case 4:
                {
                    SortStudentByName();
                    break;
                }
                case 5:
                {
                    SortStudentByGPA();
                    break;
                }
                case 6:
                {
                    Show();
                    break;
                }
                case 0:
                    System.out.println("Bạn đã chọn thoát chương trình.....!!!");
                default:
                    System.out.println("Nhập sai rồi ^_^ ");
            }
        }while(n!=6);
        
        
    }
    public static void AddStudent()
    {
        Student x = new Student();
        boolean check = true;
        do{
            x.Input();
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).getId().compareTo(x.getId())==0)
                {
                    System.out.println("ID trùng nhau xin mời nhập lại");
                    check = false;
                    break;
                }
                else{
                    check = true;
                }  
            }
        }while(!check);
        list.add(x);
    }
    public static void EditStudentByID()
    {
        Scanner sc = new Scanner(System.in);
        if(list.size()<=0)
            System.out.println("Không có thông tin sinh viên để sửa");
        else{
            boolean check = false;
            int pos=0;
            System.out.print("nhập vào ID cần sửa: ");
            String search = sc.nextLine();
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).getId().compareTo(search)==0){
                    check = true;
                    pos = i;
                    break;
                }
            }
            if(check)
            {
                Student x = new Student();
                x.Input();
                list.remove(pos);
                list.add(pos, x);
            }
            else{
                System.out.println("không có sinh viên có ID này");
            }
        }
    }
    public static void DeleteStudent()
    {
        Scanner sc = new Scanner(System.in);
        if(list.size()<=0)
            System.out.println("không có sinh viên để xóa");
        else{
            boolean check=true;
            System.out.print("nhập vào ID cần xóa: ");
            String del = sc.nextLine();
            for(int i=0;i<list.size();i++)
                if(list.get(i).getId().compareTo(del)==0)
                {
                    list.remove(i);
                    check = false;
                    break;
                }
                if(check){
                    System.out.println("không có sinh viên có ID này");
                }
        }
        
    }
    public static void SortStudentByName()
    {
        for(int i=0;i<list.size()-1;i++)
            for(int j=i+1;j<list.size();j++)
            {
               if(list.get(i).getName().compareTo(list.get(j).getName())>0)
                {
                    Student temp = new Student();
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }            
            }
        Show();
                
    }
    public static void SortStudentByGPA()
    {
        for(int i=0;i<list.size()-1;i++)
           for(int j=i+1;j<list.size();j++)
            if(list.get(i).getGpa()>list.get(j).getGpa())
            {
                Student temp = new Student();
                temp= list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        Show();
    }
    public static void Show()
    {
        System.out.printf("%10s %20s %10s %20s %10s \n","ID","NAME","AGE","ADDRESS","GPA");
        for (Student list1 : list) {
            list1.Output();
        }
    }
    
    public static void main(String[] args) {
        Menu();
    }
}
