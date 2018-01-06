package models;

import java.util.List;

public class Event {
    private List<String> listFoodChoices;
    private List<String> listBeverageChoices;
    private List<String> listEntertainmentChoices;
    private int intNumberOfGuests;

    public Event(int intNumberOfGuests, List<String> listFoodChoices, List<String> listBeverageChoices, List<String> listEntertainmentChoices) {
        this.intNumberOfGuests = intNumberOfGuests;
        this.listFoodChoices = listFoodChoices;
        this.listBeverageChoices = listBeverageChoices;
    }

    public double getDiscountCoupon(double markedPrice, double discountPercentage) {
        double hold = 100 - discountPercentage;
        return (hold * markedPrice) / 100;
    }

    // Getter Methods
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
    public void setListFoodChoices(List<String> listFoodChoices) {
        this.listFoodChoices = listFoodChoices;
    }

    public void setListBeverageChoices(List<String> listBeverageChoices) {
        this.listBeverageChoices = listBeverageChoices;
    }

    public void setListEntertainmentChoices(List<String> listEntertainmentChoices) {
        this.listEntertainmentChoices = listEntertainmentChoices;
    }

    public void setIntNumberOfGuests(int intNumberOfGuests) {
        this.intNumberOfGuests = intNumberOfGuests;
    }
}

