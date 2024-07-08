package com.example.asmithrmanagement2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testGetYearlySalary() {
        // Test with a valid monthly salary
        Employee employee1 = new Employee(1, "John Doe", "john.doe@example.com", "5000");
        double expectedYearlySalary1 = 50 * 12;
        assertEquals(expectedYearlySalary1, employee1.getYearlySalary(), 0.01);

        // Test with zero monthly salary
        Employee employee2 = new Employee(2, "Jane Smith", "jane.smith@example.com", "0");
        double expectedYearlySalary2 = 0 * 12;
        assertEquals(expectedYearlySalary2, employee2.getYearlySalary(), 0.01);

        // Test with negative monthly salary (invalid case)
        Employee employee3 = new Employee(3, "Bob Brown", "bob.brown@example.com", "-1000");
        double expectedYearlySalary3 = -1000 * 12;
        assertEquals(expectedYearlySalary3, employee3.getYearlySalary(), 0.01);

        // Test with a floating-point monthly salary
        Employee employee4 = new Employee(4, "Alice Green", "alice.green@example.com", "4500.50");
        double expectedYearlySalary4 = 4500.50 * 12;
        assertEquals(expectedYearlySalary4, employee4.getYearlySalary(), 0.01);
    }
}
