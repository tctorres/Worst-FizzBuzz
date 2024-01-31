import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class FizzBuzzTest{
    SoftAssert softAssert = new SoftAssert();

    //I don't have a data provider, javadoc, and the assertions are in the test. Also, there is not fixtures/annotations.
    //There is not a suite to run all the tests.
    @Test
    public void testIsNumberDivisibleBy3(){
        Boolean isDivisibleBy3 = MathUtils.isDivisibleBy3(9);
        softAssert.assertTrue(isDivisibleBy3);
        softAssert.assertAll();
    }
    @Test
    public void testIsNumberDivisibleBy5(){
        Boolean isDivisibleBy5 = MathUtils.isDivisibleBy5(20);
        softAssert.assertTrue(isDivisibleBy5);
        softAssert.assertAll();
    }

    @Test
    public void testIsNumberDivisibleByBoth(){
        Boolean isDivisibleByBoth = MathUtils.isDivisibleBy3And5(30);
        softAssert.assertTrue(isDivisibleByBoth);
        softAssert.assertAll();
    }
    @Test
    public void testIsNumberNotDivisibleBy3(){
        Boolean isNotDivisibleBy3 = MathUtils.isDivisibleBy3(8);
        softAssert.assertFalse(isNotDivisibleBy3);
        softAssert.assertAll();
    }
    @Test
    public void testIsNumberNotDivisibleBy5(){
        Boolean isNotDivisibleBy5 = MathUtils.isDivisibleBy5(43);
        softAssert.assertFalse(isNotDivisibleBy5);
        softAssert.assertAll();
    }
    @Test
    public void testIsNumberNotDivisibleByBoth(){
        Boolean isNotDivisibleByBoth = MathUtils.isDivisibleBy3And5(70);
        softAssert.assertFalse(isNotDivisibleByBoth);
        softAssert.assertAll();
    }
}
