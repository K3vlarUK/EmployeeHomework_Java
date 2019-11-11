import staff.Employee;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DbTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new DatabaseAdmin("Sheldon", "TY374084R", 30000);
        employee.raiseSalary(8000);
        assertEquals(38000.0, employee.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        employee = new Manager("Sheldon", "TY374084R", 30000, "IT");
        assertEquals(300.0, employee.payBonus());
    }

}
