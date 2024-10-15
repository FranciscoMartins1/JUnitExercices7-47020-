import org.example.PrimeChecks;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrimeChecksTest {
    PrimeChecks checks = new PrimeChecks();

    @ParameterizedTest
    @CsvSource(value={"3"})
    public void isPrimeTest(int number){
        boolean actualValue = true;
        boolean expectedValue = checks.isPrime(number);
        assertEquals(actualValue,expectedValue);
    }

    @ParameterizedTest
    @CsvSource(value={"4"})
    public void isEvenTest(int number){
        boolean actualValue = true;
        boolean expectedValue = checks.isEven(number);
        assertEquals(actualValue,expectedValue);
    }

//    @ParameterizedTest
//    @CsvSource(value={"5","3"})
//    public void isMultipleTest(int number, int divisor){
//        boolean actualValue = false;
//        boolean expectedValue = checks.isMultiple(number,divisor);
//        assertEquals(actualValue,expectedValue);
//    }
}
