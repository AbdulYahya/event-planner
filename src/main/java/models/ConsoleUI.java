package models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleUI {
    // Display the prompt to the user
    public void displayPrompt(String stringPrompt) {
        System.out.println(stringPrompt);
    }

    // Display this message if the user's input was an invalid response?
    public void invalidResponse() {
        displayPrompt("Sorry we didn't quite catch that. Please try again!");
    }

    // Start Menu
    public void startMenuPrompt() {
        displayPrompt("Welcome to Abdul's Event planner! What would you like to plan?");
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("1) Wedding");
        displayPrompt("2) Birthday");
        displayPrompt("3) Reunion");
        displayPrompt("4) Other");
        displayPrompt("5) Quit");
    }

    // Menu Selection Prompts
    public void weddingPrompt() {
        displayPrompt("Hip hip hoooray! Congratulations to the newly wed!");
    }

    public void birthdayPrompt() {
        displayPrompt("Happy birthday to the intended recipient of this event!");
    }

    public void reunionPrompt() {
        displayPrompt("We at Abdul's Event planner would like to help you plan the best reunion the earth has ever witnessed!");

    }
    public void otherPrompt() {
        displayPrompt("So, none of the above exactly fits your needs. No worries! We got you covered!");
    }

    // Getter Methods
    public String getUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public int getStartMenuPromptInput() throws IOException {
        boolean validInput = false;
        int userInput = -1;

        while (!validInput) {
            try {
                validInput = true;
                userInput = Integer.parseInt(getUserInput());
            } catch (NumberFormatException e) {
                invalidResponse();
                validInput = false;
            }
        }
        return userInput;
    }
}
