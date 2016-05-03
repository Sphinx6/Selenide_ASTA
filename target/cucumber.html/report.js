$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Task1.feature");
formatter.feature({
  "line": 1,
  "name": "Task1",
  "description": "As user\r\nI want to be able to add items into the basket",
  "id": "task1",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Task1Steps.browser_is_opened()"
});
formatter.result({
  "duration": 10926306885,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add all items to the basket",
  "description": "",
  "id": "task1;add-all-items-to-the-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Task \"1\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I add all products into the basket",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "All products will be in the basket",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Sum of quantity and price is correct",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "Task1Steps.i_am_on_Task_page(String)"
});
formatter.result({
  "duration": 1670364892,
  "status": "passed"
});
formatter.match({
  "location": "Task1Steps.i_add_all_products_into_the_basket()"
});
