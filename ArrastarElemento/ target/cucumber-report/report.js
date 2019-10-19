$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/teste.feature");
formatter.feature({
  "name": "Arrastar e soltar",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@arrastarEsoltar"
    }
  ]
});
formatter.scenario({
  "name": "dragAndDrop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@arrastarEsoltar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu arrastar um elemento sobre o outro",
  "keyword": "When "
});
formatter.match({
  "location": "testeSteps.eu_arrastar_um_elemento_sobre_o_outro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o drag and drop funcionou",
  "keyword": "Then "
});
formatter.match({
  "location": "testeSteps.o_drag_and_drop_funcionou()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});