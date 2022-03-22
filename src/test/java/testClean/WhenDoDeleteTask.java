package testClean;

import activities.whenDo.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;
import java.net.MalformedURLException;
import java.util.Date;

public class WhenDoDeleteTask {
    MainScreen mainScreen= new MainScreen();
    TaskCreationScreen taskCreationScreen = new TaskCreationScreen();
    TaskEditingScreen taskEditingScreen = new TaskEditingScreen();
    long microSec = new Date().getTime();
    int random = (int) (microSec%10000);
    String name = "Project" + random;
    String descp = "Description" + random;

    @Test
    public void deleteTest() throws MalformedURLException, InterruptedException {
        // Create Task
        mainScreen.addTaskButton.click();
        taskCreationScreen.createTask(name,descp);
        Thread.sleep(2000);
        String actualResult=mainScreen.getTaskName(name);
        Thread.sleep(2000);
        Assertions.assertEquals(name,actualResult,"ERROR, no se pudo crear la Tarea");

        // Delete Task
        taskEditingScreen.clickTaskName(name);
        Thread.sleep(2000);
        taskEditingScreen.deleteTaskButton.click();
        Thread.sleep(2000);
        taskEditingScreen.confirmDeleteButton.click();
        Thread.sleep(5000);
        Assertions.assertFalse(mainScreen.isTaskNameDisplayed(name), "ERROR, no se pudo borrar la Tarea");

    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
