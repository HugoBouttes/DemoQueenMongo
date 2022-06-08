package insee.stage.demo.repository;

import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.Required_nomenclatures;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface RequiredNomenclatureRepository extends MongoRepository<Required_nomenclatures, String> {
    @Query("{'name': ?0}")
    Optional<Paradata> findByName(String name);
}
