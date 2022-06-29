package insee.stage.demo.repository;

import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.RequiredNomenclatures;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface RequiredNomenclatureRepository extends MongoRepository<RequiredNomenclatures, String> {
    @Query("{'name': ?0}")
    Optional<RequiredNomenclatures> findByName(String name);
}
