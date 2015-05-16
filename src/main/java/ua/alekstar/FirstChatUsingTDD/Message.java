package ua.alekstar.FirstChatUsingTDD;

public class Message {

    private Message() {

    }

    public static Message create() {
        return new Message();
    }

    public String getText() {
        return "";
    }

}
