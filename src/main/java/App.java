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
                    console.weddingPrompt();
                    break;
                case 2:
                    console.birthdayPrompt();
                    break;
                case 3:
                    console.reunionPrompt();
                    break;
                case 4:
                    console.otherPrompt();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    console.displayPrompt("What?");
                    break;
            }
        }

    }
}
