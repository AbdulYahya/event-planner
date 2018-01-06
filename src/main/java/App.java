import models.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ConsoleUI console = new ConsoleUI();
        boolean quit = false;

        console.startMenuPrompt();
        while (!quit) {
            int selection = console.getStartMenuPromptInput();

            switch (selection) {
                case 1:
                    try {
                        console.otherPrompt();
                    } catch (NumberFormatException e) {
                        console.invalidResponse();
                        console.otherPrompt();
                    }
                    break;
                case 2:
                    console.displayPrompt("Thank you for visiting us at Abdul's Event Planner");
                    console.displayPrompt("Goodbye.");
                    quit = true;
                    break;
                default:
                    console.invalidResponse();
                    break;
            }
        }
    }
}
