package ua.alekstar.FirstChatUsingTDD;

public class User {
    private User(String userName) {

    }

    public static User create(String userName) {
        return new User(userName);
    }

    public String getName() {
        return "Aleks";
    }
}
