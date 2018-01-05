package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsoleUITest {
    // Instantiation Test
    @Test
    public void newConsoleUI_instantiatesCorrectly() {
        ConsoleUI testConsole = new ConsoleUI();
        assertEquals(false, testConsole instanceof ConsoleUI);
    }
}