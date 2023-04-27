package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenu_StepDefs {
    /**
     * Scenario 1:
     * Login as Teacher
     * At first get the text of welcome
     * Then go to Developers menu and get the text of Developers
     * <p>
     * Scenario 2:
     * Login as Student
     * Get the text of welcome
     * Then go to All Posts menu and get the text of Posts
     * <p>
     * Scenario 3:
     * Login as Teacher
     * Get the text of welcome
     * Then go to My Account menu and get the text of Dashboard
     * <p>
     * -Write scenarios
     * -Create step definitions
     * -No need to use any JAVA code.
     * -Just implement the step definitions by adding print statement.
     * -Create new class NavigationMenuStepDefs
     */
DashboardPage dashboardPage=new DashboardPage();

    @Given("The user is on Login Page")
    public void the_user_is_on_login_page() {
        System.out.println("The user runs the browser and navigates to Login Page");
    }

  //  @When("The user enters the teacher credentials")
   // public void the_user_enters_the_teacher_credentials() {
   //     System.out.println("The user enters the user data");
//    }

    @Then("The user gets the Welcome text")
    public void the_user_gets_the_welcome_text() {
        System.out.println(" The user can log in successfully and gets the verification text.");
    }

    @And("The user navigates to Developers Menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("The user clicks the Developer Menu and navigates the Developers Page");
    }

    @Then("The user gets the Developers Text")
    public void the_user_gets_the_developers_text() {
        System.out.println("The user can navigate to Developer Menu and verify it by getting Developer text");
    }

    @And("The user navigates to All Posts Menu")
    public void the_user_navigates_to_all_posts_menu() {
        System.out.println("The user clicks the All Posts Menu and navigates the All Posts Page");
    }

    @Then("The user gets the Posts text")
    public void the_user_gets_the_posts_text() {
        System.out.println("The user can navigate to All Posts Menu and verify it by getting Posts text");

    }

    @Then("The user navigates to My Account Menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("The user clicks the My Accounts Menu and navigates the My Account Page");
    }


    @Then("The user gets the Dashboard text")
    public void the_user_gets_the_dashboard_text() {
        System.out.println("The user can navigate to My Account Menu and verify it by getting Dashboard text");

    }
    @Then("The user navigates to {string} Menu")
    public void the_user_navigates_to_menu(String developers) {
        dashboardPage.navigateToMenu(developers);

    }
    @Then("The user should be able to see the header as {string}")
    public void the_user_should_be_able_to_see_the_header_as(String headerName) {
        BrowserUtils.waitFor(2);
        String actualText=dashboardPage.getHeaderText2(headerName);
        Assert.assertEquals("Verify that header name is displayed",headerName,"Invalid Credentials!");

    }

}
