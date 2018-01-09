package models;

import java.util.ArrayList;
import java.util.List;

public class FoodProp implements EventProps {
    private List<String> mArrayListSelection;
    private String eachEntree;
    private int mQuantity;

    public FoodProp(int quantity, List<String> arrayListSelection) {
        mArrayListSelection = arrayListSelection;
        mQuantity = quantity;
    }

    // Abstract Methods
//    public List<String> addChoices(String choice) {
//        mArrayListChoices.add(choice);
//
//        return mArrayListChoices;
//    }

    // Getters
    public int getQuantity() {
        return mQuantity;
    }

//    public String getEachEntree(List<String> arrayListSelection) {
//
//        for (String entree : arrayListSelection) {
//            return entree;
//        }
//        return eachEntree;
//    }
    public List<String> getArrayListSelection() {
        return mArrayListSelection;
    }

    // Setters
    public void setArrayListSelection(String choice) {
        mArrayListSelection.add(choice);
    }

}
