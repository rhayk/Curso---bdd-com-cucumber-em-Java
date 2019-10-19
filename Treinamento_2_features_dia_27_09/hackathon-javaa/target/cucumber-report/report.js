$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ArrastarESoltar.feature");
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
  "location": "ArrastarESoltarSteps.euArrastarUmElementoSobreOOutro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o drag and drop funcionou",
  "keyword": "Then "
});
formatter.match({
  "location": "ArrastarESoltarSteps.oDragAndDropFuncionou()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});