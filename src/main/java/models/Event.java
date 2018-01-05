package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Event {
//    private Map<String, String> hashMapEventPrompts;
    private List<String> listFoodChoices;
    private List<String> listBeverageChoices;
    private List<String> listEntertainmentChoices;
    private int intNumberOfGuests;

    public Event(int intNumberOfGuests, List<String> listFoodChoices, List<String> listBeverageChoices, List<String> listEntertainmentChoices) {
//        this.hashMapEventPrompts = new HashMap<>();
        this.intNumberOfGuests = intNumberOfGuests;
        this.listFoodChoices = listFoodChoices;
        this.listBeverageChoices = listBeverageChoices;
        this.listEntertainmentChoices = listEntertainmentChoices;
    }

    // Getter Methods
//    public Map<String, String> getHashMapEventPrompts() {
//        return hashMapEventPrompts;
//    }
    public List<String> getListFoodChoices() {
        return listFoodChoices;
    }
    public List<String> getListBeverageChoices() {
        return listBeverageChoices;
    }
    public List<String> getListEntertainmentChoices() {
        return listEntertainmentChoices;
    }
    public int getIntNumberOfGuests() {
        return intNumberOfGuests;
    }
    // Setter Methods
//    public void setHashMapEventPrompts() {
//        int intNumberOfGuests;
//
//        hashMapEventPrompts.put("How many guests will be attending?", intNumberOfGuests);
//    }
}

