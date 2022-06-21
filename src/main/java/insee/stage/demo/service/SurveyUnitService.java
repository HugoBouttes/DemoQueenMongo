package insee.stage.demo.service;

import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.Required_nomenclatures;
import insee.stage.demo.model.Statedata;
import insee.stage.demo.model.SurveyUnit;
import insee.stage.demo.repository.RequiredNomenclatureRepository;
import insee.stage.demo.repository.SurveyUnitRepository;
import org.bson.json.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SurveyUnitService {

    private final SurveyUnitRepository surveyUnitRepository;

    public SurveyUnitService(SurveyUnitRepository surveyUnitRepository){
        this.surveyUnitRepository = surveyUnitRepository;
    }

    public List<SurveyUnit> getAllSurveyUnit() {
        return surveyUnitRepository.findAll();
    }

    public SurveyUnit getSurveyUnitById(String id){
        return surveyUnitRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot fin survey units by Id %s", id)));
    }
    public void updateSurveyUnitStateData(SurveyUnit surveyUnit, Statedata stateData) {
        surveyUnit.setStatedata(stateData);
        surveyUnitRepository.save(surveyUnit);
    }

    public void addSurveyUnit(SurveyUnit surveyUnit) {surveyUnitRepository.save(surveyUnit);}


    public void updateSurveyUnitData(SurveyUnit surveyUnit, JSONObject data) {
        surveyUnit.setData(data);
        surveyUnitRepository.save(surveyUnit);
    }
    
}
