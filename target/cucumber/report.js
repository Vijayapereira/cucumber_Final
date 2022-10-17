$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Automation.feature");
formatter.feature({
  "line": 2,
  "name": "Background color validation",
  "description": "",
  "id": "background-color-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.before({
  "duration": 1978327500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "1 Sky Blue Background Is Visible",
  "description": "",
  "id": "background-color-validation;1-sky-blue-background-is-visible",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set Sky Blue Background Button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.set_Sky_Blue_Background_Button_exists()"
});
formatter.result({
  "duration": 541433400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 365014500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 1894800,
  "status": "passed"
});
formatter.before({
  "duration": 1251925200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "2 White Background Is Visible",
  "description": "",
  "id": "background-color-validation;2-white-background-is-visible",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set Sky White Background Button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on that button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.set_Sky_White_Background_Button_exists()"
});
formatter.result({
  "duration": 421059100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_that_button()"
});
formatter.result({
  "duration": 368405600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 22600,
  "status": "passed"
});
});