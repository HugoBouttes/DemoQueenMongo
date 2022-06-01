package insee.stage.demo.repository;

import insee.stage.demo.model.Nomenclature;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface NomenclatureRepository extends MongoRepository<Nomenclature, String> {
    @Query("{'name': ?0}")
    Optional<Nomenclature> findByName(String name);
}
