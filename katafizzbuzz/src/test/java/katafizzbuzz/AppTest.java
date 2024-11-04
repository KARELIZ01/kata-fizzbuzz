package katafizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testFizzBuzz() {
        assertEquals("1", App.fizzBuzz(1));
        assertEquals("2", App.fizzBuzz(2));
        assertEquals("Fizz", App.fizzBuzz(3));
        assertEquals("4", App.fizzBuzz(4));
        assertEquals("Buzz", App.fizzBuzz(5));
        assertEquals("Fizz", App.fizzBuzz(6));
        assertEquals("Buzz", App.fizzBuzz(10));
        assertEquals("FizzBuzz", App.fizzBuzz(15));
        assertEquals("FizzBuzz", App.fizzBuzz(30));
    }

    @Test
    void testFizzBuzzRange() {
        for (int i = 1; i <= 100; i++) {
            String result = App.fizzBuzz(i);
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", result);
            } else if (i % 3 == 0) {
                assertEquals("Fizz", result);
            } else if (i % 5 == 0) {
                assertEquals("Buzz", result);
            } else {
                assertEquals(String.valueOf(i), result);
            }
        }
    }
}

