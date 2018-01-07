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

    // Instantiate an instance of our Event class
    private Event event = new Event(intNumberOfGuests, listFoodChoices, listBeverageChoices, listEntertainmentChoices);

    public void displayPrompt(String stringPrompt) {
        System.out.println(stringPrompt);
    }

    public void invalidResponse() {
        displayPrompt("Sorry we didn't quite catch that. Please try again!");
    }

    public void startMenuPrompt() {
        displayPrompt("Welcome to Abdul's Event planner! What would you like to plan?");
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("1) Wedding");
        displayPrompt("2) Birthday");
        displayPrompt("3) Reunion");
        displayPrompt("4) Custom");
        displayPrompt("5) Quit");
    }

    public void weddingPrompt() {
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("Hip hip hoooray! Congratulations to the newly wed!");
        displayPrompt("Sorry! This service is coming soon! Please try again tomorrow.");
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("");
        startMenuPrompt();
    }

    public void birthdayPrompt() {
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("Happy birthday to the intended recipient of this event!");
        displayPrompt("Sorry! This service is coming soon! Please try again tomorrow.");
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("");
        startMenuPrompt();
    }

    public void reunionPrompt() {
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("We at Abdul's Event planner would like to help you plan the best reunion the earth has ever witnessed!");
        displayPrompt("Sorry! This service is coming soon! Please try again tomorrow.");
        displayPrompt("--------------------------------------------------------------");
        displayPrompt("");
        startMenuPrompt();}

    public void otherPrompt() throws IOException {
        int amountOfFoodChoices;
        int amountOfBeverageChoices;
        int amountOfEntertainmentChoices;

        displayPrompt("So, none of the above exactly fits your needs. No worries! We got you covered!");
        displayPrompt("--------------------------------------------------------------");

        displayPrompt("How many guests are you expecting?");
        intNumberOfGuests = Integer.parseInt(getUserInput());
        if (intNumberOfGuests > 0) {
            displayPrompt("How many different entrees would you like to have served?");
            amountOfFoodChoices = Integer.parseInt(getUserInput());
            if (amountOfFoodChoices > 0) {
                for (int counter = 1; counter <= amountOfFoodChoices; counter++) {
                    displayPrompt("What will Entree #" + counter +  " be?");
                    listFoodChoices.add(getUserInput());
                }
            } else {
                displayPrompt("No Food at this event? Well okay, if you say so...");
            }

            displayPrompt("How many different beverages would you like to have served?");
            amountOfBeverageChoices = Integer.parseInt(getUserInput());
            if (amountOfBeverageChoices > 0) {
                for (int counter = 1; counter <= amountOfBeverageChoices; counter++) {
                    displayPrompt("What will beverage #" + counter +  " be?");
                    listBeverageChoices.add(getUserInput());
                }
            } else {
                displayPrompt("No beverages at this event? Well okay, if you say so...");
            }

            displayPrompt("Here at Abdul's event planners, we promise to deliver whatever and however many, entertainments you want or your money back!");
            displayPrompt("How many entertainments/entertainers would you like at your event?");
            amountOfEntertainmentChoices = Integer.parseInt(getUserInput());
            if (amountOfEntertainmentChoices > 0) {
                for (int counter = 1; counter <= amountOfEntertainmentChoices; counter++) {
                    displayPrompt("What/who will entertainment/entertainer #" + counter +  " be?");
                    listEntertainmentChoices.add(getUserInput());
                }
            } else {
                displayPrompt("No entertainment/entertainer at this event? Well okay, if you say so...");
            }

            printReceipt();

        } else {
            displayPrompt("Can't have an event with no guests....");
        }

        displayPrompt("Thank you for choosing Abdul's Event planner");
        displayPrompt("See you soon!");
        System.exit(-1);
    }

    private void printReceipt() {
        event.setIntNumberOfGuests(intNumberOfGuests);
        event.setListFoodChoices(listFoodChoices);
        event.setListBeverageChoices(listBeverageChoices);
        event.setListEntertainmentChoices(listEntertainmentChoices);

        displayPrompt("");
        displayPrompt("Receipt");
        displayPrompt("+++++++++++++++++++++++++++++++++++++");
        if (intNumberOfGuests >= 150 || listFoodChoices.size() >= 5 || listBeverageChoices.size() >= 5 || listEntertainmentChoices.size() >= 3) {
            displayPrompt("The following Discounts were applied!\n");

            if (intNumberOfGuests >= 150) {
                displayPrompt("30% off Guest fee! - Original price per guest: $50 **Discounted price per guest: $35**");
            }
            if (listFoodChoices.size() >= 5) {
                displayPrompt("15% off all Entrees! - Original price per entree: $900 **Discounted price per entree: $765**");
            }
            if (listBeverageChoices.size() >= 5) {
                displayPrompt("15% off all Beverages! - Original price per beverage: $700 **Discounted price per beverage: $595**");
            }
            if (listEntertainmentChoices.size() >= 3) {
                displayPrompt("10% off all Entertainments/Entertainers! - Original price per entertainment/er: $1500 **Discounted price per entertainment/er: $1350**");
            }

            displayPrompt("+++++++++++++++++++++++++++++++++++++\n");
        }

        displayPrompt("Guests attending:               " + event.getIntNumberOfGuests());
        displayPrompt("Number of entrees:              " + event.getListFoodChoices().size());
        displayPrompt("Number of beverages:            " + event.getListBeverageChoices().size());
        displayPrompt("Number of Entertainments/ers:   " + event.getListEntertainmentChoices().size());
        displayPrompt("");
        displayPrompt("Event Cost:                    $" + calculateEventCost());
    }

    private double calculateEventCost() {
        double totalCost = 0;

        if (event.getIntNumberOfGuests() > 0) {
            if (event.getIntNumberOfGuests() >= 150) {
                displayPrompt("Price per guest:               $35");
                totalCost += event.getDiscountCoupon(50, 30) * event.getIntNumberOfGuests();
            } else {
                displayPrompt("Price per guest:               $50");
                totalCost += 50 * event.getIntNumberOfGuests();
            }

            if (event.getListFoodChoices().size() > 0 ) {
                if (event.getListFoodChoices().size() >= 5) {
                    displayPrompt("Price per entree:              $765");
                    totalCost += event.getDiscountCoupon(900, 15) * event.getListFoodChoices().size();
                } else {
                    displayPrompt("Price per entree:              $900");
                    totalCost += 900 * event.getListFoodChoices().size();
                }
            }

            if (event.getListBeverageChoices().size() > 0) {
                if (event.getListBeverageChoices().size() >= 5) {
                    displayPrompt("Price per beverage:            $595");
                    totalCost += event.getDiscountCoupon(700, 15) * event.getListBeverageChoices().size();
                } else {
                    displayPrompt("Price per beverage:            $700");
                    totalCost += 700 * event.getListBeverageChoices().size();
                }
            }

            if (event.getListEntertainmentChoices().size() > 0) {
                if (event.getListEntertainmentChoices().size() >= 3) {
                    displayPrompt("Price per entertainment/er:    $1350");
                    totalCost += event.getDiscountCoupon(1500, 10) * event.getListEntertainmentChoices().size();
                } else {
                    displayPrompt("Price per entertainment/er:    $1500");
                    totalCost += 1500 * event.getListEntertainmentChoices().size();
                }
            }
        }
        displayPrompt("                               ------");
        return totalCost;
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
