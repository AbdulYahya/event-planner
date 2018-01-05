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


}
