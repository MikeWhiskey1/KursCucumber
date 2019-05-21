$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/training.feature");
formatter.feature({
  "name": "training",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "a test without purpose",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "something is done",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.somethingIsDone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"sample word\" is printed",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.isPrinted(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "22 is printed correctly",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.isPrintedCorrectly(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we can use a list a well",
  "rows": [
    {
      "cells": [
        "cat"
      ]
    },
    {
      "cells": [
        "dog"
      ]
    },
    {
      "cells": [
        "lion"
      ]
    }
  ],
  "keyword": "But "
});
formatter.match({
  "location": "MyStepdefs.weCanUseAListAWell(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.step({
  "name": "now \u003cperson\u003e trying",
  "keyword": "When "
});
formatter.step({
  "name": "sings \u003chow\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "how",
        "person"
      ]
    },
    {
      "cells": [
        "ugly",
        "me"
      ]
    },
    {
      "cells": [
        "beautiful",
        "you"
      ]
    }
  ]
});
formatter.scenario({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.peopleTryingSinging()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "now me trying",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.nowPersonTrying(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sings ugly",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.singsHow(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "singing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "people trying singing",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.peopleTryingSinging()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "now you trying",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.nowPersonTrying(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sings beautiful",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.singsHow(String)"
});
formatter.result({
  "status": "passed"
});
});