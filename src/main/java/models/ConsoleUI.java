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
}
