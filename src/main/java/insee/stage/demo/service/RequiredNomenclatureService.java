package insee.stage.demo.service;


import insee.stage.demo.model.RequiredNomenclatures;
import insee.stage.demo.repository.RequiredNomenclatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequiredNomenclatureService {

    private final RequiredNomenclatureRepository requiredNomenclatureRepository;

    public RequiredNomenclatureService(RequiredNomenclatureRepository requiredNomenclatureRepository){
        this.requiredNomenclatureRepository = requiredNomenclatureRepository;
    }
    public RequiredNomenclatures getRequiredNomenclatureById(String id){
        return requiredNomenclatureRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot fin survey units by Id %s", id)));
    }

    public List<RequiredNomenclatures> getAllReqNomenclature() {
        return requiredNomenclatureRepository.findAll();
    }
}
