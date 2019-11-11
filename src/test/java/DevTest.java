import staff.Employee;
import staff.techStaff.Developer;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DevTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new Developer("Howard", "TY374084R", 25000);
        employee.raiseSalary(3000);
        assertEquals(28000.0, employee.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        employee = new Developer("Howard", "TY374084R", 25000);
        assertEquals(250.0, employee.payBonus());
    }

}
