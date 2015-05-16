package ua.alekstar.FirstChatUsingTDD;

public class Message {
    private String text;

    private Message() {
        this.text = "";
    }

    private Message(String text) {
        this.text = text;
    }

    public static Message create() {
        return new Message();
    }

    public String getText() {
        return this.text;
    }

    public static Message create(String text) {
        return new Message(text);
    }

}
