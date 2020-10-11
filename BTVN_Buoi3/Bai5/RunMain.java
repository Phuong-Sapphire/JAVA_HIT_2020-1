
package Bai5;

import java.util.Random;

/**
 *
 * @author Min
 */
public class RunMain {
    public static void main(String[] args) {
        Guns a= new Guns();
        Guns b= new Guns();
        a.setWeaponName("Lisa");
        b.setWeaponName("Rose");
        a.setAmmoNumber(100);
        b.setAmmoNumber(100);
        Random rd = new Random();
        while(a.getAmmoNumber()>0 && b.getAmmoNumber()>0)
        {
            int x= rd.nextInt(30);
            a.Shoot(x);
            x= rd.nextInt(30);
            b.Shoot(x);
            if(a.getAmmoNumber()==0)
            {
                System.out.println(a.getWeaponName() + " thua");
            }
            else if(b.getAmmoNumber()==0)
            {
                System.out.println(b.getWeaponName() + " thua");
            }
            else if(b.getAmmoNumber()==0 && a.getAmmoNumber()==0)
            {
                System.out.println("Hòa");
            }   
        }
    }
}