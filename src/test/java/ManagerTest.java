import staff.Employee;
import staff.management.Manager;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new Manager("Leonard", "TY374084R", 50000, "IT");
        employee.raiseSalary(2000);
        assertEquals(52000.0, employee.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        employee = new Manager("Leonard", "TY374084R", 50000, "IT");
        assertEquals(500.0, employee.payBonus());
    }
}
