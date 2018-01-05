package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Event {
    private Map<String, String> hashMapEventPrompts;
    private List<String> listFoodChoices;
    private List<String> listBeverageChoices;
    private List<String> listEntertainmentChoices;
    private int intNumberOfGuests;

    public Event(int intNumberOfGuests, List<String> listFoodChoices, List<String> listBeverageChoices, List<String> listEntertainmentChoices) {
        this.hashMapEventPrompts = new HashMap<>();
        this.intNumberOfGuests = intNumberOfGuests;
        this.listFoodChoices = listFoodChoices;
        this.listBeverageChoices = listBeverageChoices;
        this.listEntertainmentChoices = listEntertainmentChoices;
    }

    // Getter Methods
    public Map<String, String> getHashMapEventPrompts() {
        return null;
    }
    public List<String> getListFoodChoices() {
        return null;
    }
    public List<String> getListBeverageChoices() {
        return null;
    }
    public List<String> getListEntertainmentChoices() {
        return null;
    }
    public int getIntNumberOfGuests() {
        return 0;
    }
    // Setter Methods

}

