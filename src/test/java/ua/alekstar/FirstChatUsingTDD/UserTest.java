package ua.alekstar.FirstChatUsingTDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldGetNameReturnAleks() {
        User aleks = User.create("Aleks");
        assertEquals("Aleks", aleks.getName());
    }
}
