package insee.stage.demo.repository;

import insee.stage.demo.model.Questionnaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface QuestionnaireRepository extends MongoRepository<Questionnaire, String> {
    @Query("{'name': ?0}")
    Optional<Questionnaire> findByName(String name);
}
