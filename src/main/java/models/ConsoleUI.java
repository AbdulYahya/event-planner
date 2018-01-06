package models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleUI {
    private List<String> listFoodChoices = new ArrayList<>();
    private List<String> listBeverageChoices = new ArrayList<>();
    private List<String> listEntertainmentChoices = new ArrayList<>();
    private int intNumberOfGuests;
    public Event event = new Event(intNumberOfGuests, listFoodChoices, listBeverageChoices, listEntertainmentChoices);

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
    public void otherPrompt() throws IOException {
        int amountOfFoodChoices;
        int amountOfBeverageChoices;
        int amountOfEntertainmentChoices;

        displayPrompt("So, none of the above exactly fits your needs. No worries! We got you covered!");
        displayPrompt("--------------------------------------------------------------");

        // Gather data required by our Event class
        //    Ex.  Event event = new Event(int, List<String>, List<String>, List<String>)
        displayPrompt("How many guests are you expecting?");
        intNumberOfGuests = Integer.parseInt(getUserInput());

        displayPrompt("How many different entrees would you like to have served?");
        amountOfFoodChoices = Integer.parseInt(getUserInput());
        for (int counter = 1; counter <= amountOfFoodChoices; counter++) {
            displayPrompt("What will Entree #" + counter +  " be?");
            listFoodChoices.add(getUserInput());
        }

        displayPrompt("How many different beverages would you like to have served?");
        amountOfBeverageChoices = Integer.parseInt(getUserInput());
        for (int counter = 1; counter <= amountOfBeverageChoices; counter++) {
            displayPrompt("What will beverage #" + counter +  " be?");
            listBeverageChoices.add(getUserInput());
        }

        displayPrompt("Here at Abdul's event planners, we promise to deliver whatever and however many, entertainments you want or your money back!");
        displayPrompt("How many entertainments/entertainers would you like at your event?");
        amountOfEntertainmentChoices = Integer.parseInt(getUserInput());

        for (int counter = 1; counter <= amountOfEntertainmentChoices; counter++) {
            displayPrompt("What/who will entertainment/entertainer #" + counter +  " be?");
            listEntertainmentChoices.add(getUserInput());
        }

        // Call our Event class instance we instantiated above
        // Set all the data our Event class requires
        event.setIntNumberOfGuests(intNumberOfGuests);
        event.setListFoodChoices(listFoodChoices);
        event.setListBeverageChoices(listBeverageChoices);
        event.setListEntertainmentChoices(listEntertainmentChoices);

        System.out.println(event.getListFoodChoices());
        System.out.println(event.getListBeverageChoices());
        System.out.println(event.getListEntertainmentChoices());
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
