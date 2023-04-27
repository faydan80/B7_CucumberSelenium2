package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Definitios {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("The user enters the teacher credentials")
    public void the_user_enters_the_teacher_credentials() {
        //System.out.println("The user enters the user data");
        //Assert.assertFalse((100+1)>100);
        loginPage.login();

    }

    @Then("The user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
        //System.out.println("The user can successfully log in");
        String actualMessage = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMessage.contains("Welcome"));

    }

    @Given("The user is on the log in Page")
    public void the_user_is_on_the_log_in_page() {
        //System.out.println("The user runs the browser and navigates to the website");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user enters the student credentials")
    public void the_user_enters_the_student_credentials() {
        //  System.out.println("The user enters the user data");
        loginPage.loginAsStudent();
    }

    @When("The user enters the developer credentials")
    public void the_user_enters_the_developer_credentials() {
        //System.out.println("The user enters the user data");
        loginPage.loginAsDeveloper();
    }

    @When("The user enters the SDET credentials")
    public void the_user_enters_the_sdet_credentials() {
        System.out.println("The user enters the user data");
    }


    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String userEmail, String userPassword) {
        System.out.println(userEmail);
        System.out.println(userPassword);
        loginPage.login(userEmail, userPassword);

    }

    @Then("The Welcome Message contains {string}")
    public void the_welcome_message_contains(String expectedUserName) {
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println(actualMessage);
        System.out.println(expectedUserName);
        Assert.assertTrue(actualMessage.contains(expectedUserName));

    }

    @Then("The user shouldn't be able to log in")
    public void the_user_shouldn_t_be_able_to_log_in() {
        String actualMessage=loginPage.warningMessage.getText();
        Assert.assertEquals("Verify if the Warning message is visible",actualMessage,"Invalid Credentials!");

    }
    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedMessage) {
        String actualMessage=loginPage.warningMessage.getText();
        Assert.assertNotEquals("Verify that the messages are not same",expectedMessage,actualMessage);

    }
}

