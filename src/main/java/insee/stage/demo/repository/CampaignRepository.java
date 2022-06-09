package insee.stage.demo.repository;

import insee.stage.demo.model.Campaign;
import insee.stage.demo.model.Metadata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CampaignRepository extends MongoRepository<Campaign, String> {
    @Query("{'name': ?0}")
    Optional<Campaign> findByName(String name);
}
