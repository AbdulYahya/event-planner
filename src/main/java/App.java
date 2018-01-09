import models.*;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static  spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Static files e.g., Stylesheets, Scripts, Images, etc.
        staticFileLocation("/public");

        // Root Route
        get("/", (Request request, Response response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        // Planner Route
        get("/planner", (Request request, Response response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "planner.hbs");
        }, new HandlebarsTemplateEngine());
        // Created Event Route
        get("/event-confirmation", (Request request, Response response) -> {
            Map<String, Object> model = new HashMap<>();
            String fName = request.queryParams("fName");
            String gQuantity = request.queryParams("gQuantity");
            String eventType = request.queryParams("eventType");
            String eDate = request.queryParams("eDate");
            String eventPropEntrees = request.queryParams("eventPropEntrees");
            String[] arrayEventPropEntrees = eventPropEntrees.split(", ");

            // Testing
            for (String word : arrayEventPropEntrees) {
                System.out.print(word + " ");
            }
            System.out.println("\n" + arrayEventPropEntrees.length);
//            Date eventDate;
//            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//            eventDate = df.parse(eDate);
//            SimpleDateFormat ft = new SimpleDateFormat("E, MMMM d");



            model.put("fName", fName);
            model.put("eDate", eDate);
            model.put("gQuantity", gQuantity);
            model.put("eventType", eventType);
            return new ModelAndView(model, "event-confirmation.hbs");
        }, new HandlebarsTemplateEngine());

//        ConsoleUI console = new ConsoleUI();
//        boolean quit = false;
//
//        try {
//            console.startMenuPrompt();
//            while (!quit) {
//                int selection = console.getStartMenuPromptInput();
//
//                switch (selection) {
//                    case 1:
//                        console.weddingPrompt();
//                        break;
//                    case 2:
//                        console.birthdayPrompt();
//                        break;
//                    case 3:
//                        console.reunionPrompt();
//                        break;
//                    case 4:
//                        try {
//                            console.otherPrompt();
//                        } catch (NumberFormatException e) {
//                            console.invalidResponse();
//                            console.otherPrompt();
//                        }
//                        break;
//                    case 5:
//                        quit = true;
//                        console.displayPrompt("Thank you for visiting us at Abdul's Event Planner");
//                        console.displayPrompt("Goodbye.");
//                        break;
//                    default:
//                        console.invalidResponse();
//                        break;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
