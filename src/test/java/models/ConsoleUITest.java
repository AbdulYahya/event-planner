package models;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleUITest {
    @Test
    public void newConsoleUI_instantiatesCorrectly() {
        ConsoleUI testConsole = new ConsoleUI();
        assertEquals(true, testConsole instanceof ConsoleUI);
    }

    @Test
    public void displayPrompt_displaysPrompt_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        testConsole.displayPrompt("Hello");
        assertEquals("Hello\n", outContent.toString());
    }

    @Test
    public void invalidResponse_displaysInvalidResponse_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        testConsole.invalidResponse();
        assertEquals("Sorry we didn't quite catch that. Please try again!\n", outContent.toString());
    }

    @Test
    public void startMenuPrompt_displaysStartMenu_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "Welcome to Abdul's Event planner! What would you like to plan?\n" +
                "--------------------------------------------------------------\n" +
                "1) Wedding\n" +
                "2) Birthday\n" +
                "3) Reunion\n" +
                "4) Other\n" +
                "5) Quit\n";

        testConsole.startMenuPrompt();
        assertEquals(expected, outContent.toString());
    }

    // Event type tests
    @Test
    public void weddingPrompt_displaysWeddingPrompt_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "Hip hip hoooray! Congratulations to the newly wed!\n";

        testConsole.weddingPrompt();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void birthdayPrompt_displaysBirthdayPrompt_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "Happy birthday to the intended recipient of this event!\n";

        testConsole.birthdayPrompt();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void reunionPrompt_displaysReunionPrompt_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "We at Abdul's Event planner would like to help you plan the best reunion the earth has ever witnessed!\n";

        testConsole.reunionPrompt();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void otherPrompt_displaysOtherPrompt_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "So, none of the above exactly fits your needs. No worries! We got you covered!\n";

        testConsole.otherPrompt();
        assertEquals(expected, outContent.toString());
    }

    // Getter Methods
    @Test
    public void getUserInput_getsUserInput_String() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        String expected = "Hello World";
        InputStream inContent = new ByteArrayInputStream(expected.getBytes());
        System.setIn(inContent);

        assertEquals(expected, testConsole.getUserInput());
    }

    @Test
    public void getStartMenuPromptInput_getsStartMenuPromptInput_int() throws Exception {
        ConsoleUI testConsole = new ConsoleUI();
        String expected = "10";
        InputStream inContent = new ByteArrayInputStream(expected.getBytes());
        System.setIn(inContent);

        assertEquals(10, testConsole.getStartMenuPromptInput());
    }
}