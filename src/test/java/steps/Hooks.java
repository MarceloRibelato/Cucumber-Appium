package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.MobileDriverManager;

import java.io.IOException;

public class Hooks {

    @Before
    public static void driverStart() {
        try {
            MobileDriverManager.createDriver();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public static void driverRefresh() {
        MobileDriverManager.relaunchApp();
    }
}
