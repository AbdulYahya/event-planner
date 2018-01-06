package models;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class EventTest {
    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
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

    @Test
    public void getDiscountCoupon_getsDiscountCoupon_double() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        assertEquals(35, testEvent.getDiscountCoupon(50, 30), 0);

    }

    @Test
    public void getListFoodChoices_getsListFoodChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
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
    public void getListBeverageChoices_getsListBeverageChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
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
    public void getListEntertainmentChoices_getsListEntertainmentChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
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
    public void getIntNumberOfGuests_getsIntNumberOfGuests_int() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        int listExpected = 10;
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        assertEquals(listExpected, testEvent.getIntNumberOfGuests());
    }

    @Test
    public void setListFoodChoices_setsListFoodChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Spaghetti");
        listExpected.add("Cheese Cake");
        testEvent.setListFoodChoices(listExpected);
        assertEquals(listExpected, testEvent.getListFoodChoices());
    }

    @Test
    public void setListBeverageChoices_setsListBeverageChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Water");
        listExpected.add("Whiskey");
        testEvent.setListBeverageChoices(listExpected);
        assertEquals(listExpected, testEvent.getListBeverageChoices());
    }

    @Test
    public void setListEntertainmentChoices_setsListEntertainmentChoices_ArrayList() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        List<String> listExpected = new ArrayList<>();
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        listExpected.add("Guest Speaker");
        listExpected.add("Magician");
        testEvent.setListEntertainmentChoices(listExpected);
        assertEquals(listExpected, testEvent.getListEntertainmentChoices());
    }

    @Test
    public void setIntNumberOfGuests_setsIntNumberOfGuests_int() throws Exception {
        List<String> testFoodChoices = new ArrayList<>();
        List<String> testBeverageChoices = new ArrayList<>();
        List<String> testEntertainmentChoices = new ArrayList<>();
        int listExpected = 10;
        testFoodChoices.add("Cake");
        testFoodChoices.add("Lasagna");
        testBeverageChoices.add("Soda");
        testBeverageChoices.add("Wine");
        testEntertainmentChoices.add("Live band");
        testEntertainmentChoices.add("Clown");

        Event testEvent = new Event(10, testFoodChoices, testBeverageChoices, testEntertainmentChoices);
        testEvent.setIntNumberOfGuests(listExpected);
        assertEquals(listExpected, testEvent.getIntNumberOfGuests());
    }

}