import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void isPingPong_forNumberNotDivisibleByThreeFiveAndFifthteen_number() {
    PingPong pingPong = new PingPong();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    expected.add("Ping");
    expected.add("4");
    expected.add("Pong");
    expected.add("Ping");
    expected.add("7");
    expected.add("8");
    expected.add("Ping");
    expected.add("Pong");
    expected.add("11");
    expected.add("Ping");
    expected.add("13");
    expected.add("14");
    expected.add("Ping-Pong");
    assertEquals(expected, pingPong.outputPingPong(2));
  }

}
