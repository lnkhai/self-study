$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cukejvm/simple_new_postpaid_order.feature");
formatter.feature({
  "id": "create-a-simple-order-in-postpaid-shop",
  "description": "",
  "name": "Create a simple order in Postpaid Shop",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 9737305000,
  "status": "passed"
});
formatter.before({
  "duration": 202000,
  "status": "passed"
});
formatter.scenario({
  "id": "create-a-simple-order-in-postpaid-shop;create-new-postpaid-mobile-plan-order",
  "tags": [
    {
      "name": "@Development",
      "line": 3
    }
  ],
  "description": "",
  "name": "Create New Postpaid Mobile Plan Order",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "customer want to make New Postpaid Order",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "customer open Postpaid Explore page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "select offer with code \"116398-tso_ma-55-24\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "customer click \"Next\" at \"What you need to order\" module",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "customer select memory size 32GB and Grey color at \"Customise Device\" module",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "customer select no extra SIM at Shared Data form",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "customer select Add-On with code:",
  "keyword": "And ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "addOnCode",
        "addOnName",
        "addOnPrice"
      ],
      "line": 12
    },
    {
      "cells": [
        "vas-newphonefeeling-1000",
        "New Phone Feeling",
        "1000"
      ],
      "line": 13
    },
    {
      "cells": [
        "vas-stayconnected-basic-1300",
        "StayConnected",
        "1300"
      ],
      "line": 14
    }
  ]
});
formatter.step({
  "name": "customer input their name and date of birth",
  "keyword": "And ",
  "line": 15
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 22
    }
  ],
  "location": "CheckOutPageStepDefs.customerWantToBuyPostpaidOrder(String)"
});
formatter.result({
  "duration": 144351000,
  "status": "passed"
});
formatter.match({
  "location": "ExplorePageStepDefs.customerOpenExplorePage()"
});
formatter.result({
  "duration": 10594887000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "116398-tso_ma-55-24",
      "offset": 24
    }
  ],
  "location": "ExplorePageStepDefs.customerSelectOffer(String)"
});
formatter.result({
  "duration": 8603109000,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.customerInputWhatYouNeedModule()"
});
formatter.result({
  "duration": 1696974000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32GB",
      "offset": 28
    },
    {
      "val": "Grey",
      "offset": 37
    }
  ],
  "location": "CheckOutPageStepDefs.selectSizeAndColorModule(String,String)"
});
formatter.result({
  "duration": 4458383000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "no",
      "offset": 16
    }
  ],
  "location": "CheckOutPageStepDefs.selectShareDataModule(String)"
});
formatter.result({
  "duration": 1786336000,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageStepDefs.selectAddOn(DataTable)"
});
formatter.result({
  "duration": 8716217000,
  "status": "failed",
  "error_message": "java.lang.AssertionError: Addon Price is not correct\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat cukejvm.support.pages.AddOnPage.selectAddOn(AddOnPage.java:47)\n\tat cukejvm.step_definitions.CheckOutPageStepDefs.selectAddOn(CheckOutPageStepDefs.java:62)\n\tat ✽.And customer select Add-On with code:(cukejvm/simple_new_postpaid_order.feature:11)\n"
});
formatter.match({
  "location": "CheckOutPageStepDefs.inputNameDOB()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 443132000,
  "status": "passed"
});
formatter.after({
  "duration": 23000,
  "status": "passed"
});
});