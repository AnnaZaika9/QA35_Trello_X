package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @BeforeTest
    public void preConditions() {
        if (app.getUser().isLogged()) {
            app.getUser().logOut();
        }
    }

    @Test
    public void loginPositive1() {
        User user = new User().withEmail("a.horujaya@gmail.com").withPassword("0935455706anna");

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);


        Assert.assertTrue(app.getUser().isLogged());
    }

    @Test
    public void loginPositive2() {
        // User user = new User().withEmail("a.horujaya@gmail.com").withPassword("0935455706anna");


        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm2("a.horujaya@gmail.com","0935455706anna");
        app.getUser().submitLogin();
        app.getUser().pause(2000);


        Assert.assertTrue(app.getUser().isLogged());
    }


}
