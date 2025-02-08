package com.java.wipro.java8.usecase.test;

import com.java.wipro.java8.usecase.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagementTest {

    @Test
    void testMainMethodExecution() {
        // We only check if the main method executes without throwing exceptions
        assertDoesNotThrow(() -> EmployeeManagement.main(new String[] {}));
    }
}