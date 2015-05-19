package ua.alekstar.FirstChatUsingTDD;

public class User {
    private String name;

    private User(String name) {
        this.name = name;
    }

    public static User create(String name) {
        return new User(name);
    }

    public String getName() {
        return this.name;
    }
}
