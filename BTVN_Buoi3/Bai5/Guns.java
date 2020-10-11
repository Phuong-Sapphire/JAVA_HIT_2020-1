
package Bai5;

/**
 *
 * @author admini
 */
public class Guns {
    private String weaponName;
    private int ammoNumber;
    
    public void Load(int x){
        ammoNumber += x;
    }
    public void Shoot(int x){
        if(ammoNumber - x >= 0 ){
            ammoNumber -= x;
        }
        if(ammoNumber==0){
            System.out.println("Hết đạn");
        }
    }
    Guns(){
        
    }
    Guns(String weaponName,int ammoNumber){
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
    
}
