package org.example;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

import java.util.stream.Stream;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


//import static junit.framework.TestCase.assertEquals;


public class TestEmployee {


    @Test
    public void testObjectEquality(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }

    @Test
    public void testObjectIdentity(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertSame(expectedEmpObj, Employee.getHighestPaidEmployee());
        }

    @Test
    public void failMessage(){

        Employee expectedEmpObj = new Employee(2, "Nattu", 15000);
        assertEquals("It is not equal", expectedEmpObj, Employee.getHighestPaidEmployee());
    }

    @Test
    public void timeoutNotExceeded()
    {
        //The following assertion succeeds.
        assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes.
        });
    }

    @Test
    public void timeoutExceeded()
    {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    //@Disabled("Disabled until further notice")
    @Ignore
    @Test
    public void testDisabled(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }


}
