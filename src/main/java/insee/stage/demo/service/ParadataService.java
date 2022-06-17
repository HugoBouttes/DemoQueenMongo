package insee.stage.demo.service;


import insee.stage.demo.model.Paradata;
import insee.stage.demo.repository.ParadataRepository;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParadataService {

    private final ParadataRepository paradataRepository;

    public ParadataService(ParadataRepository paradataRepository){
        this.paradataRepository = paradataRepository;
    }

    public void addParadata(Paradata paradata) {paradataRepository.save(paradata);}


    public List<Paradata> getAllParadata() {
        Paradata matcherObject = new Paradata();
        matcherObject.setIdSU("0");
        JSONArray ja = new JSONArray();
        matcherObject.setEvents(ja);
        ExampleMatcher matcher = ExampleMatcher.matching();
        Example<Paradata> example = Example.of(matcherObject,matcher);
        return paradataRepository.findAll(example);
    }


}
