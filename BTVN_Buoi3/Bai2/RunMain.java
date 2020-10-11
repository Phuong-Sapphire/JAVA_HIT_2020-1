
package Bai2;
//import Bai2.Dog;
/**
 *
 * @author Min
 */
public class RunMain {
    public static void main(String[] args) {
        Dog a= new Dog();
        a.InputName(" Imposter ");
        for(int i=0;i<3;i++)
        {
            a.ShowMP();
            a.Bark();
        }
    }
}
