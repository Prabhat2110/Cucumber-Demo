$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:createOrder.feature");
formatter.feature({
  "name": "Creating a valid order",
  "description": "  A functionality to check if valid order is created",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid order created",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "A trader wants to create an order",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.a_trader_wants_to_create_an_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He wants to buy 350 \"Experian\" shares at 2500",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.he_wants_to_buy_shares_at(Double,String,Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A valid order should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.a_valid_order_should_be_created()"
});
formatter.result({
  "status": "passed"
});
});