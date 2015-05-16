package ua.alekstar.FirstChatUsingTDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {
    @Test
    public void getTextFromMessageShouldReturnEmptyString() {
        Message message = Message.create();
        assertEquals("", message.getText());
    }
}
