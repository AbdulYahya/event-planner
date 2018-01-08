package models;

import java.util.ArrayList;
import java.util.List;

public interface EventProps {
    List<String> mArrayListSelection = new ArrayList<>();

    // Getters
    int getQuantity();
    List<String> getArrayListSelection();

    // Setters
    void setArrayListSelection(String choice);


}
