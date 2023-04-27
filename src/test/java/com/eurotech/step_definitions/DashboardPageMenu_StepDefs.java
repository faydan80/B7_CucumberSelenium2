package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;
import java.util.Map;

public class DashboardPageMenu_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see submenu")
    public void the_user_should_be_able_to_see_submenu(List<String> expectedList) {

        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualMenuList = BrowserUtils.getElementsText(dashboardPage.menuList);
        System.out.println("How many Members does the list have? " + actualMenuList.size());
      /*  for (WebElement element: dashboardPage.menuList){
            actualMenuList.add(element.getText());
        }
       */
        System.out.println("How many Members does the list have? " + actualMenuList.size());
        Assert.assertEquals(expectedList, actualMenuList);

    }

    @When("The user logs in with the following credentials")
    public void the_user_logs_in_with_the_following_credentials(Map<String, String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login(userCredentials.get("userName"), userCredentials.get("password"));
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(userCredentials.get("message")));

    }

    @Then("The user should be able to see editAdd menu")
    public void the_user_should_be_able_to_see_edit_add_menu(List<String>expectedMenu) {
        System.out.println("expectedMenu.size() = " + expectedMenu.size());
        System.out.println("expectedMenu = " + expectedMenu);
        List<String>actualMenu=BrowserUtils.getElementsText(dashboardPage.editAddMenu);
        System.out.println(actualMenu);
        Assert.assertEquals(expectedMenu,actualMenu);


    }
}
