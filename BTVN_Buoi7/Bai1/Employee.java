
package Bai1;

/**
 *
 * @author admini
 */
public class Employee extends Person{
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee( String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void Display()
    {
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Employee salary: "+salary);
        
    }
   
}
