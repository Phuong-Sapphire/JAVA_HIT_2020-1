
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Min
 */
public class Dog {
    private String name;
    private int MP = 100;
    Scanner sc= new Scanner(System.in);
    public void InputName(String name)
    {
        this.name=name;
    }
    public void ShowMP(){
        System.out.println(MP);
    }
    public void Bark()
    {
        if(name.length() !=0){
            System.out.println(name + "sủa");
            MP -= 20;
        }
        else{
            System.out.println("Sorry bạn chưa điền tên :))");
        }
    }
}
