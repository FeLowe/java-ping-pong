import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String number = request.queryParams("number");
      Integer integerNumber = Integer.parseInt(number);
      ArrayList<String> pingPongOutput = outputPingPong(integerNumber);

      model.put("pingPongOutput", pingPongOutput);
      model.put("number", request.queryParams("number"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }


  public static ArrayList<String> outputPingPong(Integer input) {
    ArrayList<String> numbersArray = new ArrayList<String>();
    for ( Integer i = 1; i <= input; i++) {
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
