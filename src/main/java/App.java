import models.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ConsoleUI console = new ConsoleUI();
        boolean quit = false;

        try {
            console.startMenuPrompt();
            while (!quit) {
                int selection = console.getStartMenuPromptInput();

                switch (selection) {
                    case 1:
                        console.weddingPrompt();
                        break;
                    case 2:
                        console.birthdayPrompt();
                        break;
                    case 3:
                        console.reunionPrompt();
                        break;
                    case 4:
                        try {
                            console.otherPrompt();
                        } catch (NumberFormatException e) {
                            console.invalidResponse();
                            console.otherPrompt();
                        }
                        break;
                    case 5:
                        quit = true;
                        console.displayPrompt("Thank you for visiting us at Abdul's Event Planner");
                        console.displayPrompt("Goodbye.");
                        break;
                    default:
                        console.invalidResponse();
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
