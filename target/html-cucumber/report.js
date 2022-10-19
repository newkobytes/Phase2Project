$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featuresphase2/HomePage.feature");
formatter.feature({
  "name": "Adding Products",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launched to Swaglink",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_launched_to_Swaglink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username and password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Loginbutton of Swag page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_click_on_Loginbutton_of_Swag_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "I click product name  \"Sauce Labs Backpack\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_click_product_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I land on Add to cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_land_on_Add_to_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.i_click_on_Add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My basket value is changed to \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.HomePageStepdefs.my_basket_value_is_changed_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featuresphase2/Login.feature");
formatter.feature({
  "name": "Login Feature of Swag labs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This scenario is login the Swag path using valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_enter_the_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_should_land_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to login the swag path using incorrect credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the incorrect username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_enter_the_incorrect_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the error message \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.LoginStepdefs.i_should_get_the_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});