$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Task1.feature");
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
  "duration": 5351386946,
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
  "duration": 251117288,
  "status": "passed"
});
formatter.match({
  "location": "Task1Steps.i_add_all_products_into_the_basket()"
});
formatter.result({
  "duration": 8999714615,
  "status": "passed"
});
formatter.match({
  "location": "Task1Steps.all_products_will_be_in_the_basket()"
});
formatter.result({
  "duration": 1800416158,
  "status": "passed"
});
formatter.match({
  "location": "Task1Steps.sum_of_quantity_and_price_is_correct()"
});
formatter.result({
  "duration": 99500577,
  "status": "passed"
});
formatter.uri("Task2.feature");
formatter.feature({
  "line": 1,
  "name": "Task1",
  "description": "As user\r\nI want to filter products by group",
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
  "duration": 353827945,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Filter products by group",
  "description": "",
  "id": "task1;filter-products-by-group",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Task \"2\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I select \"Sport\" group",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Only products from \"Sport\" group will be visible",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "Task1Steps.i_am_on_Task_page(String)"
});
formatter.result({
  "duration": 176209781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sport",
      "offset": 10
    }
  ],
  "location": "Task2Steps.iSelectGroup(String)"
});
formatter.result({
  "duration": 944672131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sport",
      "offset": 20
    }
  ],
  "location": "Task2Steps.onlyProductsFromGroupWillBeVisible(String)"
});
formatter.result({
  "duration": 424844355,
  "status": "passed"
});
formatter.uri("Task3.feature");
formatter.feature({
  "line": 1,
  "name": "Task3",
  "description": "As user\r\nI want to edit a form",
  "id": "task3",
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
  "duration": 332759474,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit form",
  "description": "",
  "id": "task3;edit-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Task \"3\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I start edit mode",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I change data in form",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click save button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Success message is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Entered data are saved",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "Task1Steps.i_am_on_Task_page(String)"
});
formatter.result({
  "duration": 176580913,
  "status": "passed"
});
formatter.match({
  "location": "Task3Steps.iStartEditMode()"
});
formatter.result({
  "duration": 835836960,
  "status": "passed"
});
formatter.match({
  "location": "Task3Steps.iChangeDataInForm()"
});
formatter.result({
  "duration": 2281475657,
  "status": "passed"
});
formatter.match({
  "location": "Task3Steps.iClickSaveButton()"
});
formatter.result({
  "duration": 186353847,
  "status": "passed"
});
formatter.match({
  "location": "Task3Steps.successMessageIsShown()"
});
formatter.result({
  "duration": 425264486,
  "status": "passed"
});
formatter.match({
  "location": "Task3Steps.enteredDataAreSaved()"
});
formatter.result({
  "duration": 113066610,
  "error_message": "java.lang.AssertionError: Incorrect name: FsvOnc|\r\n\tat pages.executors.Task3Page.assertFormData(Task3Page.java:107)\r\n\tat steps.Task3Steps.enteredDataAreSaved(Task3Steps.java:35)\r\n\tat ✽.And Entered data are saved(Task3.feature:14)\r\n",
  "status": "failed"
});
formatter.uri("Task4.feature");
formatter.feature({
  "line": 1,
  "name": "Task4",
  "description": "As user\r\nI want apply for a job",
  "id": "task4",
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
  "duration": 378743480,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Fill apply form",
  "description": "",
  "id": "task4;fill-apply-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Task \"4\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click apply",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I fill form",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click send button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Success info is shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "Task1Steps.i_am_on_Task_page(String)"
});
formatter.result({
  "duration": 253667209,
  "status": "passed"
});
formatter.match({
  "location": "Task4Steps.iClickApply()"
});
formatter.result({
  "duration": 661164019,
  "status": "passed"
});
formatter.match({
  "location": "Task4Steps.iFillForm()"
});
formatter.result({
  "duration": 1254989513,
  "status": "passed"
});
formatter.match({
  "location": "Task4Steps.iClickSendButton()"
});
formatter.result({
  "duration": 172314711,
  "status": "passed"
});
formatter.match({
  "location": "Task4Steps.successInfoIsShown()"
});
formatter.result({
  "duration": 52961693,
  "status": "passed"
});
formatter.uri("Task5.feature");
formatter.feature({
  "line": 1,
  "name": "Task5",
  "description": "As user\r\nI want to upload text file",
  "id": "task5",
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
  "duration": 345055844,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Upload file with data",
  "description": "",
  "id": "task5;upload-file-with-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Task \"5\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "file with data is prepared",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I upload file",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Imported data are correct",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "Task1Steps.i_am_on_Task_page(String)"
});
formatter.result({
  "duration": 201157098,
  "status": "passed"
});
formatter.match({
  "location": "Task5Steps.fileWithDataIsPrepared()"
});
formatter.result({
  "duration": 9969591,
  "status": "passed"
});
formatter.match({
  "location": "Task5Steps.iUploadFile()"
});
formatter.result({
  "duration": 372079649,
  "status": "passed"
});
formatter.match({
  "location": "Task5Steps.importedDataAreCorrect()"
});
formatter.result({
  "duration": 2223292948,
  "status": "passed"
});
});