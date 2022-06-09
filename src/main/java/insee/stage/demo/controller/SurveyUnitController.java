package insee.stage.demo.controller;


import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.Required_nomenclatures;
import insee.stage.demo.model.Statedata;
import insee.stage.demo.model.SurveyUnit;
import insee.stage.demo.service.RequiredNomenclatureService;
import insee.stage.demo.service.SurveyUnitService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/survey-units")
public class SurveyUnitController {

    private final SurveyUnitService surveyUnitService;

    public SurveyUnitController(SurveyUnitService surveyUnitService){
        this.surveyUnitService = surveyUnitService;
    }

    /** GET Required Nomenclature **/
    @GetMapping
    public ResponseEntity<List<SurveyUnit>> getAllSurveyUnit() {
        return ResponseEntity.ok(surveyUnitService.getAllSurveyUnit());
    }

    /** PUT state-data **/
    @PutMapping("/{id}/state-data")
    public ResponseEntity updateStateDataById(@PathVariable String id, @RequestBody Statedata stateData){
        SurveyUnit surveyUnit = surveyUnitService.getSurveyUnitById(id);
        surveyUnitService.updateSurveyUnitStateData(surveyUnit, stateData);
        return ResponseEntity.ok().build();
    }

    /** PUT data **/
    @PutMapping("/{id}/data")
    public ResponseEntity updateDataById(@PathVariable String id, @RequestBody JSONObject data){
        SurveyUnit surveyUnit = surveyUnitService.getSurveyUnitById(id);
        surveyUnitService.updateSurveyUnitData(surveyUnit, data);
        return ResponseEntity.ok().build();
    }







    /** @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteExpense(@PathVariable String  id) {
        surveyUnitService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    } **/
}
