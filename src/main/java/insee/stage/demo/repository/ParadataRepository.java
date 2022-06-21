package insee.stage.demo.repository;

import insee.stage.demo.model.Paradata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ParadataRepository extends MongoRepository<Paradata, String> {


    }

