import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {}


  public ArrayList<String> outputPingPong(Integer input) {
    ArrayList<String> numbersArray = new ArrayList<String>();
    for ( Integer i = 1; i <= 15; i++) {
      if ( i % 15 == 0 ) {
        numbersArray.add("Ping-Pong");
      } else if ( i % 5 == 0 ) {
        numbersArray.add("Pong");
      } else if ( i % 3 == 0 ) {
        numbersArray.add("Ping");
      } else {
        numbersArray.add(Integer.toString(i));
      }
    }


  return numbersArray;
  }

}
