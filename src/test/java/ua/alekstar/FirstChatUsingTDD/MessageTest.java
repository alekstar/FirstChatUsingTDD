package ua.alekstar.FirstChatUsingTDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {
    @Test
    public void getTextFromMessageShouldReturnEmptyString() {
        Message message = Message.create();
        assertEquals("", message.getText());
    }

    @Test
    public void getTextFromMessageShouldReturnHelloWorld() {
        Message message = Message.create("Hello, World!");
        assertEquals("Hello, World!", message.getText());
    }
}
