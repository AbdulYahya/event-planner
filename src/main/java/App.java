import models.*;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static  spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Static files e.g., Stylesheets, Scripts, Images, etc.
        staticFileLocation("/public");

        // Root Route
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        // Planner Route
        get("/planner", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "planner.hbs");
        }, new HandlebarsTemplateEngine());
        // Created Event Route
        get("/event", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String fName = request.queryParams("fName");
            model.put("fName", fName);
            return new ModelAndView(model, "event.hbs");
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
