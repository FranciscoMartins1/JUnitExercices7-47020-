
import org.example.CU;
import org.example.Mark;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CUTest {

    private CU testCU;

    @BeforeEach
    void initialize(){
        testCU = new CU("LAM",2);
        testCU.insertMarkCU(41020,10);
        testCU.insertMarkCU(49100,16);
    }

//    @ParameterizedTest
//    @CsvSource(value={"1,3", "2,2"})
//    public void insertMarkCUTest(int numStudent , double mark){
//        // por acabar
//
//    }

    // feito
    @ParameterizedTest
    @CsvSource(value={"49100"})
    public void searchStudent(int numStudent){
        double actualValue = 16;
        double expectedValue = testCU.searchStudent(numStudent);
        assertEquals(actualValue,expectedValue);
    }

    // feito
    @Test
    public void averageCU(){
        double actualValue = 13;
        double expectedValue =testCU.averageCU();
        assertEquals(actualValue,expectedValue);
    }

    // feito
    @ParameterizedTest
    @CsvSource(value={"49100"})
    public void isApproved(int numStudent){
        boolean actualValue = true;
        boolean expectedValue = testCU.isApproved(numStudent);
        assertEquals(actualValue,expectedValue);
    }
}
