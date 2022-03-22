package activities.calculator;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button twoButton = new Button(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
    public Button plusButton = new Button(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
    public Button fiveButton = new Button(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
    public Button equalsButton = new Button(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
    public Label resultLabel = new Label(By.id("com.sec.android.app.popupcalculator:id/txtCalc"));
}
