import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
   public void isLeapYear_forNumberDivisibleByFour_true() {
     LeapYear leapYear = new LeapYear();
     assertEquals(true, leapYear.isLeapYear(2012));
    }

}
