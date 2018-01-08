package models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FoodPropTest {
    List<String> arrayListFoodChoices = new ArrayList<>();

    @Before
    public void setup() throws Exception {
        arrayListFoodChoices.add("Lasagna");
    }

    @Test
    public void newFoodProp_InstantiatesCorrectly() throws Exception {
        FoodProp testFoodProp = new FoodProp(10, arrayListFoodChoices);
        assertTrue(testFoodProp instanceof FoodProp);
    }

    @Test
    public void setArrayListFoodSelection_setsArrayListFoodSelection_ArrayList() throws Exception {
        FoodProp testFoodProp = new FoodProp(10, arrayListFoodChoices);

        testFoodProp.setArrayListSelection("Pizza");
        testFoodProp.setArrayListSelection("Cake");
        assertEquals(arrayListFoodChoices, testFoodProp.getArrayListSelection());
    }
}