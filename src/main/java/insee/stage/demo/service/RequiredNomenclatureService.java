package insee.stage.demo.service;


import com.mongodb.CreateIndexCommitQuorum;
import insee.stage.demo.model.Paradata;
import insee.stage.demo.model.Questionnaire;
import insee.stage.demo.model.Required_nomenclatures;
import insee.stage.demo.repository.ParadataRepository;
import insee.stage.demo.repository.RequiredNomenclatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequiredNomenclatureService {

    private final RequiredNomenclatureRepository requiredNomenclatureRepository;

    public RequiredNomenclatureService(RequiredNomenclatureRepository requiredNomenclatureRepository){
        this.requiredNomenclatureRepository = requiredNomenclatureRepository;
    }
    public Required_nomenclatures getRequiredNomenclatureById(String id){
        return requiredNomenclatureRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot fin survey units by Id %s", id)));
    }

    public List<Required_nomenclatures> getAllReqNomenclature() {
        return requiredNomenclatureRepository.findAll();
    }
}
