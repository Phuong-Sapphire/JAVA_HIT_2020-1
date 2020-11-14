
package Bai1;

/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Tiêu Chiến","Trùng Khánh",10500);
        Person person2 = new Customer(2110,"Đặng Luân","Thạch Gia Trang");
        person1.Display();
        person2.Display();
    }
}
