package models;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

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

    // Getter Methods
    @Test
    public void getHashMapEventPrompts_getsHashMapEventPrompts_String() {
        Map<String, String> hashMapEventPrompts = new HashMap<>();
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        hashMapEventPrompts.put("How many guests will be attending?", "30");
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        assertEquals("30", testEvent.getHashMapEventPrompts());
    }
    @Test
    public void getListFoodChoices_getsListFoodChoices_ArrayList() {
        Map<String, String> hashMapEventPrompts = new HashMap<>();
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        hashMapEventPrompts.put("How many guests will be attending?", "30");
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Cake");
        listExpected.add("Lasagna");
        assertEquals(listExpected, testEvent.getListFoodChoices());
    }
    @Test
    public void getListBeverageChoices_getsListBeverageChoices_ArrayList() {
        Map<String, String> hashMapEventPrompts = new HashMap<>();
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        hashMapEventPrompts.put("How many guests will be attending?", "30");
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Soda");
        listExpected.add("Wine");
        assertEquals(listExpected, testEvent.getListBeverageChoices());
    }
    @Test
    public void getListEntertainmentChoices_getsListEntertainmentChoices_ArrayList() {
        Map<String, String> hashMapEventPrompts = new HashMap<>();
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        hashMapEventPrompts.put("How many guests will be attending?", "30");
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Live band");
        listExpected.add("Clown");
        assertEquals(listExpected, testEvent.getListEntertainmentChoices());
    }
    @Test
    public void getIntNumberOfGuests_getsIntNumberOfGuests_int() {
        Map<String, String> hashMapEventPrompts = new HashMap<>();
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        int listExpected = 10;
        hashMapEventPrompts.put("How many guests will be attending?", "30");
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        assertEquals(listExpected, testEvent.getIntNumberOfGuests());
    }

}