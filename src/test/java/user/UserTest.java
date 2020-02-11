package user;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void shouldWelcomeTheUserToBibliotecaApp() {
        User user = new User();
        user.startApp();


    }

}