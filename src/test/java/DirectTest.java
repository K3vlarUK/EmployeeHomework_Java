import org.junit.Test;
import staff.Employee;
import staff.management.Director;
import staff.management.Manager;

import static junit.framework.TestCase.assertEquals;

public class DirectTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new Director("Penny", "TY374084R", 125000, "IT", 100000);
        employee.raiseSalary(10000);
        assertEquals(135000.0, employee.getSalary());
    }

    @Test
    public void cantLowerSalary(){
        employee = new Director("Penny", "TY374084R", 125000, "IT", 100000);
        employee.raiseSalary(-10000);
        assertEquals(125000.0, employee.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        employee = new Director("Penny", "TY374084R", 125000, "IT", 100000);
        assertEquals(2500.0, employee.payBonus());
    }

    @Test
    public void canChangeName__notNull() {
        employee = new Director("Penny", "TY374084R", 125000, "IT", 100000);
        employee.setName("Raj");
        assertEquals("Raj", employee.getName());
    }

    @Test
    public void canChangeName__null() {
        employee = new Director("Penny", "TY374084R", 125000, "IT", 100000);
        employee.setName("");
        assertEquals("Penny", employee.getName());
    }
}
