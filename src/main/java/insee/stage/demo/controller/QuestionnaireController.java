package insee.stage.demo.controller;


import insee.stage.demo.model.Metadata;
import insee.stage.demo.model.Questionnaire;
import insee.stage.demo.service.QuestionnaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class QuestionnaireController {

    private final QuestionnaireService questionnaireService;

    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @GetMapping("questionnaire")
    public ResponseEntity<List<Questionnaire>> getAllQuestionnaire() {
        return ResponseEntity.ok(questionnaireService.getAllQuestionnaire());
    }

    @GetMapping("campaign/{id}/questionnaire")
    public ResponseEntity<Questionnaire> getQuestionnaireById(@PathVariable String id) {
        return ResponseEntity.ok(questionnaireService.getQuestionnaireById(id));
    }
}
