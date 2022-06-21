package insee.stage.demo.controller;


import insee.stage.demo.model.Questionnaire;
import insee.stage.demo.model.Required_nomenclatures;
import insee.stage.demo.service.RequiredNomenclatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/required-nomenclatures")
public class RequiredNomenclatureController {

    private final RequiredNomenclatureService requiredNomenclatureService;

    public RequiredNomenclatureController(RequiredNomenclatureService requiredNomenclatureService){
        this.requiredNomenclatureService = requiredNomenclatureService;
    }


    /** GET Required Nomenclature **/
    @GetMapping()
    public ResponseEntity<List<Required_nomenclatures>> getAllReqNomenclature() {
        return ResponseEntity.ok(requiredNomenclatureService.getAllReqNomenclature());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Required_nomenclatures> getQuestionnaireById(@PathVariable String id) {
        return ResponseEntity.ok(requiredNomenclatureService.getRequiredNomenclatureById(id));
    }

}
