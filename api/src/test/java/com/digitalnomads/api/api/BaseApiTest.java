package com.digitalnomads.api.api;

import com.digitalnomads.api.api.demo.application.TalentLMSBaseEndPoints;
import com.digitalnomads.api.api.demo.controllers.UserController;
import org.testng.annotations.BeforeSuite;

public class BaseApiTest {
    protected UserController userController;
    @BeforeSuite(alwaysRun = true)
    public void setUpControllers(){
        this.userController = new UserController(TalentLMSBaseEndPoints.BASE_URL);
    }
}
