package insee.stage.demo.controller;


import insee.stage.demo.model.Statedata;
import insee.stage.demo.model.SurveyUnit;
import insee.stage.demo.service.SurveyUnitService;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/survey-units")
public class SurveyUnitController {


    private final SurveyUnitService surveyUnitService;

    public SurveyUnitController(SurveyUnitService surveyUnitService){
        this.surveyUnitService = surveyUnitService;
    }


    @GetMapping
    public ResponseEntity<List<SurveyUnit>> getAllSurveyUnit() {
        return ResponseEntity.ok(surveyUnitService.getAllSurveyUnit());
    }

    /** PUT state-data **/

    @PutMapping("/{id}/state-data")
    public ResponseEntity updateStateDataById(@PathVariable String id, @RequestBody Statedata stateData){
        System.out.println("Put state-data " + id);
        SurveyUnit surveyUnit = surveyUnitService.getSurveyUnitById(id);
        System.out.println(stateData.toString());
        surveyUnitService.updateSurveyUnitStateData(surveyUnit, stateData);
        return ResponseEntity.ok().build();
    }

    /** PUT data **/
    @PutMapping("/{id}/data")
    public ResponseEntity updateDataById(@PathVariable(value = "id") String id, @RequestBody String data)  {
        JSONObject json = new JSONObject(data);
        SurveyUnit surveyUnit = surveyUnitService.getSurveyUnitById(id);
        surveyUnitService.updateSurveyUnitData(surveyUnit, json);
        return ResponseEntity.ok().build();
    }

    /** @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) **/
    @PostMapping()
    public ResponseEntity.BodyBuilder addSurveyUnit(@RequestBody SurveyUnit surveyUnit) {
        surveyUnitService.addSurveyUnit(surveyUnit);
        return  ResponseEntity.status(HttpStatus.CREATED);
    }



    @GetMapping("/{id}")
    public ResponseEntity<SurveyUnit> getSurveyUnitById(@PathVariable String  id) {
        return ResponseEntity.ok(surveyUnitService.getSurveyUnitById(id));
    }



    /** @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteExpense(@PathVariable String  id) {
        surveyUnitService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    } **/
}
