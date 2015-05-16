package ua.alekstar.FirstChatUsingTDD;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChatTest {

    private boolean isMessageAtList(Message message, List<Message> list) {
        return list.contains(message);
    }

    @Test
    public void shouldHelloWorldMessageBeAtChatMessageList() {
        Chat chat = Chat.create();
        Message helloWorld = Message.create("Hello, World!");
        chat.addMessage(helloWorld);
        assertTrue(isMessageAtList(helloWorld, chat.getMessagesList()));
    }
}
