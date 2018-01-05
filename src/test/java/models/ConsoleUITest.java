package models;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ConsoleUITest {
    // Instantiation Test
    @Test
    public void newConsoleUI_instantiatesCorrectly() {
        ConsoleUI testConsole = new ConsoleUI();
        assertEquals(true, testConsole instanceof ConsoleUI);
    }

    // Display Test
    @Test
    public void displayPrompt_displaysPrompt_String() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsoleUI testConsole = new ConsoleUI();
        testConsole.displayPrompt("Hello");
        assertEquals("Hello\n", outContent.toString());
    }
    @Test
    public void invalidResponse_displaysInvalidResponse_String() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsoleUI testConsole = new ConsoleUI();
        testConsole.invalidResponse();
        assertEquals("Sorry we didn't quite catch that. Please try again!\n", outContent.toString());
    }

    // Start Menu Test
    @Test
    public void startMenuPrompt_displaysStartMenu_String() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsoleUI testConsole = new ConsoleUI();
        testConsole.startMenuPrompt();
        String expected = "Welcome to Abdul's Event planner! What would you like to plan?\n " +
                "--------------------------------------------------------------\n" +
                "1) Wedding\n" +
                "2) Birthday\n" +
                "3) Reunion\n" +
                "4) Other\n" +
                "5) Quit\n";
        assertEquals(expected, outContent.toString());

    }
}