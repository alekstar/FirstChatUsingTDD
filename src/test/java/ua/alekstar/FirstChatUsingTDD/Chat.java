package ua.alekstar.FirstChatUsingTDD;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    List<Message> messages;

    public Chat() {
        messages = new ArrayList<Message>();
    }

    public static Chat create() {
        return new Chat();
    }

    public void addMessage(Message helloWorld) {
        getMessagesList().add(helloWorld);
    }

    protected List<Message> getMessagesList() {
        return this.messages;
    }
}
