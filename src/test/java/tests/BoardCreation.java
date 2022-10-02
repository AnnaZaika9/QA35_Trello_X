package tests;

import model.Board;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{

    @BeforeMethod
    public void preconditions(){
        User user = new User().withEmail("a.horujaya@gmail.com").withPassword("0935455706anna");
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm2("a.horujaya@gmail.com","0935455706anna");
        app.getUser().submitLogin();
        app.getUser().pause(2000);
    }

    @Test
    public void boardCreation1(){

        Board board = new Board().withTitle("QA35");

        int boardCountBeforeCreation = app.getBoard().getBoardCount();

        app.getBoard().initBoardCreation();
        app.getBoard().fillInBoardCreationForm(board);
        app.getBoard().scrolldownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();

        int boardCountAfterCreation = app.getBoard().getBoardCount();

        Assert.assertEquals(boardCountAfterCreation, boardCountBeforeCreation + 1);
    }
}



