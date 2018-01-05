package models;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;


public class EventTest {
    // Instantiates Correctly
    @Test
    public void newEvent_instantiatesCorrectly() {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        assertEquals(true, testEvent instanceof Event);
    }
}