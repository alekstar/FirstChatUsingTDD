package ua.alekstar.FirstChatUsingTDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {
    @Test
    public void getTextFromMessageShouldEmptyString() {
        Message message = Message.create();
        assertEquals("", message.getText());
    }
}
