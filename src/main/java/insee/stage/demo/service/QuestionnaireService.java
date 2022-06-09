package insee.stage.demo.service;


import insee.stage.demo.model.Metadata;
import insee.stage.demo.model.Questionnaire;
import insee.stage.demo.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireService {


    private final QuestionnaireRepository questionnaireRepository ;


    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public Questionnaire getQuestionnaireById(String id){
        return questionnaireRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot fin survey units by Id %s", id)));
    }

    public List<Questionnaire> getAllQuestionnaire() {
        return questionnaireRepository.findAll();
    }
}
