
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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str=sc.nextLine();
        ChuanHoa(str);
    }
    public static void ChuanHoa(String s)
    {
        s = s.toLowerCase(); 
        String [] ss;
        String  s2= " ";
        ss = s.split(" ");
        for(int i=0;i<ss.length;i++){
            String s1= "";
            if(ss[i].length() != 0){
                s1+= Character.toUpperCase(ss[i].charAt(0));
                if(ss[i].length() > 0)
                    s1+=ss[i].substring(1);
                    s2 +=s1;
                if(i<ss.length)
                    s2+= " ";
            }
        }
        if(s2.charAt(s2.length()-1)== ' ') s2+= '\b';
        System.out.print("Chuỗi sau khi chuẩn hóa: "+ s2);
    }
}
